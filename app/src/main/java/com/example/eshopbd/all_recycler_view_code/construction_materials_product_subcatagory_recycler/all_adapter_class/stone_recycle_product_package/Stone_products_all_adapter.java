package com.example.eshopbd.all_recycler_view_code.construction_materials_product_subcatagory_recycler.all_adapter_class.stone_recycle_product_package;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.eshopbd.R;
import com.example.eshopbd.all_recycler_view_code.construction_materials_product_subcatagory_recycler.all_company_model_class.stone_recycle_product_package_model.Stone_product_all_model;

import java.util.ArrayList;

public class Stone_products_all_adapter extends RecyclerView.Adapter<Stone_products_all_adapter.Stone_products_view_holder> {
    private Context context;
    private ArrayList<Stone_product_all_model>stone_product_all_models;
    Stone_products_oitem_click stone_products_oitem_click ;

    public Stone_products_all_adapter(Context context, ArrayList<Stone_product_all_model> stone_product_all_models, Stone_products_oitem_click stone_products_oitem_click) {
        this.context = context;
        this.stone_product_all_models = stone_product_all_models;
        this.stone_products_oitem_click = stone_products_oitem_click;
    }

    @NonNull
    @Override
    public Stone_products_view_holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View v_stone_products = inflater.inflate(R.layout.stone_all_products,parent,false);
        return new Stone_products_view_holder(v_stone_products);
    }

    @Override
    public void onBindViewHolder(@NonNull Stone_products_view_holder holder, int position) {
       holder.stone_image.setImageResource(stone_product_all_models.get(position).getStone_product_image());
       holder.stone_products_name.setText(stone_product_all_models.get(position).getStone_product_name());
       holder.stone_products_previous_price.setText(stone_product_all_models.get(position).getStone_product_prev_price());
       holder.stone_products_current_price.setText(stone_product_all_models.get(position).getStone_product_current_price());
    }

    @Override
    public int getItemCount() {
        return stone_product_all_models.size();
    }

    class Stone_products_view_holder extends RecyclerView.ViewHolder{

     TextView stone_products_name,stone_products_previous_price,stone_products_current_price;
     ImageView stone_image;
        public Stone_products_view_holder(@NonNull View itemView) {
            super(itemView);
            stone_image = itemView.findViewById(R.id.core_image_stone);
            stone_products_name = itemView.findViewById(R.id.product_name_stone);
            stone_products_previous_price = itemView.findViewById(R.id.product_prev_price_stone);
            stone_products_current_price = itemView.findViewById(R.id.product_current_price_stone);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    stone_products_oitem_click.on_stone_item_click(stone_product_all_models.get(getAdapterPosition()));
                }
            });
        }
    }

    public interface Stone_products_oitem_click{
        void on_stone_item_click(Stone_product_all_model s_product_all_model);
    }
}
