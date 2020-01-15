package com.example.eshopbd.all_recycler_view_code.electrical_product_recycle.electrical_model;

import com.example.eshopbd.R;

import java.util.ArrayList;

public class Db_box_electrical_model {
    private String db_product_name,db_product_description,db_product_prev_price,db_product_current_price;
    private int image_db_product;

    public Db_box_electrical_model(String db_product_name, String db_product_description, String db_product_prev_price, String db_product_current_price, int image_db_product) {
        this.db_product_name = db_product_name;
        this.db_product_description = db_product_description;
        this.db_product_prev_price = db_product_prev_price;
        this.db_product_current_price = db_product_current_price;
        this.image_db_product = image_db_product;
    }

    public String getDb_product_name() {
        return db_product_name;
    }

    public void setDb_product_name(String db_product_name) {
        this.db_product_name = db_product_name;
    }

    public String getDb_product_description() {
        return db_product_description;
    }

    public void setDb_product_description(String db_product_description) {
        this.db_product_description = db_product_description;
    }

    public String getDb_product_prev_price() {
        return db_product_prev_price;
    }

    public void setDb_product_prev_price(String db_product_prev_price) {
        this.db_product_prev_price = db_product_prev_price;
    }

    public String getDb_product_current_price() {
        return db_product_current_price;
    }

    public void setDb_product_current_price(String db_product_current_price) {
        this.db_product_current_price = db_product_current_price;
    }

    public int getImage_db_product() {
        return image_db_product;
    }

    public void setImage_db_product(int image_db_product) {
        this.image_db_product = image_db_product;
    }
    public static ArrayList<Db_box_electrical_model>generate_db_box_electrical_model(){


        ArrayList<Db_box_electrical_model>db_box_electrical_models = new ArrayList<>();

        db_box_electrical_models.add(new Db_box_electrical_model("My_db_product1","This is a demo text for product description","200","180", R.drawable.i_light));
        db_box_electrical_models.add(new Db_box_electrical_model("My_db_product1","This is a demo text for product description","200","180", R.drawable.i_light));
        db_box_electrical_models.add(new Db_box_electrical_model("My_db_product1","This is a demo text for product description","200","180", R.drawable.i_light));
        db_box_electrical_models.add(new Db_box_electrical_model("My_db_product1","This is a demo text for product description","200","180", R.drawable.i_light));
        db_box_electrical_models.add(new Db_box_electrical_model("My_db_product1","This is a demo text for product description","200","180", R.drawable.i_light));
        db_box_electrical_models.add(new Db_box_electrical_model("My_db_product1","This is a demo text for product description","200","180", R.drawable.i_light));
        db_box_electrical_models.add(new Db_box_electrical_model("My_db_product1","This is a demo text for product description","200","180", R.drawable.i_light));
        db_box_electrical_models.add(new Db_box_electrical_model("My_db_product1","This is a demo text for product description","200","180", R.drawable.i_light));
        db_box_electrical_models.add(new Db_box_electrical_model("My_db_product1","This is a demo text for product description","200","180", R.drawable.i_light));
        db_box_electrical_models.add(new Db_box_electrical_model("My_db_product1","This is a demo text for product description","200","180", R.drawable.i_light));
        db_box_electrical_models.add(new Db_box_electrical_model("My_db_product1","This is a demo text for product description","200","180", R.drawable.i_light));
        db_box_electrical_models.add(new Db_box_electrical_model("My_db_product1","This is a demo text for product description","200","180", R.drawable.i_light));
        db_box_electrical_models.add(new Db_box_electrical_model("My_db_product1","This is a demo text for product description","200","180", R.drawable.i_light));
        db_box_electrical_models.add(new Db_box_electrical_model("My_db_product1","This is a demo text for product description","200","180", R.drawable.i_light));
        db_box_electrical_models.add(new Db_box_electrical_model("My_db_product1","This is a demo text for product description","200","180", R.drawable.i_light));
        return db_box_electrical_models;
    }
}
