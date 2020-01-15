package com.example.eshopbd.all_recycler_view_code.discount_recycle.model_recycle;

import com.example.eshopbd.R;

import java.util.ArrayList;

public class DiscountModel {
    private int image_discount_product;
    private String discount_product_name,
    discount_product_previous_price,discount_count_current_price,discount_real;

    public DiscountModel(String discount_product_name,  String discount_product_previous_price, String discount_count_current_price, String discount_real,int image_discount_product) {
        this.discount_product_name = discount_product_name;
        this.discount_product_previous_price = discount_product_previous_price;
        this.discount_count_current_price = discount_count_current_price;
        this.discount_real = discount_real;
        this.image_discount_product = image_discount_product;
    }

    public int getImage_discount_product() {
        return image_discount_product;
    }

    public void setImage_discount_product(int image_discount_product) {
        this.image_discount_product = image_discount_product;
    }

    public String getDiscount_product_name() {
        return discount_product_name;
    }

    public void setDiscount_product_name(String discount_product_name) {
        this.discount_product_name = discount_product_name;
    }

    public String getDiscount_product_previous_price() {
        return discount_product_previous_price;
    }

    public void setDiscount_product_previous_price(String discount_product_previous_price) {
        this.discount_product_previous_price = discount_product_previous_price;
    }

    public String getDiscount_count_current_price() {
        return discount_count_current_price;
    }

    public void setDiscount_count_current_price(String discount_count_current_price) {
        this.discount_count_current_price = discount_count_current_price;
    }

    public String getDiscount_real() {
        return discount_real;
    }

    public void setDiscount_real(String discount_real) {
        this.discount_real = discount_real;
    }

    public static ArrayList<DiscountModel>generate_discountModels(){

        ArrayList<DiscountModel>discountModels = new ArrayList<>();
        discountModels.add(new DiscountModel( "My_discount","230","200","7", R.drawable.ms));
        discountModels.add(new DiscountModel( "My_discount1","230","200","9", R.drawable.ss));
        discountModels.add(new DiscountModel( "My_discount","230","200","7", R.drawable.i_light));
        discountModels.add(new DiscountModel( "My_discount","230","200","30", R.drawable.garden_light));
        discountModels.add(new DiscountModel( "My_discount","230","200","4", R.drawable.e_light));
        discountModels.add(new DiscountModel( "My_discount","230","200","7", R.drawable.ms));
        discountModels.add(new DiscountModel( "My_discount","230","200","10", R.drawable.e_light));
        discountModels.add(new DiscountModel( "My_discount","230","200","7", R.drawable.bricks_slider));
        discountModels.add(new DiscountModel( "My_discount","230","200","2", R.drawable.ss));
        discountModels.add(new DiscountModel( "My_discount","230","200","7", R.drawable.garden_light));
        discountModels.add(new DiscountModel( "My_discount","230","200","4", R.drawable.e_light));
        discountModels.add(new DiscountModel( "My_discount","230","200","7", R.drawable.garden_light));
        discountModels.add(new DiscountModel( "My_discount","230","200","3", R.drawable.i_light));
        discountModels.add(new DiscountModel( "My_discount","230","200","8", R.drawable.garden_light));
        discountModels.add(new DiscountModel( "My_discount","230","200","1", R.drawable.garden_light));
        discountModels.add(new DiscountModel( "My_discount","230","200","5", R.drawable.i_light));
        discountModels.add(new DiscountModel( "My_discount","230","200","2", R.drawable.cement_slider));
        discountModels.add(new DiscountModel( "My_discount","230","200","8", R.drawable.i_light));
        discountModels.add(new DiscountModel( "My_discount","230","200","5", R.drawable.garden_light));
        discountModels.add(new DiscountModel( "My_discount","230","200","7", R.drawable.e_light));
        discountModels.add(new DiscountModel( "My_discount","230","200","3", R.drawable.stone5));
        discountModels.add(new DiscountModel( "My_discount","230","200","18", R.drawable.i_light));

        return discountModels;
    }
}
