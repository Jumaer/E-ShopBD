package com.example.eshopbd.all_recycler_view_code.construction_materials_product_subcatagory_recycler.all_adapter_class.sand_recycle_product_package;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.eshopbd.R;
import com.example.eshopbd.all_recycler_view_code.construction_materials_product_subcatagory_recycler.all_company_model_class.sand_recycle_product_package_model.Sand_product_all_model;

import java.util.ArrayList;

public class Sand_products_all_adapter extends RecyclerView.Adapter<Sand_products_all_adapter.SandProducts_all_ViewHolder> {
    private Context context ;
    private ArrayList<Sand_product_all_model>sand_product_all_models ;
    Sand_product_click sand_product_click;

    public Sand_products_all_adapter(Context context, ArrayList<Sand_product_all_model> sand_product_all_models, Sand_product_click sand_product_click) {
        this.context = context;
        this.sand_product_all_models = sand_product_all_models;
        this.sand_product_click = sand_product_click;
    }

    @NonNull
    @Override
    public SandProducts_all_ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View SAND_products_adapter = layoutInflater.inflate(R.layout.sand_product_all,parent,false);
        return  new SandProducts_all_ViewHolder(SAND_products_adapter);
    }

    @Override
    public void onBindViewHolder(@NonNull SandProducts_all_ViewHolder holder, int position) {
    holder.sand_product_previous_price.setText(sand_product_all_models.get(position).getSand_past_price());
    holder.sand_product_current_price.setText(sand_product_all_models.get(position).getSand_current_price());
    holder.sand_product_name.setText(sand_product_all_models.get(position).getSand_name());
    holder.sand_image.setImageResource(sand_product_all_models.get(position).getSand_image());
    }

    @Override
    public int getItemCount() {
        return sand_product_all_models.size();
    }

    public class SandProducts_all_ViewHolder extends RecyclerView.ViewHolder{
        TextView sand_product_name,sand_product_current_price,sand_product_previous_price;
        ImageView sand_image;

        public SandProducts_all_ViewHolder(@NonNull View itemView) {
            super(itemView);
            sand_image = itemView.findViewById(R.id.core_image_sand);
            sand_product_name = itemView.findViewById(R.id.product_name_sand);
            sand_product_current_price= itemView.findViewById(R.id.product_current_price_sand);
            sand_product_previous_price = itemView.findViewById(R.id.product_prev_price_sand);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    sand_product_click.on_sand_item_click(sand_product_all_models.get(getAdapterPosition()));
                }
            });
        }
    }
    public interface Sand_product_click{
        void on_sand_item_click(Sand_product_all_model sand_product_all_model);

    }
}
