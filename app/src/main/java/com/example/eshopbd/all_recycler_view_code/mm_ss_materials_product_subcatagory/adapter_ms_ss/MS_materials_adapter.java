package com.example.eshopbd.all_recycler_view_code.mm_ss_materials_product_subcatagory.adapter_ms_ss;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.eshopbd.R;
import com.example.eshopbd.all_recycler_view_code.mm_ss_materials_product_subcatagory.model_ms_ss.MS_materials_core;

import java.util.ArrayList;

public class MS_materials_adapter extends RecyclerView.Adapter<MS_materials_adapter.MM_adapter_view_holder> {
    private Context context;
    private ArrayList<MS_materials_core> ms_materials_cores;

    public MS_materials_adapter(Context context, ArrayList<MS_materials_core> mm_materials_cores) {
        this.context = context;
        this.ms_materials_cores = mm_materials_cores;
    }

    @NonNull
    @Override
    public MM_adapter_view_holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View v_materilas = layoutInflater.inflate(R.layout.ms_recycle,parent,false);
        return  new MM_adapter_view_holder(v_materilas);
    }

    @Override
    public void onBindViewHolder(@NonNull MM_adapter_view_holder holder, int position) {

        holder.description.setText(ms_materials_cores.get(position).getMm_description());
        holder.name.setText(ms_materials_cores.get(position).getMm_name());
        holder.discount.setText(ms_materials_cores.get(position).getMm_discount());
        holder.price.setText(ms_materials_cores.get(position).getMm_price());
        holder.image_product.setImageResource(ms_materials_cores.get(position).getMm_image());


    }

    @Override
    public int getItemCount() {
        return ms_materials_cores.size();
    }

    class MM_adapter_view_holder extends RecyclerView.ViewHolder{

        TextView name,description,price,discount;
        ImageView image_product;
        public MM_adapter_view_holder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.product_name);
            description=itemView.findViewById(R.id.product_description);
            price=itemView.findViewById(R.id.Price_of_product);
            discount = itemView.findViewById(R.id.discount);

            // image..

            image_product = itemView.findViewById(R.id.core_image_mm);
        }
    }
}
