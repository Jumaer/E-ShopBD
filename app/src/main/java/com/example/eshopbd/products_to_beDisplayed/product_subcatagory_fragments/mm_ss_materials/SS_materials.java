package com.example.eshopbd.products_to_beDisplayed.product_subcatagory_fragments.mm_ss_materials;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.eshopbd.R;
import com.example.eshopbd.all_recycler_view_code.mm_ss_materials_product_subcatagory.adapter_ms_ss.SS_materilas_adapter;
import com.example.eshopbd.all_recycler_view_code.mm_ss_materials_product_subcatagory.model_ms_ss.SS_materilas_core;

public class SS_materials extends Fragment {
   public SS_materials(){


    }
RecyclerView ss_recycler;
   SS_materilas_adapter ss_materilas_adapter;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View v_ss = inflater.inflate(R.layout.ss_materilas,container,false);
       ss_recycler =(RecyclerView)v_ss.findViewById(R.id.recycler_ss);
       ss_materilas_adapter = new SS_materilas_adapter(getActivity(), SS_materilas_core.generate_ss_materilas_cores());
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(),2);

        ss_recycler.setLayoutManager(gridLayoutManager);
        ss_recycler.setAdapter(ss_materilas_adapter);
       return v_ss;
    }
}
