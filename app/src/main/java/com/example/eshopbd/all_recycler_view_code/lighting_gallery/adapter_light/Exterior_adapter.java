package com.example.eshopbd.all_recycler_view_code.lighting_gallery.adapter_light;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.eshopbd.R;
import com.example.eshopbd.all_recycler_view_code.lighting_gallery.model_light.Exterior_model;

import java.util.ArrayList;

public class Exterior_adapter extends RecyclerView.Adapter<Exterior_adapter.Exterior_view_holder> {
    private Context context;
    private ArrayList<Exterior_model>exterior_models;

    public Exterior_adapter(Context context, ArrayList<Exterior_model> exterior_models) {
        this.context = context;
        this.exterior_models = exterior_models;
    }

    @NonNull
    @Override
    public Exterior_view_holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View v_ex_light = layoutInflater.inflate(R.layout.exterior_lighting_recycle_item_page,parent,false);
        return new Exterior_view_holder(v_ex_light);
    }

    @Override
    public void onBindViewHolder(@NonNull Exterior_view_holder holder, int position) {
     holder.ex_discount.setText(exterior_models.get(position).getexProduct_discount());
     holder.ex_name.setText(exterior_models.get(position).getEx_product_name());
     holder.ex_image.setImageResource(exterior_models.get(position).getEx_product_image());
     holder.ex_description.setText(exterior_models.get(position).getEx_description());
     holder.ex_price.setText(exterior_models.get(position).getEx_product_price());
    }

    @Override
    public int getItemCount() {
        return exterior_models.size();
    }

    class Exterior_view_holder extends RecyclerView.ViewHolder{
        ImageView ex_image;
        TextView ex_name,ex_description,ex_price,ex_discount;

        public Exterior_view_holder(@NonNull View itemView) {
            super(itemView);
            ex_image = itemView.findViewById(R.id.core_image_exterior_lighting);
            ex_name = itemView.findViewById(R.id.ex_product_name);
            ex_discount = itemView.findViewById(R.id.ex_discount);
            ex_price = itemView.findViewById(R.id.ex_Price_of_product);
            ex_description = itemView.findViewById(R.id.ex_product_description);
        }
    }
}
