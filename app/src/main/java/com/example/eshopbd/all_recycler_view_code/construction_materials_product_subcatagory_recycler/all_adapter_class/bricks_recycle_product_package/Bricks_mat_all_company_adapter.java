package com.example.eshopbd.all_recycler_view_code.construction_materials_product_subcatagory_recycler.all_adapter_class.bricks_recycle_product_package;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.eshopbd.R;
import com.example.eshopbd.all_recycler_view_code.construction_materials_product_subcatagory_recycler.all_company_model_class.bricks_recycle_product_package_model.Bricks_materials_all_company_core;

import java.util.ArrayList;

public class Bricks_mat_all_company_adapter extends RecyclerView.Adapter<Bricks_mat_all_company_adapter.ViewHolder_brick_company> {
    private Context context ;
    private ArrayList<Bricks_materials_all_company_core >bricks_materials_all_company_cores ;
    private Brick_company_click brick_company_click;

    public Bricks_mat_all_company_adapter(Context context, ArrayList<Bricks_materials_all_company_core> bricks_materials_all_company_cores, Brick_company_click brick_company_click) {
        this.context = context;
        this.bricks_materials_all_company_cores = bricks_materials_all_company_cores;
        this.brick_company_click = brick_company_click;
    }



    @NonNull
    @Override
    public ViewHolder_brick_company onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View v_brick_adapter = inflater.inflate(R.layout.brick_company,parent,false);
        return new ViewHolder_brick_company(v_brick_adapter);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder_brick_company holder, int position) {
        holder.brick_company_name.setText(bricks_materials_all_company_cores.get(position).getBrick_company_name());
    }

    @Override
    public int getItemCount() {
        return bricks_materials_all_company_cores.size();
    }

    class ViewHolder_brick_company extends RecyclerView.ViewHolder{

        TextView brick_company_name ;
        public ViewHolder_brick_company(@NonNull View itemView) {
            super(itemView);
            brick_company_name = itemView.findViewById(R.id.text_company_brick);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    brick_company_click.onClick_Brick_company(bricks_materials_all_company_cores.get(getAdapterPosition()));
                }
            });
        }
    }
    public interface Brick_company_click {
        void onClick_Brick_company(Bricks_materials_all_company_core bricks_materials_all_company_core_click);
    }
}
