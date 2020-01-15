package com.example.eshopbd.all_recycler_view_code.electrical_product_recycle.electrical_model;

import java.util.ArrayList;

public class Multiplug_electrical_model {
    private  String multiplug_product_name,multiplug_product_description,multiplug_product_prev_price,multiplug_product_current_price;
    private int multiplug_image;

    public Multiplug_electrical_model(String multiplug_product_name, String multiplug_product_description, String multiplug_product_prev_price, String multiplug_product_current_price, int multiplug_image) {
        this.multiplug_product_name = multiplug_product_name;
        this.multiplug_product_description = multiplug_product_description;
        this.multiplug_product_prev_price = multiplug_product_prev_price;
        this.multiplug_product_current_price = multiplug_product_current_price;
        this.multiplug_image = multiplug_image;
    }


    public String getMultiplug_product_name() {
        return multiplug_product_name;
    }

    public void setMultiplug_product_name(String multiplug_product_name) {
        this.multiplug_product_name = multiplug_product_name;
    }

    public String getMultiplug_product_description() {
        return multiplug_product_description;
    }

    public void setMultiplug_product_description(String multiplug_product_description) {
        this.multiplug_product_description = multiplug_product_description;
    }

    public String getMultiplug_product_prev_price() {
        return multiplug_product_prev_price;
    }

    public void setMultiplug_product_prev_price(String multiplug_product_prev_price) {
        this.multiplug_product_prev_price = multiplug_product_prev_price;
    }

    public String getMultiplug_product_current_price() {
        return multiplug_product_current_price;
    }

    public void setMultiplug_product_current_price(String multiplug_product_current_price) {
        this.multiplug_product_current_price = multiplug_product_current_price;
    }

    public int getMultiplug_image() {
        return multiplug_image;
    }

    public void setMultiplug_image(int multiplug_image) {
        this.multiplug_image = multiplug_image;
    }

    public ArrayList<Multiplug_electrical_model>generate_multiplug_electrical_models(){


        ArrayList<Multiplug_electrical_model>multiplug_electrical_models = new ArrayList<>();
        return multiplug_electrical_models;
    }
}
