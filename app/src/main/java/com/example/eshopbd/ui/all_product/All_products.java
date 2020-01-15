package com.example.eshopbd.ui.all_product;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.example.eshopbd.R;
import com.example.eshopbd.all_recycler_view_code.all_products_recycle.adapter_all.All_products_view_adapter;
import com.example.eshopbd.all_recycler_view_code.all_products_recycle.model_all.All_products_model;

public class All_products extends Fragment {

  public All_products(){

  }
   RecyclerView all_recycle;
  All_products_view_adapter all_products_view_adapter ;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        View display_products = inflater.inflate(R.layout.fragment_view_products,container,false);
        all_recycle = (RecyclerView)display_products.findViewById(R.id.Recycle_all);
        all_products_view_adapter = new All_products_view_adapter(getActivity(), All_products_model.generate_all_products_models());
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(),2);
        all_recycle.setNestedScrollingEnabled(false);
        all_recycle.setHasFixedSize(false);
        all_recycle.setLayoutManager(gridLayoutManager);
        all_recycle.setAdapter(all_products_view_adapter);

        return display_products;
    }
}