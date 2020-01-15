package com.example.eshopbd.all_recycler_view_code.construction_materials_product_subcatagory_recycler.all_adapter_class.blocks_recycle_product_package;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.eshopbd.R;
import com.example.eshopbd.all_recycler_view_code.construction_materials_product_subcatagory_recycler.all_company_model_class.blocks_recycle_product_package_model.Blocks_materials_all_products_core;
import com.example.eshopbd.all_recycler_view_code.construction_materials_product_subcatagory_recycler.all_company_model_class.bricks_recycle_product_package_model.Bricks_product_all_model;

import java.util.ArrayList;

public class Blocks_product_all_adapter  extends RecyclerView.Adapter<Blocks_product_all_adapter.ViewHolder_block_products> {
    private Context context ;
    private ArrayList<Blocks_materials_all_products_core>blocks_materials_all_products_cores ;
    Block_product_click block_product_click;

    public Blocks_product_all_adapter(Context context, ArrayList<Blocks_materials_all_products_core> blocks_materials_all_products_cores, Block_product_click block_product_click) {
        this.context = context;
        this.blocks_materials_all_products_cores = blocks_materials_all_products_cores;
        this.block_product_click = block_product_click;
    }

    @NonNull
    @Override
    public ViewHolder_block_products onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View Block_products = layoutInflater.inflate(R.layout.block_products_all,parent,false);
        return  new ViewHolder_block_products( Block_products);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder_block_products holder, int position) {
  holder.Block_image.setImageResource(blocks_materials_all_products_cores.get(position).getBlock_image());
  holder.Block_name.setText(blocks_materials_all_products_cores.get(position).getBlock_product_name());
  holder.block_prev_price.setText(blocks_materials_all_products_cores.get(position).getBlock_product_prev_price());
  holder.block_current_price.setText(blocks_materials_all_products_cores.get(position).getBlock_product_current_price());
    }

    @Override
    public int getItemCount() {
        return blocks_materials_all_products_cores.size();
    }

    class ViewHolder_block_products extends RecyclerView.ViewHolder{

       TextView Block_name,block_prev_price,block_current_price;
       ImageView Block_image;
        public ViewHolder_block_products(@NonNull View itemView) {
            super(itemView);
            block_current_price = itemView.findViewById(R.id.product_current_price_block);
            block_prev_price = itemView .findViewById(R.id.product_prev_price_block);
            Block_name = itemView.findViewById(R.id.product_name_block);
            Block_image= itemView.findViewById(R.id.core_image_block);

             itemView.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {
                     block_product_click.OnBlock_product_click(blocks_materials_all_products_cores.get(getAdapterPosition()));
                 }
             });
        }
    }
    public  interface  Block_product_click{
        void  OnBlock_product_click(Blocks_materials_all_products_core blocks_materials_all_products_core);
    }
}
