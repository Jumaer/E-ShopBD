package com.example.eshopbd.all_recycler_view_code.electrical_product_recycle.electrical_model;

import com.example.eshopbd.R;

import java.util.ArrayList;

public class Sdb_electrical_model {
    private String sdb_product_name,sdb_product_desc,sdb_product_prev_price,sdb_product_current_price;
    private int sdb_image;

    public Sdb_electrical_model(String sdb_product_name, String sdb_product_desc, String sdb_product_prev_price, String sdb_product_current_price, int sdb_image) {
        this.sdb_product_name = sdb_product_name;
        this.sdb_product_desc = sdb_product_desc;
        this.sdb_product_prev_price = sdb_product_prev_price;
        this.sdb_product_current_price = sdb_product_current_price;
        this.sdb_image = sdb_image;
    }


    public String getSdb_product_name() {
        return sdb_product_name;
    }

    public void setSdb_product_name(String sdb_product_name) {
        this.sdb_product_name = sdb_product_name;
    }

    public String getSdb_product_desc() {
        return sdb_product_desc;
    }

    public void setSdb_product_desc(String sdb_product_desc) {
        this.sdb_product_desc = sdb_product_desc;
    }

    public String getSdb_product_prev_price() {
        return sdb_product_prev_price;
    }

    public void setSdb_product_prev_price(String sdb_product_prev_price) {
        this.sdb_product_prev_price = sdb_product_prev_price;
    }

    public String getSdb_product_current_price() {
        return sdb_product_current_price;
    }

    public void setSdb_product_current_price(String sdb_product_current_price) {
        this.sdb_product_current_price = sdb_product_current_price;
    }

    public int getSdb_image() {
        return sdb_image;
    }

    public void setSdb_image(int sdb_image) {
        this.sdb_image = sdb_image;
    }
    public static ArrayList<Sdb_electrical_model>generate_sdb_electrical_models(){
        ArrayList<Sdb_electrical_model>sdb_electrical_models = new ArrayList<>();
        sdb_electrical_models.add(new Sdb_electrical_model("Sdb_product-1","The product is new and we can work it with any products.","200","300", R.drawable.e_light));
        sdb_electrical_models.add(new Sdb_electrical_model("Sdb_product-1","The product is new and we can work it with any products.","200","300", R.drawable.e_light));
        sdb_electrical_models.add(new Sdb_electrical_model("Sdb_product-1","The product is new and we can work it with any products.","200","300", R.drawable.e_light));
        sdb_electrical_models.add(new Sdb_electrical_model("Sdb_product-1","The product is new and we can work it with any products.","200","300", R.drawable.e_light));
        sdb_electrical_models.add(new Sdb_electrical_model("Sdb_product-1","The product is new and we can work it with any products.","200","300", R.drawable.e_light));
        sdb_electrical_models.add(new Sdb_electrical_model("Sdb_product-1","The product is new and we can work it with any products.","200","300", R.drawable.e_light));
        sdb_electrical_models.add(new Sdb_electrical_model("Sdb_product-1","The product is new and we can work it with any products.","200","300", R.drawable.e_light));
        sdb_electrical_models.add(new Sdb_electrical_model("Sdb_product-1","The product is new and we can work it with any products.","200","300", R.drawable.e_light));
        sdb_electrical_models.add(new Sdb_electrical_model("Sdb_product-1","The product is new and we can work it with any products.","200","300", R.drawable.e_light));
        sdb_electrical_models.add(new Sdb_electrical_model("Sdb_product-1","The product is new and we can work it with any products.","200","300", R.drawable.e_light));
        sdb_electrical_models.add(new Sdb_electrical_model("Sdb_product-1","The product is new and we can work it with any products.","200","300", R.drawable.e_light));
        sdb_electrical_models.add(new Sdb_electrical_model("Sdb_product-1","The product is new and we can work it with any products.","200","300", R.drawable.e_light));
        sdb_electrical_models.add(new Sdb_electrical_model("Sdb_product-1","The product is new and we can work it with any products.","200","300", R.drawable.e_light));
        sdb_electrical_models.add(new Sdb_electrical_model("Sdb_product-1","The product is new and we can work it with any products.","200","300", R.drawable.e_light));
        sdb_electrical_models.add(new Sdb_electrical_model("Sdb_product-1","The product is new and we can work it with any products.","200","300", R.drawable.e_light));
        sdb_electrical_models.add(new Sdb_electrical_model("Sdb_product-1","The product is new and we can work it with any products.","200","300", R.drawable.e_light));
        sdb_electrical_models.add(new Sdb_electrical_model("Sdb_product-1","The product is new and we can work it with any products.","200","300", R.drawable.e_light));
        sdb_electrical_models.add(new Sdb_electrical_model("Sdb_product-1","The product is new and we can work it with any products.","200","300", R.drawable.e_light));
        sdb_electrical_models.add(new Sdb_electrical_model("Sdb_product-1","The product is new and we can work it with any products.","200","300", R.drawable.e_light));
        sdb_electrical_models.add(new Sdb_electrical_model("Sdb_product-1","The product is new and we can work it with any products.","200","300", R.drawable.e_light));
        sdb_electrical_models.add(new Sdb_electrical_model("Sdb_product-1","The product is new and we can work it with any products.","200","300", R.drawable.e_light));
        sdb_electrical_models.add(new Sdb_electrical_model("Sdb_product-1","The product is new and we can work it with any products.","200","300", R.drawable.e_light));
        sdb_electrical_models.add(new Sdb_electrical_model("Sdb_product-1","The product is new and we can work it with any products.","200","300", R.drawable.e_light));

        sdb_electrical_models.add(new Sdb_electrical_model("Sdb_product-1","The product is new and we can work it with any products.","200","300", R.drawable.e_light));
        return sdb_electrical_models;


    }
}
