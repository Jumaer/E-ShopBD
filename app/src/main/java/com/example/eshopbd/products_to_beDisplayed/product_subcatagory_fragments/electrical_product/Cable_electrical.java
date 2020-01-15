package com.example.eshopbd.products_to_beDisplayed.product_subcatagory_fragments.electrical_product;

import android.icu.lang.UCharacter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.example.eshopbd.R;
import com.example.eshopbd.all_recycler_view_code.electrical_product_recycle.electrical_adapter.Cable_electrical_adapter;
import com.example.eshopbd.all_recycler_view_code.electrical_product_recycle.electrical_model.Cable_electrical_model;

public class Cable_electrical extends Fragment {
  public  Cable_electrical(){


    }
  RecyclerView r_cable_electrical;
  Cable_electrical_adapter cable_electrical_adapter ;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v_cable_electrical = inflater.inflate(R.layout.electrical_cable_layout,container,false);
        r_cable_electrical = (RecyclerView)v_cable_electrical.findViewById(R.id.recycle_cable_electrical);
        cable_electrical_adapter =  new Cable_electrical_adapter( getActivity(), Cable_electrical_model.generate_cable_electrical_models());
      GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
      r_cable_electrical.setLayoutManager(gridLayoutManager);
      r_cable_electrical.setAdapter(cable_electrical_adapter);
        return v_cable_electrical;
    }
}
