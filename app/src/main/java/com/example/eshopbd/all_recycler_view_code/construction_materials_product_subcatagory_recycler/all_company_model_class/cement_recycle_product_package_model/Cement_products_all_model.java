package com.example.eshopbd.all_recycler_view_code.construction_materials_product_subcatagory_recycler.all_company_model_class.cement_recycle_product_package_model;

import com.example.eshopbd.R;

import java.util.ArrayList;

public class Cement_products_all_model {
    private String p_cement_name,p_cement_prev_price,p_cement_current_price;
    private int image_cement;

    public Cement_products_all_model(String p_cement_name, String p_cement_prev_price, String p_cement_current_price, int image_cement) {
        this.p_cement_name = p_cement_name;

        this.p_cement_prev_price = p_cement_prev_price;
        this.p_cement_current_price = p_cement_current_price;
        this.image_cement = image_cement;
    }

    public String getP_cement_name() {
        return p_cement_name;
    }

    public void setP_cement_name(String p_cement_name) {
        this.p_cement_name = p_cement_name;
    }



    public String getP_cement_prev_price() {
        return p_cement_prev_price;
    }

    public void setP_cement_prev_price(String p_cement_prev_price) {
        this.p_cement_prev_price = p_cement_prev_price;
    }

    public String getP_cement_current_price() {
        return p_cement_current_price;
    }

    public void setP_cement_current_price(String p_cement_current_price) {
        this.p_cement_current_price = p_cement_current_price;
    }

    public int getImage_cement() {
        return image_cement;
    }

    public void setImage_cement(int image_cement) {
        this.image_cement = image_cement;
    }
    public static ArrayList<Cement_products_all_model>generate_cememnt_products(){



        ArrayList<Cement_products_all_model>cement_products_all_models = new ArrayList<>();
        cement_products_all_models.add(new Cement_products_all_model("Cement-1","2000","2200", R.drawable.cement_test2));
        cement_products_all_models.add(new Cement_products_all_model("Cement-1","2000","2200", R.drawable.cement_test3));
        cement_products_all_models.add(new Cement_products_all_model("Cement-1","2000","2200", R.drawable.cement_test9));
        cement_products_all_models.add(new Cement_products_all_model("Cement-1","2000","2200", R.drawable.cement_test2));
        cement_products_all_models.add(new Cement_products_all_model("Cement-1","2000","2200", R.drawable.cement_test3));
        cement_products_all_models.add(new Cement_products_all_model("Cement-1","2000","2200", R.drawable.cement_test9));
        cement_products_all_models.add(new Cement_products_all_model("Cement-1","2000","2200", R.drawable.cement_test2));
        cement_products_all_models.add(new Cement_products_all_model("Cement-1","2000","2200", R.drawable.cement_test3));
        cement_products_all_models.add(new Cement_products_all_model("Cement-1","2000","2200", R.drawable.cement_test9));
        cement_products_all_models.add(new Cement_products_all_model("Cement-1","2000","2200", R.drawable.cement_test2));
        cement_products_all_models.add(new Cement_products_all_model("Cement-1","2000","2200", R.drawable.cement_test3));
        cement_products_all_models.add(new Cement_products_all_model("Cement-1","2000","2200", R.drawable.cement_test9));
        cement_products_all_models.add(new Cement_products_all_model("Cement-1","2000","2200", R.drawable.cement_test2));
        cement_products_all_models.add(new Cement_products_all_model("Cement-1","2000","2200", R.drawable.cement_test3));
        cement_products_all_models.add(new Cement_products_all_model("Cement-1","2000","2200", R.drawable.cement_test9));

        return cement_products_all_models;
    }
}
