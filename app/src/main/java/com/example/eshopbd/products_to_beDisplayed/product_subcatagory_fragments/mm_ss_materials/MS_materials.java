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
import com.example.eshopbd.all_recycler_view_code.mm_ss_materials_product_subcatagory.adapter_ms_ss.MS_materials_adapter;
import com.example.eshopbd.all_recycler_view_code.mm_ss_materials_product_subcatagory.model_ms_ss.MS_materials_core;

public class MS_materials extends Fragment {

  public MS_materials(){


    }
RecyclerView recycler_mm;
  MS_materials_adapter mm_materials_adapter;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v_mm = inflater.inflate(R.layout.ms_materials,container,false);
        recycler_mm = (RecyclerView)v_mm.findViewById(R.id.recycler_mm);
        mm_materials_adapter = new MS_materials_adapter(getActivity(), MS_materials_core.generate_mm_materials_cores());
        GridLayoutManager glm = new GridLayoutManager(getActivity(),2);
        recycler_mm.setLayoutManager(glm);
        recycler_mm.setAdapter(mm_materials_adapter);
        return v_mm;
    }
}
