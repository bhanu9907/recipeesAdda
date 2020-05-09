package com.example.recipeesadda;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterClass2 extends RecyclerView.Adapter<AdapterClass2.viewholder2> {
    private LayoutInflater inflater;
    private List<ModelClass2> md;
    private Context ctxfrag2;
    public AdapterClass2(Context mctx, List<ModelClass2> md) {
        inflater =LayoutInflater.from(mctx);
        this.md = md;
        ctxfrag2=mctx;
    }

    @NonNull

    @Override
    public AdapterClass2.viewholder2 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_layout2, parent, false);
        AdapterClass2.viewholder2 holder = new AdapterClass2.viewholder2(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder2 holder, final int position) {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
            holder.rt.setBackground(md.get(position).getImg());
        }
        holder.heading.setText(md.get(position).getTxt1());
        holder.Description.setText(md.get(position).getTxt2());
        holder.Price.setText(md.get(position).getTxt3());
        holder.bar.setRating(md.get(position).getRt());
        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ctxfrag2,md.get(position).getTxt1(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(ctxfrag2, Activity3.class);
                intent.putExtra("EXTRA_SESSION_ID",md.get(position).getTxt1());
                ctxfrag2.startActivity(intent);
            }
        });

    }


    @Override
    public int getItemCount() {
        return md.size();
    }

    public  class viewholder2 extends RecyclerView.ViewHolder{
        TextView heading;
        TextView Description;
        TextView Price;
        RatingBar bar;
        ImageView rt;
        LinearLayout linearLayout;
        public viewholder2(View itemView) {
            super(itemView);
            rt = itemView.findViewById(R.id.img44);
            heading = itemView.findViewById(R.id.txt22);
            Description = itemView.findViewById(R.id.des);
            Price = itemView.findViewById(R.id.price1);
            bar = itemView.findViewById(R.id.rating);
            linearLayout=itemView.findViewById(R.id.linearfrag2);

        }
    }
}

