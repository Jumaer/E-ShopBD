package com.example.eshopbd.products_to_beDisplayed.construction_products_contain_recycle;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.eshopbd.R;
import com.example.eshopbd.all_recycler_view_code.construction_materials_product_subcatagory_recycler.all_adapter_class.bricks_recycle_product_package.Bricks_products_all_adapter;
import com.example.eshopbd.all_recycler_view_code.construction_materials_product_subcatagory_recycler.all_company_model_class.bricks_recycle_product_package_model.Bricks_product_all_model;

public class Brick_products extends Fragment implements Bricks_products_all_adapter.Brick_product_onclick {
    public Brick_products() {

    }
     RecyclerView recyclerView ;
    Bricks_products_all_adapter bricks_products_all_adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View brick_products = inflater.inflate(R.layout.brick_product_container,container,false);
        recyclerView = brick_products.findViewById(R.id.recycle_brick_products_all_according_company);
        bricks_products_all_adapter = new Bricks_products_all_adapter(getActivity(), Bricks_product_all_model.generate_brick_materials(),this);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(),2);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(bricks_products_all_adapter);


        return brick_products;
    }

    @Override
    public void onClick_brick_products(Bricks_product_all_model bricks_product_all_model) {
        Toast toast = Toast.makeText(getActivity(),
                "The item is clicked but the problem is display page is not ready to show",
                Toast.LENGTH_SHORT);

        toast.show();
    }
}
