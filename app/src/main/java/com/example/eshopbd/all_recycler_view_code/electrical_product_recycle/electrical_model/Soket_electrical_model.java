package com.example.eshopbd.all_recycler_view_code.electrical_product_recycle.electrical_model;

import java.util.ArrayList;

public class Soket_electrical_model {
    private String soket_product_name,soket_product_desc,soket_product_prev_price,soket_product_current_price;
    private int image_soket_product;

    public Soket_electrical_model(String soket_product_name, String soket_product_desc, String soket_product_prev_price, String soket_product_current_price, int image_soket_product) {
        this.soket_product_name = soket_product_name;
        this.soket_product_desc = soket_product_desc;
        this.soket_product_prev_price = soket_product_prev_price;
        this.soket_product_current_price = soket_product_current_price;
        this.image_soket_product = image_soket_product;
    }

    public String getSoket_product_name() {
        return soket_product_name;
    }

    public void setSoket_product_name(String soket_product_name) {
        this.soket_product_name = soket_product_name;
    }

    public String getSoket_product_desc() {
        return soket_product_desc;
    }

    public void setSoket_product_desc(String soket_product_desc) {
        this.soket_product_desc = soket_product_desc;
    }

    public String getSoket_product_prev_price() {
        return soket_product_prev_price;
    }

    public void setSoket_product_prev_price(String soket_product_prev_price) {
        this.soket_product_prev_price = soket_product_prev_price;
    }

    public String getSoket_product_current_price() {
        return soket_product_current_price;
    }

    public void setSoket_product_current_price(String soket_product_current_price) {
        this.soket_product_current_price = soket_product_current_price;
    }

    public int getImage_soket_product() {
        return image_soket_product;
    }

    public void setImage_soket_product(int image_soket_product) {
        this.image_soket_product = image_soket_product;
    }
    public static ArrayList<Soket_electrical_model>generate_soket_electrical_models(){

        ArrayList<Soket_electrical_model>soket_electrical_models = new ArrayList<>();
        return soket_electrical_models;
    }
}
