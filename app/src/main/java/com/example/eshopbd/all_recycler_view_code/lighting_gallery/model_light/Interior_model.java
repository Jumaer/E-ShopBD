package com.example.eshopbd.all_recycler_view_code.lighting_gallery.model_light;

import com.example.eshopbd.R;

import java.util.ArrayList;

public class Interior_model {
private int in_product_image;
private String in_product_name,in_product_description,in_product_price,in_product_discount;

    public Interior_model(int in_product_image, String in_product_name, String in_product_description, String in_product_price, String in_product_discount) {
        this.in_product_image = in_product_image;
        this.in_product_name = in_product_name;
        this.in_product_description = in_product_description;
        this.in_product_price = in_product_price;
        this.in_product_discount = in_product_discount;
    }

    public int getIn_product_image() {
        return in_product_image;
    }
    public void setIn_product_image(int in_product_image) {
        this.in_product_image = in_product_image;
    }

    public String getIn_product_name() {
        return in_product_name;
    }

    public void setIn_product_name(String in_product_name) {
        this.in_product_name = in_product_name;
    }

    public String getIn_product_description() {
        return in_product_description;
    }

    public void setIn_product_description(String in_product_description) {
        this.in_product_description = in_product_description;
    }

    public String getIn_product_price() {
        return in_product_price;
    }

    public void setIn_product_price(String in_product_price) {
        this.in_product_price = in_product_price;
    }

    public String getIn_product_discount() {
        return in_product_discount;
    }

    public void setIn_product_discount(String in_product_discount) {
        this.in_product_discount = in_product_discount;
    }

    public static ArrayList<Interior_model>generate_interior_models(){


        ArrayList<Interior_model>interior_models = new ArrayList<>();
        interior_models.add(new Interior_model(R.drawable.i_light,"Interior_test3","This is for test and we are displaying product","1000","3"));
        interior_models.add(new Interior_model(R.drawable.i_light,"Interior_test5","This is for test and we are displaying product","1000","3"));

        interior_models.add(new Interior_model(R.drawable.i_light,"Interior_test3","This is for test and we are displaying product","1000","3"));
        interior_models.add(new Interior_model(R.drawable.i_light,"Interior_test5","This is for test and we are displaying product","1000","3"));

        interior_models.add(new Interior_model(R.drawable.i_light,"Interior_test3","This is for test and we are displaying product","1000","3"));
        interior_models.add(new Interior_model(R.drawable.i_light,"Interior_test5","This is for test and we are displaying product","1000","3"));

        interior_models.add(new Interior_model(R.drawable.i_light,"Interior_test3","This is for test and we are displaying product","1000","3"));
        interior_models.add(new Interior_model(R.drawable.i_light,"Interior_test5","This is for test and we are displaying product","1000","3"));

        interior_models.add(new Interior_model(R.drawable.i_light,"Interior_test1","This is for test and we are displaying product","1000","3"));
        interior_models.add(new Interior_model(R.drawable.i_light,"Interior_test2","This is for test and we are displaying product","1000","3"));
        interior_models.add(new Interior_model(R.drawable.i_light,"Interior_test3","This is for test and we are displaying product","1000","3"));
        interior_models.add(new Interior_model(R.drawable.i_light,"Interior_test5","This is for test and we are displaying product","1000","3"));
        interior_models.add(new Interior_model(R.drawable.i_light,"Interior_test4","This is for test and we are displaying product","1000","3"));
        interior_models.add(new Interior_model(R.drawable.i_light,"Interior_test7","This is for test and we are displaying product","1000","3"));

     return interior_models;
    }
}
