package com.example.eshopbd.all_recycler_view_code.construction_materials_product_subcatagory_recycler.all_company_model_class.blocks_recycle_product_package_model;

import java.util.ArrayList;

public class Blocks_materials_all_category_core {
    private String block_company_name;

    public Blocks_materials_all_category_core(String block_company_name) {
        this.block_company_name = block_company_name;
    }


    public String getBlock_company_name() {
        return block_company_name;
    }

    public void setBlock_company_name(String block_company_name) {
        this.block_company_name = block_company_name;
    }
    public static ArrayList<Blocks_materials_all_category_core>generate_blocks_materials_all_category_cores(){

        ArrayList<Blocks_materials_all_category_core>blocks_materials_all_category_cores = new ArrayList<>();
        blocks_materials_all_category_cores.add(new Blocks_materials_all_category_core("Block- A"));
        blocks_materials_all_category_cores.add(new Blocks_materials_all_category_core("Block- B"));
        blocks_materials_all_category_cores.add(new Blocks_materials_all_category_core("Block- C"));
        blocks_materials_all_category_cores.add(new Blocks_materials_all_category_core("Block- D"));
        blocks_materials_all_category_cores.add(new Blocks_materials_all_category_core("Block- E"));
        blocks_materials_all_category_cores.add(new Blocks_materials_all_category_core("Block- F"));
        blocks_materials_all_category_cores.add(new Blocks_materials_all_category_core("Block- G"));
        blocks_materials_all_category_cores.add(new Blocks_materials_all_category_core("Block- H"));

        return  blocks_materials_all_category_cores ;

    }
}
