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
import com.example.eshopbd.all_recycler_view_code.electrical_product_recycle.electrical_model.Cable_electrical_model;

import java.util.ArrayList;

public class Cable_electrical_adapter extends RecyclerView.Adapter<Cable_electrical_adapter.Cable_View_holder> {
    private Context context ;
    private ArrayList<Cable_electrical_model>cableElectricalModels;

    public Cable_electrical_adapter(Context context, ArrayList<Cable_electrical_model> cableElectricalModels) {
        this.context = context;
        this.cableElectricalModels = cableElectricalModels;
    }

    @NonNull
    @Override
    public Cable_View_holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View v_cable_elec = layoutInflater.inflate(R.layout.electrical_cable_item_recycle,parent,false);
        return new Cable_View_holder(v_cable_elec);
    }

    @Override
    public void onBindViewHolder(@NonNull Cable_View_holder holder, int position) {
        holder.p_name.setText(cableElectricalModels.get(position).getProduct_name_cable());
        holder.p_description.setText(cableElectricalModels.get(position).getProduct_description_cable());
        holder.p_discount.setText(cableElectricalModels.get(position).getProduct_prev_price());
        holder.p_price.setText(cableElectricalModels.get(position).getProduct_current_price());
        holder.image_product.setImageResource(cableElectricalModels.get(position).getImage_cable());

    }

    @Override
    public int getItemCount() {
        return cableElectricalModels.size();
    }

    class Cable_View_holder extends RecyclerView.ViewHolder{

       TextView p_name,p_description,p_discount,p_price;
       ImageView image_product;
        public Cable_View_holder(@NonNull View itemView) {

            super(itemView);
            p_name =(TextView)itemView.findViewById(R.id.product_name_electrical_cable);
            p_description =(TextView)itemView.findViewById(R.id.product_description_electrical_cable);
            p_price =(TextView)itemView.findViewById(R.id.price_of_product_electrical_cable);
            p_discount =(TextView)itemView.findViewById(R.id.discount_product_electrical_cable);
            image_product =(ImageView)itemView.findViewById(R.id.core_image_electrical_cable);
        }
    }
}
