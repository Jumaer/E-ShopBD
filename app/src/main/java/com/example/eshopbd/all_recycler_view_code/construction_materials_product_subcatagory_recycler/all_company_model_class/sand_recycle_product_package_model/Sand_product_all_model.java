package com.example.eshopbd.all_recycler_view_code.construction_materials_product_subcatagory_recycler.all_company_model_class.sand_recycle_product_package_model;

import com.example.eshopbd.R;

import java.util.ArrayList;

public class Sand_product_all_model {
    private  String sand_name,sand_past_price,sand_current_price;
    private int sand_image;

    public Sand_product_all_model(String sand_name, String sand_past_price, String sand_current_price, int sand_image) {
        this.sand_name = sand_name;
        this.sand_past_price = sand_past_price;
        this.sand_current_price = sand_current_price;
        this.sand_image = sand_image;
    }

    public String getSand_name() {
        return sand_name;
    }

    public void setSand_name(String sand_name) {
        this.sand_name = sand_name;
    }

    public String getSand_past_price() {
        return sand_past_price;
    }

    public void setSand_past_price(String sand_past_price) {
        this.sand_past_price = sand_past_price;
    }

    public String getSand_current_price() {
        return sand_current_price;
    }

    public void setSand_current_price(String sand_current_price) {
        this.sand_current_price = sand_current_price;
    }

    public int getSand_image() {
        return sand_image;
    }

    public void setSand_image(int sand_image) {
        this.sand_image = sand_image;
    }
    public static ArrayList<Sand_product_all_model> generate_sand_products(){
        ArrayList<Sand_product_all_model>sand_product_all_models = new ArrayList<>();
        sand_product_all_models.add(new Sand_product_all_model("Mysand","200","230", R.drawable.sand2_recycletest));
        sand_product_all_models.add(new Sand_product_all_model("Mysand","200","230", R.drawable.sand2_recycletest));
        sand_product_all_models.add(new Sand_product_all_model("Mysand","200","230", R.drawable.sand2_recycletest));
        sand_product_all_models.add(new Sand_product_all_model("Mysand","200","230", R.drawable.sand2_recycletest));
        sand_product_all_models.add(new Sand_product_all_model("Mysand","200","230", R.drawable.sand2_recycletest));
        sand_product_all_models.add(new Sand_product_all_model("Mysand","200","230", R.drawable.sand2_recycletest));
        sand_product_all_models.add(new Sand_product_all_model("Mysand","200","230", R.drawable.sand2_recycletest));
        sand_product_all_models.add(new Sand_product_all_model("Mysand","200","230", R.drawable.sand2_recycletest));
        sand_product_all_models.add(new Sand_product_all_model("Mysand","200","230", R.drawable.sand2_recycletest));
        sand_product_all_models.add(new Sand_product_all_model("Mysand","200","230", R.drawable.sand2_recycletest));
        sand_product_all_models.add(new Sand_product_all_model("Mysand","200","230", R.drawable.sand2_recycletest));
        sand_product_all_models.add(new Sand_product_all_model("Mysand","200","230", R.drawable.sand2_recycletest));
        sand_product_all_models.add(new Sand_product_all_model("Mysand","200","230", R.drawable.sand2_recycletest));
        sand_product_all_models.add(new Sand_product_all_model("Mysand","200","230", R.drawable.sand2_recycletest));
        return sand_product_all_models ;
    }
}
