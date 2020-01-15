package com.example.eshopbd.all_recycler_view_code.construction_materials_product_subcatagory_recycler.all_company_model_class.bricks_recycle_product_package_model;

import java.util.ArrayList;

public class Bricks_materials_all_company_core {

    private String brick_company_name;

    public String getBrick_company_name() {
        return brick_company_name;
    }

    public void setBrick_company_name(String brick_company_name) {
        this.brick_company_name = brick_company_name;
    }

    public Bricks_materials_all_company_core(String brick_company_name) {
        this.brick_company_name = brick_company_name;
    }
    public static ArrayList<Bricks_materials_all_company_core>generate_brick_material_core_company(){
        ArrayList<Bricks_materials_all_company_core>bricks_materials_all_company_cores = new ArrayList<>();
        bricks_materials_all_company_cores.add(new Bricks_materials_all_company_core("Brick 1"));
        bricks_materials_all_company_cores.add(new Bricks_materials_all_company_core("Brick 2"));
        bricks_materials_all_company_cores.add(new Bricks_materials_all_company_core("Brick 3"));
        bricks_materials_all_company_cores.add(new Bricks_materials_all_company_core("Brick 4"));
        bricks_materials_all_company_cores.add(new Bricks_materials_all_company_core("Brick 5"));



        return bricks_materials_all_company_cores;
    }
}
