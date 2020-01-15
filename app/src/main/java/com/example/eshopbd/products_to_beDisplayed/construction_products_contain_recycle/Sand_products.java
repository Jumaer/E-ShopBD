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
import com.example.eshopbd.all_recycler_view_code.construction_materials_product_subcatagory_recycler.all_adapter_class.sand_recycle_product_package.Sand_products_all_adapter;
import com.example.eshopbd.all_recycler_view_code.construction_materials_product_subcatagory_recycler.all_company_model_class.sand_recycle_product_package_model.Sand_product_all_model;

public class Sand_products extends Fragment implements Sand_products_all_adapter.Sand_product_click {
    public Sand_products() {
    }
     RecyclerView recyclerView_sand_products;
    Sand_products_all_adapter sand_products_all_adapter ;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View sand_products = inflater.inflate(R.layout.sand_product_container,container,false);
        recyclerView_sand_products = sand_products.findViewById(R.id.recycle_sand_products_all_according_category);
        sand_products_all_adapter = new Sand_products_all_adapter(getActivity(),Sand_product_all_model.generate_sand_products(),this);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(),2);
        recyclerView_sand_products.setLayoutManager(gridLayoutManager);
        recyclerView_sand_products.setAdapter(sand_products_all_adapter);


        return sand_products;
    }

    @Override
    public void on_sand_item_click(Sand_product_all_model sand_product_all_model) {
        Toast toast = Toast.makeText(getActivity(),
                "The item is clicked but the problem is display page is not ready to show",
                Toast.LENGTH_SHORT);

        toast.show();
    }
}
