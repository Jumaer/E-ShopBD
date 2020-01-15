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
import com.example.eshopbd.all_recycler_view_code.mm_ss_materials_product_subcatagory.model_ms_ss.SS_materilas_core;

import java.util.ArrayList;

public class SS_materilas_adapter extends RecyclerView.Adapter<SS_materilas_adapter.SS_view_holder_product> {
    private Context context;
    private ArrayList<SS_materilas_core>ss_materilas_cores;

    public SS_materilas_adapter(Context context, ArrayList<SS_materilas_core> ss_materilas_cores) {
        this.context = context;
        this.ss_materilas_cores = ss_materilas_cores;
    }

    @NonNull
    @Override
    public SS_view_holder_product onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View SS_mat = layoutInflater.inflate(R.layout.ss_recycle,parent,false);
        return new SS_view_holder_product(SS_mat);
    }

    @Override
    public void onBindViewHolder(@NonNull SS_view_holder_product holder, int position) {
  // holder.image_product.setImageResource(ss_materilas_cores.get(position).getImage_ss());
   holder.name.setText(ss_materilas_cores.get(position).getSs_name());
   holder.description.setText(ss_materilas_cores.get(position).getSs_description());
   holder.discount.setText(ss_materilas_cores.get(position).getSs_discount());
   holder.price.setText(ss_materilas_cores.get(position).getSs_discount());
    }

    @Override
    public int getItemCount() {
        return ss_materilas_cores.size();
    }

    class SS_view_holder_product extends RecyclerView.ViewHolder{

        TextView name,description,price,discount;
        ImageView image_product;

        public SS_view_holder_product(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.product_name);
            description=itemView.findViewById(R.id.product_description);
            price=itemView.findViewById(R.id.Price_of_product);
            discount = itemView.findViewById(R.id.discount);

            // image..

            image_product = itemView.findViewById(R.id.core_image_ss);
        }
    }
}
