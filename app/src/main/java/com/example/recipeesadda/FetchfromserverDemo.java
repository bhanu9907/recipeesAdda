package com.example.recipeesadda;

import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class FetchfromserverDemo extends AppCompatActivity {
    RecyclerView recyclerView;
    EditText editText;
    TextView nameq,age ,surname,passwordq;
    Button search;
    private static final String URL_PRODUCTS = "http://digieducos.000webhostapp.com/employee_data/Api.php";
    Button addnewdata;
    //a list to store all the products
    List<Product> productList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fetchfromserver);
        recyclerView =findViewById(R.id.recylcerViewnewwww);
        editText =findViewById(R.id.edittexttest);
        nameq =findViewById(R.id.nametest);
        age =findViewById(R.id.agetest);
        surname =findViewById(R.id.surnametest);
        passwordq =findViewById(R.id.passwordtest);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ProductsAdapter adapter = new ProductsAdapter(getApplicationContext(), productList);
        recyclerView.setAdapter(adapter);

        //initializing the productlist
        productList = new ArrayList<>();

        //this method will fetch and parse json
        //to display it in recyclerview

        search =findViewById(R.id.search);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadProducts();
            }
        });

        addnewdata =findViewById(R.id.Insert);
        addnewdata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),UploadToserverDemo.class);
                startActivity(i);
            }
        });
    }

    private void loadProducts() {

        /*
         * Creating a String Request
         * The request type is GET defined by first parameter
         * The URL is defined in the second parameter
         * Then we have a Response Listener and a Error Listener
         * In response listener we will get the JSON response as a String
         * */
        StringRequest stringRequest = new StringRequest(Request.Method.GET, URL_PRODUCTS,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            //converting the string to json array object
                            JSONArray array = new JSONArray(response);

                            //traversing through all the object
                            for (int i = 0; i < array.length(); i++) {

                                //getting product object from json array
                                JSONObject product = array.getJSONObject(i);

                                //adding the product to product list
                                productList.add(new Product(
                                        product.getInt("id"),
                                        product.getString("name"),
                                        product.getString("surname"),
                                        product.getString("age"),
                                        product.getString("username"),
                                        product.getString("password")
                                        ,getApplicationContext()
                                ));
                                String usernamesearch = editText.getText().toString();
                                if (usernamesearch.equals(product.getString("username"))){
                                    nameq.setText(product.getString("name"));
                                    surname.setText(product.getString("surname"));
                                    passwordq.setText(product.getString("password"));
                                    age.setText(product.getString("age"));
                                }
                            }

                            //creating adapter object and setting it to recyclerview
                            ProductsAdapter adapter = new ProductsAdapter(getApplicationContext(), productList);
                            recyclerView.setAdapter(adapter);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                });

        //adding our stringrequest to queue
        Volley.newRequestQueue(this).add(stringRequest);
    }
}
