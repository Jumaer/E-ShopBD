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
import com.example.eshopbd.all_recycler_view_code.plumbing_mat_recycler_view_sub_catagory.model_class_all.GI_pipes_fittings_all_company_core_view;

import java.util.ArrayList;

public class GI_pipes_fittings_adapter_class extends RecyclerView.Adapter<GI_pipes_fittings_adapter_class.Gi_viewHolder_main> {
    private Context context;
    private ArrayList<GI_pipes_fittings_all_company_core_view>gi_pipes_fittings_all_company_core_views ;

    public GI_pipes_fittings_adapter_class(Context context, ArrayList<GI_pipes_fittings_all_company_core_view> gi_pipes_fittings_all_company_core_views) {
        this.context = context;
        this.gi_pipes_fittings_all_company_core_views = gi_pipes_fittings_all_company_core_views;
    }

    @NonNull
    @Override
    public Gi_viewHolder_main onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View core_view_others = layoutInflater.inflate(R.layout.gipipe_page_item_recycler,parent,false);
        return new Gi_viewHolder_main(core_view_others);
    }

    @Override
    public void onBindViewHolder(@NonNull Gi_viewHolder_main holder, int position) {
        holder.image_product.setImageResource(gi_pipes_fittings_all_company_core_views.get(position).getImage_gi());
        holder.name.setText(gi_pipes_fittings_all_company_core_views.get(position).getGi_pipe_name());
        holder.description.setText(gi_pipes_fittings_all_company_core_views.get(position).getProduct_description());
        holder.price.setText(gi_pipes_fittings_all_company_core_views.get(position).getProduct_price());
        holder.discount.setText(gi_pipes_fittings_all_company_core_views.get(position).getProduct_discount());


    }

    @Override
    public int getItemCount() {
        return gi_pipes_fittings_all_company_core_views.size();
    }

    class Gi_viewHolder_main extends RecyclerView.ViewHolder{

        TextView name,description,price,discount;
        ImageView image_product;
        public Gi_viewHolder_main(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.gi_product_name);
            description=itemView.findViewById(R.id.gi_product_description);
            price=itemView.findViewById(R.id.gi_Price_of_product);
            discount = itemView.findViewById(R.id.gi_discount);

            // image..

            image_product = itemView.findViewById(R.id.core_image_gi);
        }
    }
}
