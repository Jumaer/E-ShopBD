package com.example.eshopbd.all_recycler_view_code.electrical_product_recycle.electrical_model;

import com.example.eshopbd.R;

import java.util.ArrayList;

public class Cable_electrical_model {
    private String product_name_cable,product_description_cable, product_prev_price,product_current_price;
    private int image_cable;

    public String getProduct_prev_price() {
        return product_prev_price;
    }

    public void setProduct_prev_price(String product_prev_price) {
        this.product_prev_price = product_prev_price;
    }

    public Cable_electrical_model(String product_name_cable, String product_description_cable, String product_discount_ce, String product_current_price, int image_cable) {
        this.product_name_cable = product_name_cable;
        this.product_description_cable = product_description_cable;
        this.product_prev_price = product_discount_ce;
        this.product_current_price = product_current_price;
        this.image_cable = image_cable;
    }

    public String getProduct_name_cable() {
        return product_name_cable;
    }

    public void setProduct_name_cable(String product_name_cable) {
        this.product_name_cable = product_name_cable;
    }

    public String getProduct_description_cable() {
        return product_description_cable;
    }

    public void setProduct_description_cable(String product_description_cable) {
        this.product_description_cable = product_description_cable;
    }



    public String getProduct_current_price() {
        return product_current_price;
    }

    public void setProduct_current_price(String product_current_price) {
        this.product_current_price = product_current_price;
    }

    public int getImage_cable() {
        return image_cable;
    }

    public void setImage_cable(int image_cable) {
        this.image_cable = image_cable;
    }
    public static ArrayList<Cable_electrical_model>generate_cable_electrical_models(){


        ArrayList<Cable_electrical_model>cable_electrical_models = new ArrayList<>();
        cable_electrical_models.add(new Cable_electrical_model("Product-1","This is a demo text to display ","900","510" ,R.drawable.ss));
        cable_electrical_models.add(new Cable_electrical_model("Product-2","This is a demo text to display ","700","570" ,R.drawable.ss));
        cable_electrical_models.add(new Cable_electrical_model("Product-3","This is a demo text to display.This product will be real time after adding database","800","500" ,R.drawable.ss));
        cable_electrical_models.add(new Cable_electrical_model("Product-9","This is a demo text to display.And works fine. ","610","590" ,R.drawable.ss));
        cable_electrical_models.add(new Cable_electrical_model("Product-8","This is a demo text to display ","800","700" ,R.drawable.ss));
        cable_electrical_models.add(new Cable_electrical_model("Product-5","This is a demo text to display ","560","540" ,R.drawable.ss));
        cable_electrical_models.add(new Cable_electrical_model("Product-1","This is a demo text to display.This product will be real time after adding database","700","500" ,R.drawable.ss));
        cable_electrical_models.add(new Cable_electrical_model("ProductCheck","This is a demo text to display.And works fine. ","670","500" ,R.drawable.ss));
        cable_electrical_models.add(new Cable_electrical_model("Product-gone","This is a demo text to display ","700","590" ,R.drawable.ss));
        cable_electrical_models.add(new Cable_electrical_model("Product-test","This is a demo text to display ","800","770" ,R.drawable.ss));
        cable_electrical_models.add(new Cable_electrical_model("Product_my-1","This is a demo text to display.This product will be real time after adding database","700","500" ,R.drawable.ss));
        cable_electrical_models.add(new Cable_electrical_model("Product-last","This is a demo text to display.And works fine. ","580","550" ,R.drawable.ss));
        return cable_electrical_models;
    }
}
