package com.example.eshopbd.all_recycler_view_code.construction_materials_product_subcatagory_recycler.all_adapter_class.cement_recycle_product_package;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.eshopbd.all_recycler_view_code.construction_materials_product_subcatagory_recycler.all_company_model_class.cement_recycle_product_package_model.Cement_materials_company_core_class;
import com.example.eshopbd.R;

import java.util.ArrayList;

public class Cement_mat_company_products_adapter extends RecyclerView.Adapter<Cement_mat_company_products_adapter.ViewHolder_Cement_mat_company> {
    private Context context;
    ArrayList<Cement_materials_company_core_class> cement_mat;
    Cement_company_click cement_company_click ;

    public Cement_mat_company_products_adapter(Context context, ArrayList<Cement_materials_company_core_class> cement_mat, Cement_company_click cement_company_click) {
        this.context = context;
        this.cement_mat = cement_mat;
        this.cement_company_click = cement_company_click;
    }

    @NonNull
    @Override
    public ViewHolder_Cement_mat_company onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
      LayoutInflater layoutInflater = LayoutInflater.from(context);
      View V_layout_c = layoutInflater.inflate(R.layout.cement_company,parent,false);
      return new ViewHolder_Cement_mat_company(V_layout_c);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder_Cement_mat_company holder, int position) {

     holder.text_product_company.setText(cement_mat.get(position).getP_cement_company_name());
    }

    @Override
    public int getItemCount() {
        return cement_mat.size();
    }

    class ViewHolder_Cement_mat_company extends RecyclerView.ViewHolder{
  TextView text_product_company;
  ImageView image_company_cement;

        public ViewHolder_Cement_mat_company(@NonNull View itemView) {
            super(itemView);
          text_product_company = itemView.findViewById(R.id.text_company_cement)  ;

          itemView.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  cement_company_click.OnClick_cement_company(cement_mat.get(getAdapterPosition()));
              }
          });
        }
    }


    public interface Cement_company_click{

        void OnClick_cement_company(Cement_materials_company_core_class cement_materials_company_core_class);
    }
}
