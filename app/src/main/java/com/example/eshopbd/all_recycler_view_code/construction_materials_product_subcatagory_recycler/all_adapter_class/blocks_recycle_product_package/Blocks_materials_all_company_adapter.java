package com.example.eshopbd.all_recycler_view_code.construction_materials_product_subcatagory_recycler.all_adapter_class.blocks_recycle_product_package;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.eshopbd.R;
import com.example.eshopbd.all_recycler_view_code.construction_materials_product_subcatagory_recycler.all_company_model_class.blocks_recycle_product_package_model.Blocks_materials_all_category_core;

import java.util.ArrayList;

public class Blocks_materials_all_company_adapter extends RecyclerView.Adapter<Blocks_materials_all_company_adapter.Block_category_view_Holder> {
    private Context context ;
    private ArrayList<Blocks_materials_all_category_core>blocks_materials_all_category_cores;
    private Block_category_click block_category_click ;

    public Blocks_materials_all_company_adapter(Context context, ArrayList<Blocks_materials_all_category_core> blocks_materials_all_category_cores, Block_category_click block_category_click) {
        this.context = context;
        this.blocks_materials_all_category_cores = blocks_materials_all_category_cores;
        this.block_category_click = block_category_click;
    }

    @NonNull
    @Override
    public Block_category_view_Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View block_category = inflater.inflate(R.layout.block_company,parent,false);
        return new Block_category_view_Holder(block_category);
    }

    @Override
    public void onBindViewHolder(@NonNull Block_category_view_Holder holder, int position) {
       holder.text_company_block.setText(blocks_materials_all_category_cores.get(position).getBlock_company_name());
    }

    @Override
    public int getItemCount() {
        return blocks_materials_all_category_cores.size();
    }

    class  Block_category_view_Holder extends RecyclerView.ViewHolder{

        TextView text_company_block ;
        public Block_category_view_Holder(@NonNull View itemView) {
            super(itemView);
            text_company_block = itemView.findViewById(R.id.text_company_block);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    block_category_click.onBlock_click(blocks_materials_all_category_cores.get(getAdapterPosition()));
                }
            });
        }
    }
   public  interface  Block_category_click{

        void onBlock_click(Blocks_materials_all_category_core blocks_materials_all_category_core);
   }
}
