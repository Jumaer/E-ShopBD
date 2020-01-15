package com.example.eshopbd.all_recycler_view_code.plumbing_mat_recycler_view_sub_catagory.adapter_class_all;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.eshopbd.R;
import com.example.eshopbd.all_recycler_view_code.plumbing_mat_recycler_view_sub_catagory.model_class_all.Others_core_view;

import java.util.ArrayList;

public class Others_adapter extends RecyclerView.Adapter<Others_adapter.Other_plumbing_view_Holder> {
    private Context context ;
    private ArrayList<Others_core_view>others_core_views;

    public Others_adapter(Context context, ArrayList<Others_core_view> others_core_views) {
        this.context = context;
        this.others_core_views = others_core_views;
    }

    @NonNull
    @Override
    public Other_plumbing_view_Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View core_view_others = layoutInflater.inflate(R.layout.others_fittings_page_item_recycler,parent,false);
        return new Other_plumbing_view_Holder(core_view_others);
    }

    @Override
    public void onBindViewHolder(@NonNull Other_plumbing_view_Holder holder, int position) {
        holder.image_product.setImageResource(others_core_views.get(position).getImage());
        holder.name.setText(others_core_views.get(position).getOther_name());
        holder.description.setText(others_core_views.get(position).getOther_description());
        holder.price.setText(others_core_views.get(position).getOther_price());
   holder.discount.setText(others_core_views.get(position).getOther_discount());
    }

    @Override
    public int getItemCount() {
        return others_core_views.size();
    }

    class Other_plumbing_view_Holder extends RecyclerView.ViewHolder{
        TextView name,description,price,discount;
        ImageView image_product;

        public Other_plumbing_view_Holder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.other_product_name);
            description=itemView.findViewById(R.id.other_product_description);
            price=itemView.findViewById(R.id.other_Price_of_product);
            discount = itemView.findViewById(R.id.other_discount);

            // image..

            image_product = itemView.findViewById(R.id.core_image_others);
        }
    }
}
