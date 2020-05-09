package com.example.recipeesadda;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ProductsAdapter extends RecyclerView.Adapter<ProductsAdapter.ProductViewHolder> {


    private Context mCtx;
    private List<Product> productList;
    Product product;

    public ProductsAdapter(Context mCtx, List<Product> productList) {
        this.mCtx = mCtx;
        this.productList = productList;
    }

    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.product_list, null);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ProductViewHolder holder, int position) {
        product = productList.get(position);


        holder.name.setText(product.getName());
        holder.surname.setText(product.getSurname());
        holder.age.setText(String.valueOf(product.getAge()));
        holder.username.setText(product.getUsername());
        holder.password.setText(product.getPassword());
    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    class ProductViewHolder extends RecyclerView.ViewHolder {

        TextView name, age, surname, username,password;


        public ProductViewHolder(View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.textViewTitle);
            age = itemView.findViewById(R.id.textViewShortDesc);
            surname = itemView.findViewById(R.id.textViewRating);
            password = itemView.findViewById(R.id.textViewPrice2);
            username = itemView.findViewById(R.id.textViewPrice);

        }
    }
}