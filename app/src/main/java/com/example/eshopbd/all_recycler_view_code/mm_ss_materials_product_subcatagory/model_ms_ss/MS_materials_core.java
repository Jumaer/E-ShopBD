package com.example.eshopbd.all_recycler_view_code.mm_ss_materials_product_subcatagory.model_ms_ss;

import com.example.eshopbd.R;

import java.util.ArrayList;

public class MS_materials_core {
    private String mm_name,mm_description,mm_price,mm_discount;
    private int mm_image;

    public MS_materials_core(String mm_name, String mm_description, String mm_price, String mm_discount, int mm_image) {
        this.mm_name = mm_name;
        this.mm_description = mm_description;
        this.mm_price = mm_price;
        this.mm_discount = mm_discount;
        this.mm_image = mm_image;
    }

    public String getMm_name() {
        return mm_name;
    }

    public void setMm_name(String mm_name) {
        this.mm_name = mm_name;
    }

    public String getMm_description() {
        return mm_description;
    }

    public void setMm_description(String mm_description) {
        this.mm_description = mm_description;
    }

    public String getMm_price() {
        return mm_price;
    }

    public void setMm_price(String mm_price) {
        this.mm_price = mm_price;
    }

    public String getMm_discount() {
        return mm_discount;
    }

    public void setMm_discount(String mm_discount) {
        this.mm_discount = mm_discount;
    }

    public int getMm_image() {
        return mm_image;
    }

    public void setMm_image(int mm_image) {
        this.mm_image = mm_image;
    }

    public static ArrayList<MS_materials_core>generate_mm_materials_cores(){

       ArrayList<MS_materials_core> ms_materials_cores = new ArrayList<>();
        ms_materials_cores.add(new MS_materials_core("MS3","Hi, This is a demo text  ","100","10", R.drawable.ms));
        ms_materials_cores.add(new MS_materials_core("MS4","This is a demo text   ","100","10", R.drawable.ms3));
        ms_materials_cores.add(new MS_materials_core("MS3","Hi, This is a demo text  ","100","10", R.drawable.msf));
        ms_materials_cores.add(new MS_materials_core("MS4","This is a demo text   ","100","10", R.drawable.ms5));
        ms_materials_cores.add(new MS_materials_core("MS3","Hi, This is a demo text  ","100","10", R.drawable.ms54));
        ms_materials_cores.add(new MS_materials_core("MS4","This is a demo text   ","100","10", R.drawable.ms543));
        ms_materials_cores.add(new MS_materials_core("MS3","Hi, This is a demo text  ","100","10", R.drawable.ms));
        ms_materials_cores.add(new MS_materials_core("MS4","This is a demo text   ","100","10", R.drawable.ms3));
        ms_materials_cores.add(new MS_materials_core("MS3","Hi, This is a demo text  ","100","10", R.drawable.msf));
        ms_materials_cores.add(new MS_materials_core("MS4","This is a demo text   ","100","10", R.drawable.ms5));
        ms_materials_cores.add(new MS_materials_core("MS3","Hi, This is a demo text  ","100","10", R.drawable.ms54));
        ms_materials_cores.add(new MS_materials_core("MS4","This is a demo text   ","100","10", R.drawable.ms543));
        ms_materials_cores.add(new MS_materials_core("MS4","This is a demo text   ","100","10", R.drawable.ms));


        ms_materials_cores.add(new MS_materials_core("MS3","Hi, This is a demo text  ","100","10", R.drawable.ms));
        ms_materials_cores.add(new MS_materials_core("MS4","This is a demo text   ","100","10", R.drawable.ms3));
        ms_materials_cores.add(new MS_materials_core("MS3","Hi, This is a demo text  ","100","10", R.drawable.msf));
        ms_materials_cores.add(new MS_materials_core("MS4","This is a demo text   ","100","10", R.drawable.ms5));
        ms_materials_cores.add(new MS_materials_core("MS3","Hi, This is a demo text  ","100","10", R.drawable.ms54));
        ms_materials_cores.add(new MS_materials_core("MS4","This is a demo text   ","100","10", R.drawable.ms543));
        ms_materials_cores.add(new MS_materials_core("MS3","Hi, This is a demo text  ","100","10", R.drawable.ms));
        ms_materials_cores.add(new MS_materials_core("MS4","This is a demo text   ","100","10", R.drawable.ms3));
        ms_materials_cores.add(new MS_materials_core("MS3","Hi, This is a demo text  ","100","10", R.drawable.msf));
        ms_materials_cores.add(new MS_materials_core("MS4","This is a demo text   ","100","10", R.drawable.ms5));
        ms_materials_cores.add(new MS_materials_core("MS3","Hi, This is a demo text  ","100","10", R.drawable.ms54));
        ms_materials_cores.add(new MS_materials_core("MS4","This is a demo text   ","100","10", R.drawable.ms543));
        ms_materials_cores.add(new MS_materials_core("MS4","This is a demo text   ","100","10", R.drawable.ms));



        ms_materials_cores.add(new MS_materials_core("MS3","Hi, This is a demo text  ","100","10", R.drawable.ms));
        ms_materials_cores.add(new MS_materials_core("MS4","This is a demo text   ","100","10", R.drawable.ms3));
        ms_materials_cores.add(new MS_materials_core("MS3","Hi, This is a demo text  ","100","10", R.drawable.msf));
        ms_materials_cores.add(new MS_materials_core("MS4","This is a demo text   ","100","10", R.drawable.ms5));
        ms_materials_cores.add(new MS_materials_core("MS3","Hi, This is a demo text  ","100","10", R.drawable.ms54));
        ms_materials_cores.add(new MS_materials_core("MS4","This is a demo text   ","100","10", R.drawable.ms543));
        ms_materials_cores.add(new MS_materials_core("MS3","Hi, This is a demo text  ","100","10", R.drawable.ms));
        ms_materials_cores.add(new MS_materials_core("MS4","This is a demo text   ","100","10", R.drawable.ms3));
        ms_materials_cores.add(new MS_materials_core("MS3","Hi, This is a demo text  ","100","10", R.drawable.msf));
        ms_materials_cores.add(new MS_materials_core("MS4","This is a demo text   ","100","10", R.drawable.ms5));
        ms_materials_cores.add(new MS_materials_core("MS3","Hi, This is a demo text  ","100","10", R.drawable.ms54));
        ms_materials_cores.add(new MS_materials_core("MS4","This is a demo text   ","100","10", R.drawable.ms543));
        ms_materials_cores.add(new MS_materials_core("MS4","This is a demo text   ","100","10", R.drawable.ms));



       return ms_materials_cores;


    }
}
