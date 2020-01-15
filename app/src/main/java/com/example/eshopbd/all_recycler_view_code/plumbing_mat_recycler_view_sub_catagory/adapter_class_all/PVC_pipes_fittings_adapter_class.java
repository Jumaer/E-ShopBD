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
import com.example.eshopbd.all_recycler_view_code.plumbing_mat_recycler_view_sub_catagory.model_class_all.PVC_pipe_fittings_all_company_core_view;

import java.util.ArrayList;

public class PVC_pipes_fittings_adapter_class extends RecyclerView.Adapter<PVC_pipes_fittings_adapter_class.PVC_viewHolder_product> {

    private Context context;
    private ArrayList<PVC_pipe_fittings_all_company_core_view>pvc_core_arr_product;

    public PVC_pipes_fittings_adapter_class(Context context, ArrayList<PVC_pipe_fittings_all_company_core_view> pvc_core_arr_product) {
        this.context = context;
        this.pvc_core_arr_product = pvc_core_arr_product;
    }

    @NonNull
    @Override
    public PVC_viewHolder_product onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View core_view_pvc = layoutInflater.inflate(R.layout.pvc_pipe_page_item_recycler,parent,false);
        return new PVC_viewHolder_product(core_view_pvc);
    }

    @Override
    public void onBindViewHolder(@NonNull PVC_viewHolder_product holder, int position) {
        holder.image_product.setImageResource(pvc_core_arr_product.get(position).getProduct_image());
        holder.name.setText(pvc_core_arr_product.get(position).getName());
        holder.description.setText(pvc_core_arr_product.get(position).getDescription());
        holder.price.setText(pvc_core_arr_product.get(position).getPrice());
        holder.discount.setText(pvc_core_arr_product.get(position).getDiscount());
    }

    @Override
    public int getItemCount() {
        return pvc_core_arr_product.size();
    }


    class PVC_viewHolder_product extends RecyclerView.ViewHolder{

        TextView name,description,price,discount;
        ImageView image_product;


        public PVC_viewHolder_product(@NonNull View itemView) {

            super(itemView);
            name = itemView.findViewById(R.id.product_name);
            description=itemView.findViewById(R.id.product_description);
            price=itemView.findViewById(R.id.Price_of_product);
            discount = itemView.findViewById(R.id.discount);

            // image..

            image_product = itemView.findViewById(R.id.core_image_pvc);
        }
    }
}
