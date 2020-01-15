package com.example.eshopbd.all_recycler_view_code.construction_materials_product_subcatagory_recycler.all_adapter_class.rod_recycle_product_package;

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
import com.example.eshopbd.all_recycler_view_code.construction_materials_product_subcatagory_recycler.all_company_model_class.rod_recycle_product_package_model.Rod_products_all_model_class;

import java.util.ArrayList;

public class Rod_products_R_company_adapter extends RecyclerView.Adapter<Rod_products_R_company_adapter.Rod_all_products_view_Holder> {

    private Context context;
    private ArrayList<Rod_products_all_model_class>rod_products_all_model_classes;
    private Rod_item_click rod_item_click;

    public Rod_products_R_company_adapter(Context context, ArrayList<Rod_products_all_model_class> rod_products_all_model_classes,Rod_item_click rod_item_click ) {
        this.context = context;
        this.rod_products_all_model_classes = rod_products_all_model_classes;
        this.rod_item_click = rod_item_click;
    }

    @NonNull
    @Override
    public Rod_all_products_view_Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View V_layout = layoutInflater.inflate(R.layout.rod_products,parent,false);
        return new  Rod_all_products_view_Holder(V_layout);
    }

    @Override
    public void onBindViewHolder(@NonNull Rod_all_products_view_Holder holder, int position) {
  holder.p_rod_image.setImageResource(rod_products_all_model_classes.get(position).getImage_rod());
  holder.p_rod_name.setText(rod_products_all_model_classes.get(position).getRod_product_name());
  holder.p_rod_prev_price.setText(rod_products_all_model_classes.get(position).getRod_product_prev_price());

  holder.p_rod_current_price.setText(rod_products_all_model_classes.get(position).getRod_product_current_price());
    }

    @Override
    public int getItemCount() {
        return rod_products_all_model_classes.size();
    }

    class Rod_all_products_view_Holder extends RecyclerView.ViewHolder{
       TextView p_rod_name,p_rod_description,p_rod_prev_price,p_rod_current_price;
       ImageView p_rod_image;

        public Rod_all_products_view_Holder(@NonNull View itemView) {
            super(itemView);
            p_rod_name = itemView.findViewById(R.id.product_name_rod);

            p_rod_prev_price=itemView.findViewById(R.id.product_prev_price_rod);
            p_rod_current_price = itemView.findViewById(R.id.product_current_price_rod);
            p_rod_image = itemView.findViewById(R.id.core_image_rod);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    rod_item_click.OnRod_click_item(rod_products_all_model_classes.get(getAdapterPosition()));
                }
            });
        }
    }
    public interface Rod_item_click{


        void OnRod_click_item(Rod_products_all_model_class rod_products_all_model_class);
    }
}
