package com.example.eshopbd.all_recycler_view_code.all_products_recycle.adapter_all;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.eshopbd.R;
import com.example.eshopbd.all_recycler_view_code.all_products_recycle.model_all.All_products_model;

import java.util.ArrayList;

public class All_products_view_adapter extends RecyclerView.Adapter<All_products_view_adapter.ViewHolder_All_products> {
    private Context context ;
    private ArrayList<All_products_model>all_products_models;

    public All_products_view_adapter(Context context, ArrayList<All_products_model> all_products_models) {
        this.context = context;
        this.all_products_models = all_products_models;
    }

    @NonNull
    @Override
    public ViewHolder_All_products onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View v_layout_all_product = layoutInflater.inflate(R.layout.all_products_display,parent,false);
        return new ViewHolder_All_products(v_layout_all_product);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder_All_products holder, int position) {
        holder.all_products_image.setImageResource(all_products_models.get(position).getAll_product_image_core());
        holder.all_products_name.setText(all_products_models.get(position).getAll_product_name());
        holder.all_products_previous_price.setText(all_products_models.get(position).getAll_product_prev_price());
        holder.all_products_discount.setText(all_products_models.get(position).getAll_product_discount());
        holder.all_products_current_price.setText(all_products_models.get(position).getAll_product_current_price());
        holder.all_product_description.setText(all_products_models.get(position).getAll_product_description());

    }

    @Override
    public int getItemCount() {
        return all_products_models.size();
    }

    class ViewHolder_All_products extends RecyclerView.ViewHolder{
       TextView all_products_name,all_products_discount,all_products_previous_price,all_product_description,all_products_current_price;
       ImageView all_products_image;

        public ViewHolder_All_products(@NonNull View itemView) {
            super(itemView);
            all_products_name = itemView.findViewById(R.id.all_product_name);
            all_products_current_price = itemView.findViewById(R.id.all_product_current_price);
            all_products_discount = itemView.findViewById(R.id.all_product_discount);
            all_products_previous_price = itemView.findViewById(R.id.all_product_prev_price);
            all_products_image =itemView.findViewById(R.id.all_product_image_core);
            all_product_description = itemView.findViewById(R.id.all_product_description);

        }
    }
}
