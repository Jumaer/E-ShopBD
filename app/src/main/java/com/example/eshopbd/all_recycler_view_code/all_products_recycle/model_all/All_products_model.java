package com.example.eshopbd.all_recycler_view_code.all_products_recycle.model_all;

import com.example.eshopbd.R;

import java.util.ArrayList;

public class All_products_model {
    private int all_product_image_core;
    private String all_product_name,all_product_description,all_product_prev_price,all_product_current_price,all_product_discount;

    public All_products_model(int all_product_image_core, String all_product_name, String all_product_description, String all_product_prev_price, String all_product_current_price, String all_product_discount) {
        this.all_product_image_core = all_product_image_core;
        this.all_product_name = all_product_name;
        this.all_product_description = all_product_description;
        this.all_product_prev_price = all_product_prev_price;
        this.all_product_current_price = all_product_current_price;
        this.all_product_discount = all_product_discount;
    }

    public int getAll_product_image_core() {
        return all_product_image_core;
    }

    public void setAll_product_image_core(int all_product_image_core) {
        this.all_product_image_core = all_product_image_core;
    }

    public String getAll_product_name() {
        return all_product_name;
    }

    public void setAll_product_name(String all_product_name) {
        this.all_product_name = all_product_name;
    }

    public String getAll_product_description() {
        return all_product_description;
    }

    public void setAll_product_description(String all_product_description) {
        this.all_product_description = all_product_description;
    }

    public String getAll_product_prev_price() {
        return all_product_prev_price;
    }

    public void setAll_product_prev_price(String all_product_prev_price) {
        this.all_product_prev_price = all_product_prev_price;
    }

    public String getAll_product_current_price() {
        return all_product_current_price;
    }

    public void setAll_product_current_price(String all_product_current_price) {
        this.all_product_current_price = all_product_current_price;
    }

    public String getAll_product_discount() {
        return all_product_discount;
    }

    public void setAll_product_discount(String all_product_discount) {
        this.all_product_discount = all_product_discount;
    }
    public static ArrayList<All_products_model>generate_all_products_models(){


        ArrayList<All_products_model>all_products_models = new ArrayList<>();
        all_products_models.add(new All_products_model(R.drawable.ss,"Product1","This is a demo description for product","200","180","10"));
        all_products_models.add(new All_products_model(R.drawable.ms,"Product1","This is a demo description for product","200","180","10"));
        all_products_models.add(new All_products_model(R.drawable.i_light,"Product1","This is a demo description for product","200","180","10"));
        all_products_models.add(new All_products_model(R.drawable.gi1,"Product1","This is a demo description for product","200","180","10"));
        all_products_models.add(new All_products_model(R.drawable.gi2,"Product1","This is a demo description for product","200","180","10"));
        all_products_models.add(new All_products_model(R.drawable.garden_light,"Product1","This is a demo description for product","200","180","10"));
        all_products_models.add(new All_products_model(R.drawable.e_light,"Product1","This is a demo description for product","200","180","10"));
        all_products_models.add(new All_products_model(R.drawable.plo1,"Product1","This is a demo description for product","200","180","10"));
        all_products_models.add(new All_products_model(R.drawable.plo7,"Product1","This is a demo description for product","200","180","10"));
        all_products_models.add(new All_products_model(R.drawable.plo34,"Product1","This is a demo description for product","200","180","10"));
        all_products_models.add(new All_products_model(R.drawable.ss,"Product1","This is a demo description for product","200","180","10"));
        all_products_models.add(new All_products_model(R.drawable.ms,"Product1","This is a demo description for product","200","180","10"));
        all_products_models.add(new All_products_model(R.drawable.i_light,"Product1","This is a demo description for product","200","180","10"));
        all_products_models.add(new All_products_model(R.drawable.gi1,"Product1","This is a demo description for product","200","180","10"));
        all_products_models.add(new All_products_model(R.drawable.gi2,"Product1","This is a demo description for product","200","180","10"));
        all_products_models.add(new All_products_model(R.drawable.garden_light,"Product1","This is a demo description for product","200","180","10"));
        all_products_models.add(new All_products_model(R.drawable.e_light,"Product1","This is a demo description for product","200","180","10"));
        all_products_models.add(new All_products_model(R.drawable.plo1,"Product1","This is a demo description for product","200","180","10"));
        all_products_models.add(new All_products_model(R.drawable.plo7,"Product1","This is a demo description for product","200","180","10"));
        all_products_models.add(new All_products_model(R.drawable.plo34,"Product1","This is a demo description for product","200","180","10"));
        all_products_models.add(new All_products_model(R.drawable.ss,"Product1","This is a demo description for product","200","180","10"));
        all_products_models.add(new All_products_model(R.drawable.ms,"Product1","This is a demo description for product","200","180","10"));
        all_products_models.add(new All_products_model(R.drawable.i_light,"Product1","This is a demo description for product","200","180","10"));
        all_products_models.add(new All_products_model(R.drawable.gi1,"Product1","This is a demo description for product","200","180","10"));
        all_products_models.add(new All_products_model(R.drawable.gi2,"Product1","This is a demo description for product","200","180","10"));
        all_products_models.add(new All_products_model(R.drawable.garden_light,"Product1","This is a demo description for product","200","180","10"));
        all_products_models.add(new All_products_model(R.drawable.e_light,"Product1","This is a demo description for product","200","180","10"));
        all_products_models.add(new All_products_model(R.drawable.plo1,"Product1","This is a demo description for product","200","180","10"));
        all_products_models.add(new All_products_model(R.drawable.plo7,"Product1","This is a demo description for product","200","180","10"));
        all_products_models.add(new All_products_model(R.drawable.plo34,"Product1","This is a demo description for product","200","180","10"));
        all_products_models.add(new All_products_model(R.drawable.ss,"Product1","This is a demo description for product","200","180","10"));
        all_products_models.add(new All_products_model(R.drawable.ms,"Product1","This is a demo description for product","200","180","10"));
        all_products_models.add(new All_products_model(R.drawable.i_light,"Product1","This is a demo description for product","200","180","10"));
        all_products_models.add(new All_products_model(R.drawable.gi1,"Product1","This is a demo description for product","200","180","10"));
        all_products_models.add(new All_products_model(R.drawable.gi2,"Product1","This is a demo description for product","200","180","10"));
        all_products_models.add(new All_products_model(R.drawable.garden_light,"Product1","This is a demo description for product","200","180","10"));
        all_products_models.add(new All_products_model(R.drawable.e_light,"Product1","This is a demo description for product","200","180","10"));
        all_products_models.add(new All_products_model(R.drawable.plo1,"Product1","This is a demo description for product","200","180","10"));
        all_products_models.add(new All_products_model(R.drawable.plo7,"Product1","This is a demo description for product","200","180","10"));
        all_products_models.add(new All_products_model(R.drawable.plo34,"Product1","This is a demo description for product","200","180","10"));














        return all_products_models;
    }
}
