package com.example.eshopbd.all_recycler_view_code.lighting_gallery.model_light;

import com.example.eshopbd.R;

import java.util.ArrayList;

public class Exterior_model {
    private int ex_product_image;
    private String ex_product_name,ex_description,ex_product_price,product_discount;

    public Exterior_model(int ex_product_image, String ex_product_name, String ex_description, String ex_product_price, String product_discount) {
        this.ex_product_image = ex_product_image;
        this.ex_product_name = ex_product_name;
        this.ex_description = ex_description;
        this.ex_product_price = ex_product_price;
        this.product_discount = product_discount;
    }

    public int getEx_product_image() {
        return ex_product_image;
    }

    public void setEx_product_image(int ex_product_image) {
        this.ex_product_image = ex_product_image;
    }

    public String getEx_product_name() {
        return ex_product_name;
    }

    public void setEx_product_name(String ex_product_name) {
        this.ex_product_name = ex_product_name;
    }

    public String getEx_description() {
        return ex_description;
    }

    public void setEx_description(String ex_description) {
        this.ex_description = ex_description;
    }

    public String getEx_product_price() {
        return ex_product_price;
    }

    public void setEx_product_price(String ex_product_price) {
        this.ex_product_price = ex_product_price;
    }

    public String getexProduct_discount() {
        return product_discount;
    }

    public void setexProduct_discount(String product_discount) {
        this.product_discount = product_discount;
    }
    public static ArrayList<Exterior_model>generate_exterior_models(){

        ArrayList<Exterior_model>exterior_models = new ArrayList<>();
        exterior_models.add(new Exterior_model(R.drawable.e_light,"Exterior1","This is a demo description","350","5"));
        exterior_models.add(new Exterior_model(R.drawable.e_light,"Exterior1","This is a demo description","350","5"));
        exterior_models.add(new Exterior_model(R.drawable.e_light,"Exterior1","This is a demo description","350","5"));
        exterior_models.add(new Exterior_model(R.drawable.e_light,"Exterior1","This is a demo description","350","5"));
        exterior_models.add(new Exterior_model(R.drawable.e_light,"Exterior1","This is a demo description","350","5"));
        exterior_models.add(new Exterior_model(R.drawable.e_light,"Exterior1","This is a demo description","350","5"));
        exterior_models.add(new Exterior_model(R.drawable.e_light,"Exterior1","This is a demo description","350","5"));
        exterior_models.add(new Exterior_model(R.drawable.e_light,"Exterior1","This is a demo description","350","5"));
        exterior_models.add(new Exterior_model(R.drawable.e_light,"Exterior1","This is a demo description","350","5"));
        exterior_models.add(new Exterior_model(R.drawable.e_light,"Exterior1","This is a demo description","350","5"));
        exterior_models.add(new Exterior_model(R.drawable.e_light,"Exterior1","This is a demo description","350","5"));
        exterior_models.add(new Exterior_model(R.drawable.e_light,"Exterior1","This is a demo description","350","5"));
        exterior_models.add(new Exterior_model(R.drawable.e_light,"Exterior1","This is a demo description","350","5"));
        exterior_models.add(new Exterior_model(R.drawable.e_light,"Exterior1","This is a demo description","350","5"));
        exterior_models.add(new Exterior_model(R.drawable.e_light,"Exterior1","This is a demo description","350","5"));
        exterior_models.add(new Exterior_model(R.drawable.e_light,"Exterior1","This is a demo description","350","5"));
        exterior_models.add(new Exterior_model(R.drawable.e_light,"Exterior1","This is a demo description","350","5"));
        exterior_models.add(new Exterior_model(R.drawable.e_light,"Exterior1","This is a demo description","350","5"));
        return exterior_models;
    }
}
