package com.example.eshopbd.all_recycler_view_code.electrical_product_recycle.electrical_adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.eshopbd.R;
import com.example.eshopbd.all_recycler_view_code.electrical_product_recycle.electrical_model.Db_box_electrical_model;

import java.util.ArrayList;

public class Db_box_electrical_adapter extends RecyclerView.Adapter<Db_box_electrical_adapter.Db_box_electrical_viewHolder> {
    private Context context ;
    private ArrayList<Db_box_electrical_model>db_box_electrical_models;

    public Db_box_electrical_adapter(Context context, ArrayList<Db_box_electrical_model> db_box_electrical_models) {
        this.context = context;
        this.db_box_electrical_models = db_box_electrical_models;
    }

    @NonNull
    @Override
    public Db_box_electrical_viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View v_db_electrical_box = layoutInflater.inflate(R.layout.electrical_db_boxitem_recycle,parent,false);
        return new Db_box_electrical_viewHolder(v_db_electrical_box);
    }

    @Override
    public void onBindViewHolder(@NonNull Db_box_electrical_viewHolder holder, int position) {
    holder.image_product_db.setImageResource(db_box_electrical_models.get(position).getImage_db_product());
    holder.product_current_price.setText(db_box_electrical_models.get(position).getDb_product_current_price());
    holder.p_prev_price.setText(db_box_electrical_models.get(position).getDb_product_prev_price());
    holder.p_name_db.setText(db_box_electrical_models.get(position).getDb_product_name());
    holder.p_description_db.setText(db_box_electrical_models.get(position).getDb_product_description());
    }

    @Override
    public int getItemCount() {
        return db_box_electrical_models.size();
    }

    class Db_box_electrical_viewHolder extends RecyclerView.ViewHolder{
        TextView p_name_db,p_description_db,p_prev_price,product_current_price;
        ImageView image_product_db;

        public Db_box_electrical_viewHolder(@NonNull View itemView) {
            super(itemView);
            p_name_db = itemView.findViewById(R.id.product_name_electrical_db_box);
            p_description_db = itemView.findViewById(R.id.product_description_electrical_db_box);
            p_prev_price = itemView.findViewById(R.id.discount_product_electrical_db_box_price);
            product_current_price = itemView.findViewById(R.id.price_of_product_electrical_db_box);
            image_product_db = itemView.findViewById(R.id.core_image_electrical_db_box);
        }
    }
}
