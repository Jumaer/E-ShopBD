package com.example.eshopbd.all_recycler_view_code.construction_materials_product_subcatagory_recycler.all_company_model_class.sand_recycle_product_package_model;

import java.util.ArrayList;

public class Sand_materials_category_complications_class {
   private String category_complications_name ;

    public Sand_materials_category_complications_class(String category_complications_name) {
        this.category_complications_name = category_complications_name;
    }

    public String getCategory_complications_name() {
        return category_complications_name;
    }

    public void setCategory_complications_name(String category_complications_name) {
        this.category_complications_name = category_complications_name;
    }

    public static ArrayList<Sand_materials_category_complications_class>generate_sand_companies(){


        ArrayList<Sand_materials_category_complications_class>sand_materials_category_complications_classes = new ArrayList<>();
        sand_materials_category_complications_classes.add(new Sand_materials_category_complications_class("Sand Category1"));
        sand_materials_category_complications_classes.add(new Sand_materials_category_complications_class("Sand Category2"));
        sand_materials_category_complications_classes.add(new Sand_materials_category_complications_class("Sand Category3"));
        sand_materials_category_complications_classes.add(new Sand_materials_category_complications_class("Sand Category4"));
        sand_materials_category_complications_classes.add(new Sand_materials_category_complications_class("Sand Category5"));
        sand_materials_category_complications_classes.add(new Sand_materials_category_complications_class("Sand Category6"));
        sand_materials_category_complications_classes.add(new Sand_materials_category_complications_class("Sand Category7"));
        sand_materials_category_complications_classes.add(new Sand_materials_category_complications_class("Sand Category8"));



        return sand_materials_category_complications_classes;
    }
}
