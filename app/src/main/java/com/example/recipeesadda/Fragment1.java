package com.example.recipeesadda;

import android.app.ProgressDialog;
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

public class Fragment1 extends Fragment {
    RecyclerView recyclerView;
    List<ModelClass> model1;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_sellingrecipes,null);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        recyclerView= view.findViewById(R.id.recyclerview22);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        model1 =new ArrayList<>();
        loadProducts();
    }

    private void loadProducts()
    {

        Resources res = getResources(); //resource handle
        model1.add(new ModelClass(res.getDrawable(R.drawable.foodone),"Breakfast","40 Recipes"));
        model1.add(new ModelClass(res.getDrawable(R.drawable.foodtwo),"Lunch","50 Recipes"));
        model1.add(new ModelClass(res.getDrawable(R.drawable.foodthree),"Dinner","85 Recipes"));
        model1.add(new ModelClass(res.getDrawable(R.drawable.foodfour),"South Indian","115 Recipes"));
        model1.add(new ModelClass(res.getDrawable(R.drawable.foodfive),"North Indian","66 Recipes"));
        model1.add(new ModelClass(res.getDrawable(R.drawable.foodsix),"Punjabi","140 Recipes"));
        AdapterClass adapter2 =new AdapterClass(getContext(),model1);
        recyclerView.setAdapter(adapter2);
    }
}
