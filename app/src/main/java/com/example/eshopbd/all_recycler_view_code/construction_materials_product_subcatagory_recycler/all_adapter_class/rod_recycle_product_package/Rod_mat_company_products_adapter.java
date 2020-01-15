package com.example.eshopbd.all_recycler_view_code.construction_materials_product_subcatagory_recycler.all_adapter_class.rod_recycle_product_package;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.eshopbd.all_recycler_view_code.construction_materials_product_subcatagory_recycler.all_company_model_class.rod_recycle_product_package_model.Rod_materials_company_core_class;
import com.example.eshopbd.R;

import java.util.ArrayList;

public class Rod_mat_company_products_adapter extends RecyclerView.Adapter<Rod_mat_company_products_adapter.Rode_materials_all_company_View_holder>{
    private Context context;
    private ArrayList<Rod_materials_company_core_class>rode_materials_company_core_classes;
    private Rod_Click_events rodClick_events;

    public Rod_mat_company_products_adapter(Context context, ArrayList<Rod_materials_company_core_class> rode_materials_company_core_classes, Rod_Click_events rodClick_events) {
        this.rodClick_events = rodClick_events;
        this.context = context;
        this.rode_materials_company_core_classes = rode_materials_company_core_classes;
    }

    @NonNull
    @Override
    public Rode_materials_all_company_View_holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View core_DisplayView = layoutInflater.inflate(R.layout.rod_company,parent,false);
        return new Rode_materials_all_company_View_holder(core_DisplayView);

    }

    @Override
    public void onBindViewHolder(@NonNull Rode_materials_all_company_View_holder holder, int position) {

        holder.Rode_product_company.setText(rode_materials_company_core_classes.get(position).getText_view());
    }

    @Override
    public int getItemCount() {
        return rode_materials_company_core_classes.size();
    }

    class Rode_materials_all_company_View_holder extends RecyclerView.ViewHolder{
            TextView Rode_product_company;

        public Rode_materials_all_company_View_holder(@NonNull View itemView) {
            super(itemView);

            Rode_product_company = itemView.findViewById(R.id.text_company_rode);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    rodClick_events.onCompany_click(rode_materials_company_core_classes.get(getAdapterPosition()));
                }
            });
        }

    }
    public interface Rod_Click_events {
      void onCompany_click(Rod_materials_company_core_class rod_materials_company_core_class);
    }
}
