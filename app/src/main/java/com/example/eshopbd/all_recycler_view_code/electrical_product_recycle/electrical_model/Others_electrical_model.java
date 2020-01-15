package com.example.eshopbd.all_recycler_view_code.electrical_product_recycle.electrical_model;

import java.util.ArrayList;

public class Others_electrical_model {
    private String other_elec_product_name,other_elec_product_desc,other_elec_product_prev_price,other_elec_product_current_price;
    private int image_other_product;

    public Others_electrical_model(String other_elec_product_name, String other_elec_product_desc, String other_elec_product_prev_price, String other_elec_product_current_price, int image_other_product) {
        this.other_elec_product_name = other_elec_product_name;
        this.other_elec_product_desc = other_elec_product_desc;
        this.other_elec_product_prev_price = other_elec_product_prev_price;
        this.other_elec_product_current_price = other_elec_product_current_price;
        this.image_other_product = image_other_product;
    }

    public String getOther_elec_product_name() {
        return other_elec_product_name;
    }

    public void setOther_elec_product_name(String other_elec_product_name) {
        this.other_elec_product_name = other_elec_product_name;
    }

    public String getOther_elec_product_desc() {
        return other_elec_product_desc;
    }

    public void setOther_elec_product_desc(String other_elec_product_desc) {
        this.other_elec_product_desc = other_elec_product_desc;
    }

    public String getOther_elec_product_prev_price() {
        return other_elec_product_prev_price;
    }

    public void setOther_elec_product_prev_price(String other_elec_product_prev_price) {
        this.other_elec_product_prev_price = other_elec_product_prev_price;
    }

    public String getOther_elec_product_current_price() {
        return other_elec_product_current_price;
    }

    public void setOther_elec_product_current_price(String other_elec_product_current_price) {
        this.other_elec_product_current_price = other_elec_product_current_price;
    }

    public int getImage_other_product() {
        return image_other_product;
    }

    public void setImage_other_product(int image_other_product) {
        this.image_other_product = image_other_product;
    }


    public static ArrayList<Others_electrical_model>generate_others_electrical_models(){
        ArrayList<Others_electrical_model>others_electrical_models = new ArrayList<>();
        return others_electrical_models;
    }
}
