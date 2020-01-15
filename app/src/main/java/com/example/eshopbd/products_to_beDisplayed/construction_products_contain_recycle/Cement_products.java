package com.example.eshopbd.products_to_beDisplayed.construction_products_contain_recycle;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.eshopbd.R;
import com.example.eshopbd.all_recycler_view_code.construction_materials_product_subcatagory_recycler.all_adapter_class.cement_recycle_product_package.Cement_products_all_adapter;
import com.example.eshopbd.all_recycler_view_code.construction_materials_product_subcatagory_recycler.all_company_model_class.cement_recycle_product_package_model.Cement_products_all_model;

public class Cement_products extends Fragment implements Cement_products_all_adapter.Cement_item_click {
    public Cement_products() {
    }
  RecyclerView recycle_cdement_products;
    Cement_products_all_adapter cement_products_all_adapter ;
    RelativeLayout back_to_cement_p,back_to_construction_cmp;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v_product_cement = inflater.inflate(R.layout.cement_products_container,container,false);
        recycle_cdement_products = v_product_cement.findViewById(R.id.recycle_cement_products_all_according_company);
        cement_products_all_adapter = new Cement_products_all_adapter(getActivity(), Cement_products_all_model.generate_cememnt_products(),this);
        GridLayoutManager glm = new GridLayoutManager(getContext(),2);
        recycle_cdement_products.setLayoutManager(glm);
        recycle_cdement_products.setAdapter(cement_products_all_adapter);

        return v_product_cement;
    }

    @Override
    public void On_click_cementProducts(Cement_products_all_model cement_products_all_model) {
        Toast toast = Toast.makeText(getActivity(),
                "The item is clicked but the problem is display page is not ready to show",
                Toast.LENGTH_SHORT);

        toast.show();
    }
}
