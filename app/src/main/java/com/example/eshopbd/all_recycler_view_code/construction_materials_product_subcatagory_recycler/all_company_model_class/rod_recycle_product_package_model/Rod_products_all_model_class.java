package com.example.eshopbd.all_recycler_view_code.construction_materials_product_subcatagory_recycler.all_company_model_class.rod_recycle_product_package_model;

import com.example.eshopbd.R;

import java.util.ArrayList;

public class Rod_products_all_model_class {
    private String rod_product_name,rod_product_prev_price,rod_product_current_price;
    private int image_rod;

    public Rod_products_all_model_class(String rod_product_name, String rod_product_prev_price, String rod_product_current_price, int image_rod) {
        this.rod_product_name = rod_product_name;
        this.rod_product_prev_price = rod_product_prev_price;
        this.rod_product_current_price = rod_product_current_price;

        this.image_rod = image_rod;
    }

    public String getRod_product_name() {
        return rod_product_name;
    }

    public void setRod_product_name(String rod_product_name) {
        this.rod_product_name = rod_product_name;
    }

    public String getRod_product_prev_price() {
        return rod_product_prev_price;
    }

    public void setRod_product_prev_price(String rod_product_prev_price) {
        this.rod_product_prev_price = rod_product_prev_price;
    }

    public String getRod_product_current_price() {
        return rod_product_current_price;
    }

    public void setRod_product_current_price(String rod_product_current_price) {
        this.rod_product_current_price = rod_product_current_price;
    }

    public int getImage_rod() {
        return image_rod;
    }

    public void setImage_rod(int image_rod) {
        this.image_rod = image_rod;
    }


    public static ArrayList<Rod_products_all_model_class>generate_rod_products_all_model_classes(){
        ArrayList<Rod_products_all_model_class>rod_products = new ArrayList<>();
        rod_products.add(new Rod_products_all_model_class("Basundhara","6000","6200",R.drawable.rod_test_image3));
        rod_products.add(new Rod_products_all_model_class("BSRM","6000","6200",R.drawable.rod_test_image2));
        rod_products.add(new Rod_products_all_model_class("ASRM","6000","6200",R.drawable.rod_test_image));
        rod_products.add(new Rod_products_all_model_class("Meghna","6000","6200",R.drawable.rod_test_image3));
        rod_products.add(new Rod_products_all_model_class("Gazi","6000","6200",R.drawable.rod_test_image2));
        rod_products.add(new Rod_products_all_model_class("Basundhara","6000","6200",R.drawable.rod_test_image3));
        rod_products.add(new Rod_products_all_model_class("BSRM","6000","6200",R.drawable.rod_test_image2));
        rod_products.add(new Rod_products_all_model_class("ASRM","6000","6200",R.drawable.rod_test_image));
        rod_products.add(new Rod_products_all_model_class("Meghna","6000","6200",R.drawable.rod_test_image3));
        rod_products.add(new Rod_products_all_model_class("Gazi","6000","6200",R.drawable.rod_test_image2));
        rod_products.add(new Rod_products_all_model_class("Basundhara","6000","6200",R.drawable.rod_test_image3));
        rod_products.add(new Rod_products_all_model_class("BSRM","6000","6200",R.drawable.rod_test_image2));
        rod_products.add(new Rod_products_all_model_class("ASRM","6000","6200",R.drawable.rod_test_image));
        rod_products.add(new Rod_products_all_model_class("Meghna","6000","6200",R.drawable.rod_test_image3));
        rod_products.add(new Rod_products_all_model_class("Gazi","6000","6200",R.drawable.rod_test_image2));
        rod_products.add(new Rod_products_all_model_class("Basundhara","6000","6200",R.drawable.rod_test_image3));
        rod_products.add(new Rod_products_all_model_class("BSRM","6000","6200",R.drawable.rod_test_image2));
        rod_products.add(new Rod_products_all_model_class("ASRM","6000","6200",R.drawable.rod_test_image));
        rod_products.add(new Rod_products_all_model_class("Meghna","6000","6200",R.drawable.rod_test_image3));
        rod_products.add(new Rod_products_all_model_class("Gazi","6000","6200",R.drawable.rod_test_image2));
        rod_products.add(new Rod_products_all_model_class("Basundhara","6000","6200",R.drawable.rod_test_image3));
        rod_products.add(new Rod_products_all_model_class("BSRM","6000","6200",R.drawable.rod_test_image2));
        rod_products.add(new Rod_products_all_model_class("ASRM","6000","6200",R.drawable.rod_test_image));
        rod_products.add(new Rod_products_all_model_class("Meghna","6000","6200",R.drawable.rod_test_image3));
        rod_products.add(new Rod_products_all_model_class("Gazi","6000","6200",R.drawable.rod_test_image2));
        rod_products.add(new Rod_products_all_model_class("Basundhara","6000","6200",R.drawable.rod_test_image3));
        rod_products.add(new Rod_products_all_model_class("BSRM","6000","6200",R.drawable.rod_test_image2));
        rod_products.add(new Rod_products_all_model_class("ASRM","6000","6200",R.drawable.rod_test_image));
        rod_products.add(new Rod_products_all_model_class("Meghna","6000","6200",R.drawable.rod_test_image3));
        rod_products.add(new Rod_products_all_model_class("Gazi","6000","6200",R.drawable.rod_test_image2));
        return rod_products;
    }
}
