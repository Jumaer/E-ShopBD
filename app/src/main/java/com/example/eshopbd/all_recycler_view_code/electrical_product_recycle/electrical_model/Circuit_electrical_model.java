package com.example.eshopbd.all_recycler_view_code.electrical_product_recycle.electrical_model;

import com.example.eshopbd.R;

import java.util.ArrayList;

public class Circuit_electrical_model {
    private String circuit_electrical_product_name,circuit_description_product, circuit_product_prev_price,circuit_product_current_price;
    private int image_product;

    public Circuit_electrical_model(String circuit_electrical_product_name, String circuit_description_product, String circuit_product_prev_price, String circuit_product_current_price, int image_product) {
        this.circuit_electrical_product_name = circuit_electrical_product_name;
        this.circuit_description_product = circuit_description_product;
        this.circuit_product_prev_price = circuit_product_prev_price;
        this.circuit_product_current_price = circuit_product_current_price;
        this.image_product = image_product;
    }

    public String getCircuit_electrical_product_name() {
        return circuit_electrical_product_name;
    }

    public void setCircuit_electrical_product_name(String circuit_electrical_product_name) {
        this.circuit_electrical_product_name = circuit_electrical_product_name;
    }

    public String getCircuit_description_product() {
        return circuit_description_product;
    }

    public void setCircuit_description_product(String circuit_description_product) {
        this.circuit_description_product = circuit_description_product;
    }

    public String getCircuit_product_prev_price() {
        return circuit_product_prev_price;
    }

    public void setCircuit_product_prev_price(String circuit_product_prev_price) {
        this.circuit_product_prev_price = circuit_product_prev_price;
    }

    public String getCircuit_product_current_price() {
        return circuit_product_current_price;
    }

    public int getImage_product() {
        return image_product;
    }

    public void setImage_product(int image_product) {
        this.image_product = image_product;
    }

    public void setCircuit_product_current_price(String circuit_product_current_price) {
        this.circuit_product_current_price = circuit_product_current_price;
    }
   public static ArrayList<Circuit_electrical_model>generate_circuit_electrical_models(){

        ArrayList<Circuit_electrical_model>circuit_electrical_models = new ArrayList<>();
       circuit_electrical_models.add(new Circuit_electrical_model("My Product","This is new to market. and This is new This is new to market. and This is new ","200","220", R.drawable.garden_light));
       circuit_electrical_models.add(new Circuit_electrical_model("My Product","This is new to market. and This is new This is new to market. and This is new ","200","220", R.drawable.garden_light));
       circuit_electrical_models.add(new Circuit_electrical_model("My Product","This is new to market. and This is new This is new to market. and This is new ","200","220", R.drawable.garden_light));
       circuit_electrical_models.add(new Circuit_electrical_model("My Product","This is new to market. and This is new This is new to market. and This is new ","200","220", R.drawable.garden_light));
       circuit_electrical_models.add(new Circuit_electrical_model("My Product","This is new to market. and This is new This is new to market. and This is new ","200","220", R.drawable.garden_light));
       circuit_electrical_models.add(new Circuit_electrical_model("My Product","This is new to market. and This is new This is new to market. and This is new ","200","220", R.drawable.garden_light));
       circuit_electrical_models.add(new Circuit_electrical_model("My Product","This is new to market. and This is new This is new to market. and This is new ","200","220", R.drawable.garden_light));
       circuit_electrical_models.add(new Circuit_electrical_model("My Product","This is new to market. and This is new This is new to market. and This is new ","200","220", R.drawable.garden_light));
       circuit_electrical_models.add(new Circuit_electrical_model("My Product","This is new to market. and This is new This is new to market. and This is new ","200","220", R.drawable.garden_light));
       circuit_electrical_models.add(new Circuit_electrical_model("My Product","This is new to market. and This is new This is new to market. and This is new ","200","220", R.drawable.garden_light));
       circuit_electrical_models.add(new Circuit_electrical_model("My Product","This is new to market. and This is new This is new to market. and This is new ","200","220", R.drawable.garden_light));
       circuit_electrical_models.add(new Circuit_electrical_model("My Product","This is new to market. and This is new This is new to market. and This is new ","200","220", R.drawable.garden_light));
       circuit_electrical_models.add(new Circuit_electrical_model("My Product","This is new to market. and This is new This is new to market. and This is new ","200","220", R.drawable.garden_light));
       circuit_electrical_models.add(new Circuit_electrical_model("My Product","This is new to market. and This is new This is new to market. and This is new ","200","220", R.drawable.garden_light));
       circuit_electrical_models.add(new Circuit_electrical_model("My Product","This is new to market. and This is new This is new to market. and This is new ","200","220", R.drawable.garden_light));
       circuit_electrical_models.add(new Circuit_electrical_model("My Product","This is new to market. and This is new This is new to market. and This is new ","200","220", R.drawable.garden_light));

       return circuit_electrical_models;
   }
}
