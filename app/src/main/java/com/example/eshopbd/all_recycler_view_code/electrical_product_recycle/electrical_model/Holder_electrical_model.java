package com.example.eshopbd.all_recycler_view_code.electrical_product_recycle.electrical_model;

import java.util.ArrayList;

public class Holder_electrical_model {
    private String holder_product_name,holder_product_description,holder_product_prev_price,holder_product_present_price;
    private int image_holder;

    public Holder_electrical_model(String holder_product_name, String holder_product_description, String holder_product_prev_price, String holder_product_present_price, int image_holder) {
        this.holder_product_name = holder_product_name;
        this.holder_product_description = holder_product_description;
        this.holder_product_prev_price = holder_product_prev_price;
        this.holder_product_present_price = holder_product_present_price;
        this.image_holder = image_holder;
    }

    public String getHolder_product_name() {
        return holder_product_name;
    }

    public void setHolder_product_name(String holder_product_name) {
        this.holder_product_name = holder_product_name;
    }

    public String getHolder_product_description() {
        return holder_product_description;
    }

    public void setHolder_product_description(String holder_product_description) {
        this.holder_product_description = holder_product_description;
    }

    public String getHolder_product_prev_price() {
        return holder_product_prev_price;
    }

    public void setHolder_product_prev_price(String holder_product_prev_price) {
        this.holder_product_prev_price = holder_product_prev_price;
    }

    public String getHolder_product_present_price() {
        return holder_product_present_price;
    }

    public void setHolder_product_present_price(String holder_product_present_price) {
        this.holder_product_present_price = holder_product_present_price;
    }

    public int getImage_holder() {
        return image_holder;
    }

    public void setImage_holder(int image_holder) {
        this.image_holder = image_holder;
    }


    public static ArrayList<Holder_electrical_model>generate_holder_electrical_models(){
        ArrayList<Holder_electrical_model>holder_electrical_models = new ArrayList<>();
        return holder_electrical_models;



    }
}
