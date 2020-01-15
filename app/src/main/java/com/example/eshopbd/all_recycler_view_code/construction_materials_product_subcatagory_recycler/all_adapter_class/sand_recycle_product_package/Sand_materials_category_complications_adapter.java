package com.example.eshopbd.all_recycler_view_code.construction_materials_product_subcatagory_recycler.all_adapter_class.sand_recycle_product_package;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.eshopbd.R;
import com.example.eshopbd.all_recycler_view_code.construction_materials_product_subcatagory_recycler.all_company_model_class.sand_recycle_product_package_model.Sand_materials_category_complications_class;

import java.util.ArrayList;

public class Sand_materials_category_complications_adapter extends RecyclerView.Adapter<Sand_materials_category_complications_adapter.Sand_catagory_complications_ViewHolder> {
    private Context context ;
    private ArrayList<Sand_materials_category_complications_class>sand_materials_category_complications_classes;
    Sand_category_click sand_category_click ;

    public Sand_materials_category_complications_adapter(Context context, ArrayList<Sand_materials_category_complications_class> sand_materials_category_complications_classes, Sand_category_click sand_category_click) {
        this.context = context;
        this.sand_materials_category_complications_classes = sand_materials_category_complications_classes;
        this.sand_category_click = sand_category_click;
    }


    @NonNull
    @Override
    public Sand_catagory_complications_ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View sand_category = inflater.inflate(R.layout.sand_company,parent,false);
        return new Sand_catagory_complications_ViewHolder(sand_category);
    }

    @Override
    public void onBindViewHolder(@NonNull Sand_catagory_complications_ViewHolder holder, int position) {
  holder.sand_category.setText(sand_materials_category_complications_classes.get(position).getCategory_complications_name());
    }

    @Override
    public int getItemCount() {
        return sand_materials_category_complications_classes.size();
    }

    class Sand_catagory_complications_ViewHolder extends RecyclerView.ViewHolder{

        TextView sand_category ;
        public Sand_catagory_complications_ViewHolder(@NonNull View itemView) {
            super(itemView);
            sand_category = itemView.findViewById(R.id.text_company_sand);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    sand_category_click.on_sand_catagory_click(sand_materials_category_complications_classes.get(getAdapterPosition()));
                }
            });
        }
    }
    public  interface  Sand_category_click {
        void on_sand_catagory_click(Sand_materials_category_complications_class sand_materials_category_complications_class);
    }
}
