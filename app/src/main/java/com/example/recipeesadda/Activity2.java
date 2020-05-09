package com.example.recipeesadda;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


public class Activity2 extends AppCompatActivity {
    RecyclerView recyclerView;
    List<ModelClass2> model2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newpage);
        recyclerView= findViewById(R.id.recyclerview33);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        model2 =new ArrayList<>();
        String sessionId = getIntent().getStringExtra("EXTRA_SESSION_ID");
        if (sessionId != null) {
            switch(sessionId){

                case "South Indian":
                    southIndian();
                    break;

                case "North Indian":
                    northIndian();
                    break;
            }
        }

        }

    private void northIndian()
    {

        Resources res = getResources(); //resource handle
        model2.add(new ModelClass2(res.getDrawable(R.drawable.foodone),"Breakfast1","40 Recipes","Rs.100",3.5f));
        model2.add(new ModelClass2(res.getDrawable(R.drawable.foodtwo),"Breakfast2","40 Recipes","Rs.100",3.5f));
        model2.add(new ModelClass2(res.getDrawable(R.drawable.foodthree),"Breakfast3","40 Recipes","Rs.100",3.5f));
        model2.add(new ModelClass2(res.getDrawable(R.drawable.foodfour),"Breakfast","40 Recipes","Rs.100",3.5f));
        model2.add(new ModelClass2(res.getDrawable(R.drawable.foodfive),"Breakfast","40 Recipes","Rs.100",3.5f));
        model2.add(new ModelClass2(res.getDrawable(R.drawable.foodsix),"Breakfast","40 Recipes","Rs.100",3.5f));
        AdapterClass2 adapter2 =new AdapterClass2(getApplicationContext(),model2);
        recyclerView.setAdapter(adapter2);
    }

    private void punjabi()
    {

        Resources res = getResources(); //resource handle
        model2.add(new ModelClass2(res.getDrawable(R.drawable.foodone),"Breakfast","40 Recipes","Rs.100",3.5f));
        model2.add(new ModelClass2(res.getDrawable(R.drawable.foodtwo),"Breakfast","40 Recipes","Rs.100",3.5f));
        model2.add(new ModelClass2(res.getDrawable(R.drawable.foodthree),"Breakfast","40 Recipes","Rs.100",3.5f));
        model2.add(new ModelClass2(res.getDrawable(R.drawable.foodfour),"Breakfast","40 Recipes","Rs.100",3.5f));
        model2.add(new ModelClass2(res.getDrawable(R.drawable.foodfive),"Breakfast","40 Recipes","Rs.100",3.5f));
        model2.add(new ModelClass2(res.getDrawable(R.drawable.foodsix),"Breakfast","40 Recipes","Rs.100",3.5f));
        AdapterClass2 adapter2 =new AdapterClass2(getApplicationContext(),model2);
        recyclerView.setAdapter(adapter2);
    }
    private void southIndian()
    {

        Resources res = getResources(); //resource handle
        model2.add(new ModelClass2(res.getDrawable(R.drawable.foodone),"Breakfastaa","40 Recipes","Rs.100",3.5f));
        model2.add(new ModelClass2(res.getDrawable(R.drawable.foodtwo),"Breakfastbb","40 Recipes","Rs.100",3.5f));
        model2.add(new ModelClass2(res.getDrawable(R.drawable.foodthree),"Breakfast","40 Recipes","Rs.100",3.5f));
        model2.add(new ModelClass2(res.getDrawable(R.drawable.foodfour),"Breakfast","40 Recipes","Rs.100",3.5f));
        model2.add(new ModelClass2(res.getDrawable(R.drawable.foodfive),"Breakfast","40 Recipes","Rs.100",3.5f));
        model2.add(new ModelClass2(res.getDrawable(R.drawable.foodsix),"Breakfast","40 Recipes","Rs.100",3.5f));
        AdapterClass2 adapter2 =new AdapterClass2(getApplicationContext(),model2);
        recyclerView.setAdapter(adapter2);
    }


}
