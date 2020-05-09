package com.example.recipeesadda;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.InputStream;

public class Signuppage extends AppCompatActivity {
    Button L2,S2;

    private ProgressDialog progressDialog;
    EditText name,address,email,password,contactno;
    Button loginButton;
    TextView loginupLink;
    InputStream is=null;
    String result=null;
    String line=null;

    int code;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signuppage);
        name = findViewById(R.id.Name);
        progressDialog = new ProgressDialog(this);

        address = findViewById(R.id.Address);
        email = findViewById(R.id.Email);
        password = findViewById(R.id.password);
        contactno = findViewById(R.id.contactno);
        loginButton = findViewById(R.id.btn_signup);
        L2 = findViewById(R.id.L2);
        L2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i  = new Intent(getApplicationContext(),Login.class);
                startActivity(i);
            }
        });


        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);



    }
}
