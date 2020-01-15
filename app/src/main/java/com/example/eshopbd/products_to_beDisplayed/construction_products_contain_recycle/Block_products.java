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
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.eshopbd.R;
import com.example.eshopbd.all_recycler_view_code.construction_materials_product_subcatagory_recycler.all_adapter_class.blocks_recycle_product_package.Blocks_product_all_adapter;
import com.example.eshopbd.all_recycler_view_code.construction_materials_product_subcatagory_recycler.all_company_model_class.blocks_recycle_product_package_model.Blocks_materials_all_products_core;

public class Block_products extends Fragment implements Blocks_product_all_adapter.Block_product_click {
    public Block_products() {
    }
  RecyclerView recycle_block_products_all_according_company;
    Blocks_product_all_adapter blocks_product_all_adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View block_products = inflater.inflate(R.layout.block_product_container,container,false);

        recycle_block_products_all_according_company = block_products.findViewById(R.id.recycle_block_products_all_according_company);
        blocks_product_all_adapter = new Blocks_product_all_adapter(getActivity(), Blocks_materials_all_products_core.generateBlockproducts(),this);
        GridLayoutManager glm = new GridLayoutManager(getContext(),2);
        recycle_block_products_all_according_company.setLayoutManager(glm);
        recycle_block_products_all_according_company.setAdapter(blocks_product_all_adapter);
        return block_products;
    }

    @Override
    public void OnBlock_product_click(Blocks_materials_all_products_core blocks_materials_all_products_core) {
        Toast toast = Toast.makeText(getActivity(),
                "The item is clicked but the problem is display page is not ready to show",
                Toast.LENGTH_SHORT);

        toast.show();
    }
}
