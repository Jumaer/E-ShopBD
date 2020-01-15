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
import com.example.eshopbd.all_recycler_view_code.construction_materials_product_subcatagory_recycler.all_adapter_class.stone_recycle_product_package.Stone_products_all_adapter;
import com.example.eshopbd.all_recycler_view_code.construction_materials_product_subcatagory_recycler.all_company_model_class.stone_recycle_product_package_model.Stone_product_all_model;

public class Stone_products extends Fragment implements Stone_products_all_adapter.Stone_products_oitem_click {
    public Stone_products() {
    }
  RecyclerView recycle_stone_products_all_according_company;
    Stone_products_all_adapter stone_products_all_adapter ;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.stone_product_container,container,false);
        recycle_stone_products_all_according_company = v.findViewById(R.id.recycle_stone_products_all_according_company);
        stone_products_all_adapter = new Stone_products_all_adapter(getActivity(), Stone_product_all_model.generate_stone_product_all_model(),this);
        GridLayoutManager glm = new GridLayoutManager(getContext(),2);
        recycle_stone_products_all_according_company.setLayoutManager(glm);
        recycle_stone_products_all_according_company.setAdapter(stone_products_all_adapter);


        return v;
    }

    @Override
    public void on_stone_item_click(Stone_product_all_model s_product_all_model) {
        Toast toast = Toast.makeText(getActivity(),
                "The item is clicked but the problem is display page is not ready to show",
                Toast.LENGTH_SHORT);

        toast.show();
    }
}
