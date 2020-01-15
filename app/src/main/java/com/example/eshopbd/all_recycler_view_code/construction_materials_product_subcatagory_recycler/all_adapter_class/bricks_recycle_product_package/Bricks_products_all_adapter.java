package com.example.eshopbd.all_recycler_view_code.construction_materials_product_subcatagory_recycler.all_adapter_class.bricks_recycle_product_package;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.eshopbd.R;
import com.example.eshopbd.all_recycler_view_code.construction_materials_product_subcatagory_recycler.all_company_model_class.bricks_recycle_product_package_model.Bricks_product_all_model;

import java.util.ArrayList;

public class Bricks_products_all_adapter extends RecyclerView.Adapter<Bricks_products_all_adapter.View_Holder_brick_all_products> {
    private Context context;
    private ArrayList<Bricks_product_all_model>bricks_product_all_models;
    Brick_product_onclick brick_product_onclick;

    public Bricks_products_all_adapter(Context context, ArrayList<Bricks_product_all_model> bricks_product_all_models, Brick_product_onclick brick_product_onclick) {
        this.context = context;
        this.bricks_product_all_models = bricks_product_all_models;
        this.brick_product_onclick = brick_product_onclick;
    }

    @NonNull
    @Override
    public View_Holder_brick_all_products onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View brick_products = layoutInflater.inflate(R.layout.brick_product_all,parent,false);
        return new View_Holder_brick_all_products(brick_products);
    }

    @Override
    public void onBindViewHolder(@NonNull View_Holder_brick_all_products holder, int position) {
        holder.bricks_product_image.setImageResource(bricks_product_all_models.get(position).getProduct_image_brick());
        holder.product_name.setText(bricks_product_all_models.get(position).getProduct_name_brick());
        holder.product_previous_price.setText(bricks_product_all_models.get(position).getProduct_prev_brick());
        holder.product_current_price.setText(bricks_product_all_models.get(position).getCurrent_price_brick());
    }

    @Override
    public int getItemCount() {
        return bricks_product_all_models.size();
    }

    class View_Holder_brick_all_products extends RecyclerView.ViewHolder{

       ImageView bricks_product_image;
       TextView product_name,product_current_price,product_previous_price;
        public View_Holder_brick_all_products(@NonNull View itemView) {
            super(itemView);


            bricks_product_image = itemView.findViewById(R.id.core_image_brick);
            product_name = itemView.findViewById(R.id.product_name_brick);
            product_current_price = itemView.findViewById(R.id.product_current_price_brick);
            product_previous_price = itemView.findViewById(R.id.product_prev_price_brick);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    brick_product_onclick.onClick_brick_products(bricks_product_all_models.get(getAdapterPosition()));
                }
            });
        }
    }
    public interface Brick_product_onclick{

        void onClick_brick_products(Bricks_product_all_model bricks_product_all_model );
    }
}
