package com.example.eshopbd.all_recycler_view_code.electrical_product_recycle.electrical_adapter;

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
import com.example.eshopbd.all_recycler_view_code.electrical_product_recycle.electrical_model.Sdb_electrical_model;

import java.util.ArrayList;

public class Sdb_electrical_adapter extends RecyclerView.Adapter<Sdb_electrical_adapter.Sdb_ViewHolder> {
    private Context context;
    private ArrayList<Sdb_electrical_model>sdb_electrical_s;

    public Sdb_electrical_adapter(Context context, ArrayList<Sdb_electrical_model> sdb_electrical_s) {
        this.context = context;
        this.sdb_electrical_s = sdb_electrical_s;
    }

    @NonNull
    @Override
    public Sdb_ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View layout_View_holder = layoutInflater.inflate(R.layout.electrical_sdb_item_recycle,parent,false);
        return  new Sdb_ViewHolder(layout_View_holder);
    }

    @Override
    public void onBindViewHolder(@NonNull Sdb_ViewHolder holder, int position) {
       holder.sdb_image.setImageResource(sdb_electrical_s.get(position).getSdb_image());
       holder.sdb_product_name.setText(sdb_electrical_s.get(position).getSdb_product_name());
        holder.sdb_product_prev_price.setText(sdb_electrical_s.get(position).getSdb_product_prev_price());
        holder.sdb_product_current_price.setText(sdb_electrical_s.get(position).getSdb_product_current_price());
        holder.sdb_product_desc.setText(sdb_electrical_s.get(position).getSdb_product_desc());
    }

    @Override
    public int getItemCount() {
        return sdb_electrical_s.size();
    }

    class Sdb_ViewHolder extends RecyclerView.ViewHolder{
            TextView sdb_product_name,sdb_product_desc,sdb_product_prev_price,sdb_product_current_price;
            ImageView sdb_image;
        public Sdb_ViewHolder(@NonNull View itemView) {
            super(itemView);
                    sdb_product_name =itemView.findViewById(R.id.product_name_electrical_sdb);
                    sdb_product_desc= itemView.findViewById(R.id.product_description_electrical_sdb);
                    sdb_product_prev_price=itemView.findViewById(R.id.product_prev_price_electrical_sdb);
                    sdb_product_current_price= itemView.findViewById(R.id.product_real_price_sdb);
                    sdb_image=itemView.findViewById(R.id.core_image_electrical_sdb);
        }
    }
}
