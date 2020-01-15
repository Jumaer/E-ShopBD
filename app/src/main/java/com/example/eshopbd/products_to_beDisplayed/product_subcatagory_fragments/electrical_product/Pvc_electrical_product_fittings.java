package com.example.eshopbd.products_to_beDisplayed.product_subcatagory_fragments.electrical_product;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.eshopbd.R;
import com.example.eshopbd.all_recycler_view_code.electrical_product_recycle.electrical_adapter.Pvc_fittings_electrical_adapter;
import com.example.eshopbd.all_recycler_view_code.electrical_product_recycle.electrical_model.Pvc_fittings_electrical_model;

public class Pvc_electrical_product_fittings extends Fragment {
  public Pvc_electrical_product_fittings(){


    }
  RecyclerView recyclerView_pvc_electrical ;
  Pvc_fittings_electrical_adapter pvc_fittings_electrical_adapter ;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v_Pvc_fitt = inflater.inflate(R.layout.electrical_pvc_fittings_layout,container,false);
        recyclerView_pvc_electrical = (RecyclerView )v_Pvc_fitt .findViewById(R.id.recycle_electrical_pvc_fittings);
        pvc_fittings_electrical_adapter = new Pvc_fittings_electrical_adapter( getActivity(), Pvc_fittings_electrical_model.generate_pvc_fittings_electrical_models());
        GridLayoutManager glm = new GridLayoutManager(getContext(),2);
        recyclerView_pvc_electrical.setLayoutManager(glm);
       recyclerView_pvc_electrical.setAdapter(pvc_fittings_electrical_adapter);
        return v_Pvc_fitt;
    }
}
