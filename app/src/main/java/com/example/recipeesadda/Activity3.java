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
import android.widget.ImageView;
import android.widget.TextView;


public class Activity3 extends AppCompatActivity {
    RecyclerView recyclerView;
    List<ModelClass2> model2;
    ImageView img;
    TextView heading,quantity,ingr1,ingr2,ingr3,ingr4,proc1,proc2,proc3,proc4 ,viewmoreing,viewmoreprocd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);
heading = findViewById(R.id.headingactivity3);
        quantity = findViewById(R.id.quantityactivity3);

        ingr1 = findViewById(R.id.ing1activity3);
        ingr2 = findViewById(R.id.ing2activity3);
        ingr3 = findViewById(R.id.ing3activity3);
        ingr4 = findViewById(R.id.ing4activity3);
        proc1 = findViewById(R.id.proc1activity3);
        proc2 = findViewById(R.id.proc2activity3);
        proc3 = findViewById(R.id.proc3activity3);
        proc4 = findViewById(R.id.proc4activity3);
        viewmoreing = findViewById(R.id.viewMoreingactivity3);
        viewmoreprocd = findViewById(R.id.viewMoreprocactivity3);

    }

    private void northIndian()
    {

    }

    private void punjabi()
    {
    }
    private void southIndian()
    {
    }


}
