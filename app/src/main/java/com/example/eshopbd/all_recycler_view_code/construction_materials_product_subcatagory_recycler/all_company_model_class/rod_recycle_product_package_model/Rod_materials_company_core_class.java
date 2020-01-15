package com.example.eshopbd.all_recycler_view_code.construction_materials_product_subcatagory_recycler.all_company_model_class.rod_recycle_product_package_model;

import java.util.ArrayList;

public class Rod_materials_company_core_class {

    private String text_view;

    public Rod_materials_company_core_class() {
    }

    public Rod_materials_company_core_class( String text_view) {

        this.text_view = text_view;
    }


    public String getText_view() {
        return text_view;
    }

    public void setText_view(String text_view) {
        this.text_view = text_view;
    }
    public static ArrayList<Rod_materials_company_core_class>generate_rode_materials_company(){
        ArrayList<Rod_materials_company_core_class>rod_materials_company_core_classes = new ArrayList<>();
        rod_materials_company_core_classes.add(new Rod_materials_company_core_class("BSRM"));
        rod_materials_company_core_classes.add(new Rod_materials_company_core_class("BSRM1"));
        rod_materials_company_core_classes.add(new Rod_materials_company_core_class("BSRM2"));
        rod_materials_company_core_classes.add(new Rod_materials_company_core_class("BSRM3"));

        rod_materials_company_core_classes.add(new Rod_materials_company_core_class("BSRM"));
        rod_materials_company_core_classes.add(new Rod_materials_company_core_class("BSRM1"));


        return rod_materials_company_core_classes;
    }
}
