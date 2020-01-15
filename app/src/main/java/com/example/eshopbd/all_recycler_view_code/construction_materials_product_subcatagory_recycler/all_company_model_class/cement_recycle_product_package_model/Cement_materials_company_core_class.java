package com.example.eshopbd.all_recycler_view_code.construction_materials_product_subcatagory_recycler.all_company_model_class.cement_recycle_product_package_model;

import java.util.ArrayList;

public class Cement_materials_company_core_class  {
    private String p_cement_company_name;


    public Cement_materials_company_core_class(String p_cement_company_name) {
        this.p_cement_company_name = p_cement_company_name;

    }

    public String getP_cement_company_name() {
        return p_cement_company_name;
    }

    public void setP_cement_company_name(String p_cement_company_name) {
        this.p_cement_company_name = p_cement_company_name;
    }

    public static ArrayList<Cement_materials_company_core_class>generate_core_cement(){
        ArrayList<Cement_materials_company_core_class>cement_materials_company_core_classes = new ArrayList<>();
        cement_materials_company_core_classes.add(new Cement_materials_company_core_class(" Brand 1"));
        cement_materials_company_core_classes.add(new Cement_materials_company_core_class(" Brand 2"));
        cement_materials_company_core_classes.add(new Cement_materials_company_core_class(" Brand 3"));
        cement_materials_company_core_classes.add(new Cement_materials_company_core_class(" Brand 4"));
        cement_materials_company_core_classes.add(new Cement_materials_company_core_class(" Brand 5"));
        cement_materials_company_core_classes.add(new Cement_materials_company_core_class(" Brand 6"));



        return cement_materials_company_core_classes;
    }
}
