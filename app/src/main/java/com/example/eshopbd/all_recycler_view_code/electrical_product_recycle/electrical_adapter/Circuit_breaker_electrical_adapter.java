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
import com.example.eshopbd.all_recycler_view_code.electrical_product_recycle.electrical_model.Circuit_electrical_model;

import java.util.ArrayList;

public class Circuit_breaker_electrical_adapter extends RecyclerView.Adapter<Circuit_breaker_electrical_adapter.ViewHolder_circuiet_breaker> {
    private Context context;
    private ArrayList<Circuit_electrical_model> circuit_electrical;

    public Circuit_breaker_electrical_adapter(Context context, ArrayList<Circuit_electrical_model> circuit_electrical) {
        this.context = context;
        this.circuit_electrical = circuit_electrical;
    }

    @NonNull
    @Override
    public ViewHolder_circuiet_breaker onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View V_inflet_circuit_breaker = layoutInflater.inflate(R.layout.electrical_circuit_item_recycle,parent,false);
        return new ViewHolder_circuiet_breaker(V_inflet_circuit_breaker);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder_circuiet_breaker holder, int position) {
        holder.product_image.setImageResource(circuit_electrical.get(position).getImage_product());
        holder.product_name.setText(circuit_electrical.get(position).getCircuit_electrical_product_name());
        holder.prev_price_product.setText(circuit_electrical.get(position).getCircuit_product_prev_price());
        holder.product_description.setText(circuit_electrical.get(position).getCircuit_description_product());
        holder.product_current_price.setText(circuit_electrical.get(position).getCircuit_product_current_price());

    }

    @Override
    public int getItemCount() {
        return circuit_electrical.size();
    }

    class ViewHolder_circuiet_breaker extends RecyclerView.ViewHolder{
       TextView product_name,product_description, prev_price_product,product_current_price;
       ImageView product_image;
        public ViewHolder_circuiet_breaker(@NonNull View itemView) {
            super(itemView);
            product_image = itemView.findViewById(R.id.core_image_circuit_breaker);
            product_name = itemView.findViewById(R.id.product_name_circuit_breaker);
            product_description = itemView.findViewById(R.id.product_description_circuit_breaker);
            prev_price_product = itemView.findViewById(R.id.discount_product_circuit_breaker);
            product_current_price = itemView.findViewById(R.id.price_of_product_circuit_breaker);

        }
    }
}
