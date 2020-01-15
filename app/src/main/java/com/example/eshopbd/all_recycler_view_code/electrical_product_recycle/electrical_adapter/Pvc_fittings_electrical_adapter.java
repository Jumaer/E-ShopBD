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
import com.example.eshopbd.all_recycler_view_code.electrical_product_recycle.electrical_model.Pvc_fittings_electrical_model;

import java.util.ArrayList;

public class Pvc_fittings_electrical_adapter  extends RecyclerView.Adapter<Pvc_fittings_electrical_adapter.Pvc_electrical_ViewHolder> {
    private Context context ;
    private ArrayList<Pvc_fittings_electrical_model>pvc_fittings_electrical_models;

    public Pvc_fittings_electrical_adapter(Context context, ArrayList<Pvc_fittings_electrical_model> pvc_fittings_electrical_models) {
        this.context = context;
        this.pvc_fittings_electrical_models = pvc_fittings_electrical_models;
    }

    @NonNull
    @Override
    public Pvc_electrical_ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View v_pvc_electrical = layoutInflater.inflate(R.layout.electrical_pvc_fittings_item_recycle,parent,false);
        return  new Pvc_electrical_ViewHolder(v_pvc_electrical);
    }

    @Override
    public void onBindViewHolder(@NonNull Pvc_electrical_ViewHolder holder, int position) {
     holder.p_pvc_electrical_name.setText(pvc_fittings_electrical_models.get(position).getP_name_pvc_elec());
        holder.p_pvc_product_desc_electrical_pvc.setText(pvc_fittings_electrical_models.get(position).getProduct_desc_pvc_elec());
        holder.p_pvc_electrical_prev_price.setText(pvc_fittings_electrical_models.get(position).getProduct_prev_price_pvc());
        holder.p_current_pvc_electriacal_price.setText(pvc_fittings_electrical_models.get(position).getProduct_current_price_pvc());
        holder.image_product_description_pvc.setImageResource(pvc_fittings_electrical_models.get(position).getPvc_image());


    }

    @Override
    public int getItemCount() {
        return pvc_fittings_electrical_models.size();
    }

    class Pvc_electrical_ViewHolder extends RecyclerView.ViewHolder{
        TextView p_pvc_electrical_name, p_pvc_product_desc_electrical_pvc, p_pvc_electrical_prev_price, p_current_pvc_electriacal_price;
        ImageView image_product_description_pvc;
        public Pvc_electrical_ViewHolder(@NonNull View itemView) {
            super(itemView);
            p_pvc_electrical_name = itemView.findViewById(R.id.product_name_electrical_pvc);
            p_pvc_product_desc_electrical_pvc = itemView.findViewById(R.id.product_description_electrical_pvc);
            p_pvc_electrical_prev_price = itemView.findViewById(R.id.product_prev_price_electrical_pvc);
            p_current_pvc_electriacal_price = itemView.findViewById(R.id.product_electrical_pvc_current_price);
            image_product_description_pvc = itemView.findViewById(R.id.core_image_electrical_pvc);

        }
    }
}
