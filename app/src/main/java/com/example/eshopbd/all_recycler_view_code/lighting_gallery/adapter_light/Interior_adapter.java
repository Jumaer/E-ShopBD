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
import com.example.eshopbd.all_recycler_view_code.lighting_gallery.model_light.Interior_model;

import java.util.ArrayList;

public class Interior_adapter extends RecyclerView.Adapter<Interior_adapter.Interior_viewHolder> {
    private Context context;
    private ArrayList<Interior_model>interior_models;

    public Interior_adapter(Context context, ArrayList<Interior_model> interior_models) {
        this.context = context;
        this.interior_models = interior_models;
    }

    @NonNull
    @Override
    public Interior_viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View V_layoint_light = layoutInflater.inflate(R.layout.interior_lighting_recycle_item_page,parent,false);
        return  new Interior_viewHolder(V_layoint_light);
    }

    @Override
    public void onBindViewHolder(@NonNull Interior_viewHolder holder, int position) {
        holder.inImage.setImageResource(interior_models.get(position).getIn_product_image());
        holder.nameex_i.setText(interior_models.get(position).getIn_product_name());
        holder.descriptionex_i.setText(interior_models.get(position).getIn_product_description());
        holder.dicountex_i.setText(interior_models.get(position).getIn_product_discount());
        holder.priceex_i.setText(interior_models.get(position).getIn_product_price());

    }

    @Override
    public int getItemCount() {
        return interior_models.size();
    }

    class Interior_viewHolder extends RecyclerView.ViewHolder{
        TextView nameex_i,descriptionex_i,priceex_i,dicountex_i;
        ImageView inImage;


        public Interior_viewHolder(@NonNull View itemView) {
            super(itemView);
            nameex_i = itemView.findViewById(R.id.in_product_name);
          descriptionex_i = itemView.findViewById(R.id.in_product_description);
      dicountex_i = itemView.findViewById(R.id.in_discount);
            priceex_i = itemView.findViewById(R.id.in_Price_of_product);
            inImage= itemView.findViewById(R.id.core_image_interior_lighting);
        }
    }
}
