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
import com.example.eshopbd.all_recycler_view_code.lighting_gallery.model_light.Garden_model;

import java.util.ArrayList;

public class Garden_adapter extends RecyclerView.Adapter<Garden_adapter.Graden_ViewHolder_item> {
    private Context context;
    private ArrayList<Garden_model>garden_models;

    public Garden_adapter(Context context, ArrayList<Garden_model> garden_models) {
        this.context = context;
        this.garden_models = garden_models;
    }

    @NonNull
    @Override
    public Graden_ViewHolder_item onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View v_garden = layoutInflater.inflate(R.layout.garden_lighting_recycle_item_page,parent,false);
        return new Graden_ViewHolder_item(v_garden);
    }

    @Override
    public void onBindViewHolder(@NonNull Graden_ViewHolder_item holder, int position) {
        holder.image_garden.setImageResource(garden_models.get(position).getImage_garden_light());
        holder.name_garden.setText(garden_models.get(position).get_product_name());
        holder.description_garden.setText(garden_models.get(position).getProduct_description());
        holder.price_garden.setText(garden_models.get(position).getPrice_of_product());
        holder.discount_product_garden.setText(garden_models.get(position).getDiscount_of_product());
    }

    @Override
    public int getItemCount() {
        return garden_models.size();
    }

    class Graden_ViewHolder_item   extends RecyclerView.ViewHolder{
  TextView name_garden , price_garden, discount_product_garden, description_garden;
  ImageView image_garden;

        public Graden_ViewHolder_item(@NonNull View itemView) {
            super(itemView);
            name_garden = itemView.findViewById(R.id.garden_product_name);
            price_garden = itemView.findViewById(R.id.garden_Price_of_product);
            discount_product_garden = itemView.findViewById(R.id.garden_discount);
            description_garden = itemView.findViewById(R.id.garden_product_description);
            image_garden= itemView.findViewById(R.id.core_image_garden_lighting);
        }
    }
}
