package com.example.eshopbd.all_recycler_view_code.construction_materials_product_subcatagory_recycler.all_adapter_class.stone_recycle_product_package;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.eshopbd.R;
import com.example.eshopbd.all_recycler_view_code.construction_materials_product_subcatagory_recycler.all_company_model_class.stone_recycle_product_package_model.Stone_materials_category_complications_class;

import java.util.ArrayList;

public class Stone_materials_category_complications_adapter extends RecyclerView.Adapter<Stone_materials_category_complications_adapter.Stone_category_viewholder> {
    private Context context ;
    private ArrayList<Stone_materials_category_complications_class>stone_materials_category_complications_classes;
    Stone_category_item_click stone_category_item_click;

    public Stone_materials_category_complications_adapter(Context context, ArrayList<Stone_materials_category_complications_class> stone_materials_category_complications_classes, Stone_category_item_click stone_category_item_click) {
        this.context = context;
        this.stone_materials_category_complications_classes = stone_materials_category_complications_classes;
        this.stone_category_item_click = stone_category_item_click;
    }

    @NonNull
    @Override
    public Stone_category_viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View Stone_company_category = layoutInflater.inflate(R.layout.stone_company,parent,false);
        return new Stone_category_viewholder(Stone_company_category);
    }


    @Override
    public void onBindViewHolder(@NonNull Stone_category_viewholder holder, int position) {
       holder.stone_company_category.setText(stone_materials_category_complications_classes.get(position).getStone_name_category());


    }

    @Override
    public int getItemCount() {
        return stone_materials_category_complications_classes.size();
    }

    class Stone_category_viewholder extends RecyclerView.ViewHolder{
     TextView stone_company_category;

        public Stone_category_viewholder(@NonNull final View itemView) {
            super(itemView);
            stone_company_category = itemView.findViewById(R.id.text_company_stone);
            itemView.setOnClickListener(new View.OnClickListener() {


                @Override
                public void onClick(View v) {
                    stone_category_item_click.OnStone_ctegory_item_catgory(stone_materials_category_complications_classes.get(getAdapterPosition()));

                }
            });


        }
    }
    public  interface  Stone_category_item_click{

        void OnStone_ctegory_item_catgory(Stone_materials_category_complications_class stone_materials_category_complications_class);
    }
}
