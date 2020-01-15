package com.example.eshopbd.all_recycler_view_code.construction_materials_product_subcatagory_recycler.all_adapter_class.cement_recycle_product_package;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.eshopbd.R;
import com.example.eshopbd.all_recycler_view_code.construction_materials_product_subcatagory_recycler.all_company_model_class.cement_recycle_product_package_model.Cement_products_all_model;

import java.util.ArrayList;

public class Cement_products_all_adapter extends RecyclerView.Adapter<Cement_products_all_adapter.ViewHolder_Cement_products> {
    private Context context ;
    private ArrayList<Cement_products_all_model>cement_products_all_models;
    private Cement_item_click cement_item_click;

    public Cement_products_all_adapter(Context context, ArrayList<Cement_products_all_model> cement_products_all_models,Cement_item_click cement_item_click) {
        this.context = context;
        this.cement_products_all_models = cement_products_all_models;
        this.cement_item_click = cement_item_click;
    }

    @NonNull
    @Override
    public ViewHolder_Cement_products onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View V_CEMENT_PRODUCTS = inflater.inflate(R.layout.cement_products_all,parent,false);
        return new ViewHolder_Cement_products(V_CEMENT_PRODUCTS);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder_Cement_products holder, int position) {
  holder.cement_image.setImageResource(cement_products_all_models.get(position).getImage_cement());
  holder.cement_previous_price.setText(cement_products_all_models.get(position).getP_cement_prev_price());
  holder.cement_current_price.setText(cement_products_all_models.get(position).getP_cement_current_price());
  holder.cement_name.setText(cement_products_all_models.get(position).getP_cement_name());

    }

    @Override
    public int getItemCount() {
        return cement_products_all_models.size();
    }

    class ViewHolder_Cement_products extends RecyclerView.ViewHolder{

TextView cement_name,cement_previous_price,cement_current_price;
ImageView cement_image;
        public ViewHolder_Cement_products(@NonNull View itemView) {
            super(itemView);
            cement_name = itemView.findViewById(R.id.product_name_cement);

            cement_current_price= itemView.findViewById(R.id.product_current_price_cement);
            cement_previous_price= itemView.findViewById(R.id.product_prev_price_cement);
            cement_image= itemView.findViewById(R.id.core_image_cement);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    cement_item_click.On_click_cementProducts(cement_products_all_models.get(getAdapterPosition()));
                }
            });
        }
    }

    public interface Cement_item_click{

        void On_click_cementProducts(Cement_products_all_model cement_products_all_model);
    }
}
