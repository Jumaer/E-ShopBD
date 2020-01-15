package com.example.eshopbd.all_recycler_view_code.electrical_product_recycle.electrical_model;

import java.util.ArrayList;

public class Switch_electrical_model {
    private String switch_elec_name,switch_elec_desc,switch_elect_prev_price,switch_elec_current_price;
    private int switch_elec_image;

    public Switch_electrical_model(String switch_elec_name, String switch_elec_desc, String switch_elect_prev_price, String switch_elec_current_price, int switch_elec_image) {
        this.switch_elec_name = switch_elec_name;
        this.switch_elec_desc = switch_elec_desc;
        this.switch_elect_prev_price = switch_elect_prev_price;
        this.switch_elec_current_price = switch_elec_current_price;
        this.switch_elec_image = switch_elec_image;
    }

    public String getSwitch_elec_name() {
        return switch_elec_name;
    }

    public void setSwitch_elec_name(String switch_elec_name) {
        this.switch_elec_name = switch_elec_name;
    }

    public String getSwitch_elec_desc() {
        return switch_elec_desc;
    }

    public void setSwitch_elec_desc(String switch_elec_desc) {
        this.switch_elec_desc = switch_elec_desc;
    }

    public String getSwitch_elect_prev_price() {
        return switch_elect_prev_price;
    }

    public void setSwitch_elect_prev_price(String switch_elect_prev_price) {
        this.switch_elect_prev_price = switch_elect_prev_price;
    }

    public String getSwitch_elec_current_price() {
        return switch_elec_current_price;
    }

    public void setSwitch_elec_current_price(String switch_elec_current_price) {
        this.switch_elec_current_price = switch_elec_current_price;
    }

    public int getSwitch_elec_image() {
        return switch_elec_image;
    }

    public void setSwitch_elec_image(int switch_elec_image) {
        this.switch_elec_image = switch_elec_image;
    }
    public static ArrayList<Switch_electrical_model>generate_switch_electrical_models(){
        ArrayList<Switch_electrical_model>switch_electrical_models = new ArrayList<>();
        return switch_electrical_models;

    }
}
