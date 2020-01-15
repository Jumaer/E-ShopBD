package com.example.eshopbd.products_to_beDisplayed.product_subcatagory_fragments.plumbing_materials;

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
import com.example.eshopbd.all_recycler_view_code.plumbing_mat_recycler_view_sub_catagory.adapter_class_all.GI_pipes_fittings_adapter_class;
import com.example.eshopbd.all_recycler_view_code.plumbing_mat_recycler_view_sub_catagory.model_class_all.GI_pipes_fittings_all_company_core_view;


public class GI_pipes_fittings_fragments extends Fragment {
 public    GI_pipes_fittings_fragments(){

    }
     RecyclerView recycleGi;
 GI_pipes_fittings_adapter_class gi_pipes_fittings_adapter_class;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v_GI_pipes_fittings = inflater.inflate(R.layout.gi_pipe_and_fittins,container,false);
        recycleGi = v_GI_pipes_fittings.findViewById(R.id.Recycler_GI_pipes_settings);
        gi_pipes_fittings_adapter_class = new GI_pipes_fittings_adapter_class(getActivity(), GI_pipes_fittings_all_company_core_view.generate_gi_pipes_details());
        GridLayoutManager glm = new GridLayoutManager(getActivity(),2);
        recycleGi.setLayoutManager(glm);
        recycleGi.setAdapter(gi_pipes_fittings_adapter_class);
        return v_GI_pipes_fittings;
    }
}
