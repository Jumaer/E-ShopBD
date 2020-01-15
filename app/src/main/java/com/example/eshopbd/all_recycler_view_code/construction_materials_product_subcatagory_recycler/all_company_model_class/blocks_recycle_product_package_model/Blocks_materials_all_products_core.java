package com.example.eshopbd.all_recycler_view_code.construction_materials_product_subcatagory_recycler.all_company_model_class.blocks_recycle_product_package_model;

import com.example.eshopbd.R;

import java.util.ArrayList;

public class Blocks_materials_all_products_core {
    private String block_product_name,block_product_prev_price,block_product_current_price;
    private int block_image;

    public Blocks_materials_all_products_core(String block_product_name, String block_product_prev_price, String block_product_current_price, int block_image) {
        this.block_product_name = block_product_name;
        this.block_product_prev_price = block_product_prev_price;
        this.block_product_current_price = block_product_current_price;
        this.block_image = block_image;
    }

    public String getBlock_product_name() {
        return block_product_name;
    }

    public void setBlock_product_name(String block_product_name) {
        this.block_product_name = block_product_name;
    }

    public String getBlock_product_prev_price() {
        return block_product_prev_price;
    }

    public void setBlock_product_prev_price(String block_product_prev_price) {
        this.block_product_prev_price = block_product_prev_price;
    }

    public String getBlock_product_current_price() {
        return block_product_current_price;
    }

    public void setBlock_product_current_price(String block_product_current_price) {
        this.block_product_current_price = block_product_current_price;
    }

    public int getBlock_image() {
        return block_image;
    }

    public void setBlock_image(int block_image) {
        this.block_image = block_image;
    }
    public  static ArrayList<Blocks_materials_all_products_core >generateBlockproducts(){
        ArrayList<Blocks_materials_all_products_core >blocks_materials_all_products_cores= new ArrayList<>();
        blocks_materials_all_products_cores.add(new Blocks_materials_all_products_core( "Block 1","100","120", R.drawable.block_ex));
        blocks_materials_all_products_cores.add(new Blocks_materials_all_products_core( "Block 11","100","120", R.drawable.block3));
        blocks_materials_all_products_cores.add(new Blocks_materials_all_products_core( "Block 2","100","120", R.drawable.block_2));
        blocks_materials_all_products_cores.add(new Blocks_materials_all_products_core( "Block 22","100","120", R.drawable.block));

        blocks_materials_all_products_cores.add(new Blocks_materials_all_products_core( "Block 1","100","120", R.drawable.block_ex));
        blocks_materials_all_products_cores.add(new Blocks_materials_all_products_core( "Block 11","100","120", R.drawable.block3));
        blocks_materials_all_products_cores.add(new Blocks_materials_all_products_core( "Block 2","100","120", R.drawable.block_2));
        blocks_materials_all_products_cores.add(new Blocks_materials_all_products_core( "Block 22","100","120", R.drawable.block));
        blocks_materials_all_products_cores.add(new Blocks_materials_all_products_core( "Block 1","100","120", R.drawable.block_ex));
        blocks_materials_all_products_cores.add(new Blocks_materials_all_products_core( "Block 11","100","120", R.drawable.block3));
        blocks_materials_all_products_cores.add(new Blocks_materials_all_products_core( "Block 2","100","120", R.drawable.block_2));
        blocks_materials_all_products_cores.add(new Blocks_materials_all_products_core( "Block 22","100","120", R.drawable.block));

        blocks_materials_all_products_cores.add(new Blocks_materials_all_products_core( "Block 1","100","120", R.drawable.block_ex));
        blocks_materials_all_products_cores.add(new Blocks_materials_all_products_core( "Block 11","100","120", R.drawable.block3));
        blocks_materials_all_products_cores.add(new Blocks_materials_all_products_core( "Block 2","100","120", R.drawable.block_2));
        blocks_materials_all_products_cores.add(new Blocks_materials_all_products_core( "Block 22","100","120", R.drawable.block));

        return blocks_materials_all_products_cores;
    }
}
