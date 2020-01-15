package com.example.eshopbd.all_recycler_view_code.construction_materials_product_subcatagory_recycler.all_company_model_class.stone_recycle_product_package_model;

import java.util.ArrayList;

public class Stone_materials_category_complications_class {
    private String stone_name_category ;

    public Stone_materials_category_complications_class(String stone_name_category) {
        this.stone_name_category = stone_name_category;
    }

    public String getStone_name_category() {
        return stone_name_category;
    }

    public void setStone_name_category(String stone_name_category) {
        this.stone_name_category = stone_name_category;
    }
    public static ArrayList<Stone_materials_category_complications_class>generate_stone_materials_company(){
        ArrayList<Stone_materials_category_complications_class>stone_materials_category_complications_classes = new ArrayList<>();
        stone_materials_category_complications_classes.add(new Stone_materials_category_complications_class("Stone c5"));
        stone_materials_category_complications_classes.add(new Stone_materials_category_complications_class("Stone c4"));
        stone_materials_category_complications_classes.add(new Stone_materials_category_complications_class("Stone c3"));
        stone_materials_category_complications_classes.add(new Stone_materials_category_complications_class("Stone c2"));
        stone_materials_category_complications_classes.add(new Stone_materials_category_complications_class("Stone c1"));
        return stone_materials_category_complications_classes;
    }
}
