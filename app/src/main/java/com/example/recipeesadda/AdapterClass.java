package com.example.recipeesadda;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterClass extends RecyclerView.Adapter<AdapterClass.viewholder2> {
    private LayoutInflater inflater;
    private List<ModelClass> md;
    private Context ctx;
    public AdapterClass(Context mctx, List<ModelClass> md) {
        inflater =LayoutInflater.from(mctx);
        this.md = md;
        ctx=mctx;
    }

    @NonNull

    @Override
    public AdapterClass.viewholder2 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_layout, parent, false);
        AdapterClass.viewholder2 holder = new AdapterClass.viewholder2(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder2 holder, final int position) {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
            holder.rt.setBackground(md.get(position).getImage());
        }
        holder.heading.setText(md.get(position).getTextview1());
        holder.heading2.setText(md.get(position).getTextview2());

        holder.l1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(ctx,  md.get(position).getTextview1(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(ctx, Activity2.class);
                intent.putExtra("EXTRA_SESSION_ID",md.get(position).getTextview1());
                ctx.startActivity(intent);
            }
        });

    }


    @Override
    public int getItemCount() {
        return md.size();
    }

    public  class viewholder2 extends RecyclerView.ViewHolder{
        TextView heading;
        TextView heading2;
        ImageView rt;

        RelativeLayout l1;
        public viewholder2(View itemView) {
            super(itemView);
            rt = itemView.findViewById(R.id.rel1);
            heading = itemView.findViewById(R.id.t1);
            heading2 = itemView.findViewById(R.id.t2);
            l1 = itemView.findViewById(R.id.rel22);



        }
    }
}
