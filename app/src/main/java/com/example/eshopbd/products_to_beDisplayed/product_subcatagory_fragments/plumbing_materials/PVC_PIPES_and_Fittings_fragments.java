package com.example.eshopbd.products_to_beDisplayed.product_subcatagory_fragments.plumbing_materials;

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

import com.example.eshopbd.all_recycler_view_code.plumbing_mat_recycler_view_sub_catagory.adapter_class_all.PVC_pipes_fittings_adapter_class;
import com.example.eshopbd.all_recycler_view_code.plumbing_mat_recycler_view_sub_catagory.model_class_all.PVC_pipe_fittings_all_company_core_view;
// This class is related to.. plumbing_mat_recycler_view_sub_catagory.....>adapter_class_all...>PVC_pipes_fittings_adapter_class...& model_class_all_PVC_pipe_fittings_core_view..


public class PVC_PIPES_and_Fittings_fragments extends Fragment {
    RecyclerView recycle_pvc;
    PVC_pipes_fittings_adapter_class pvc_pipes_fittings_adapter_class;
  public   PVC_PIPES_and_Fittings_fragments(){

  }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View pvc_pipes_fittings = inflater.inflate(R.layout.pvc_pipes_and_fittings,container,false);
        recycle_pvc = pvc_pipes_fittings.findViewById(R.id.Recycler_pvc_pipes_settings) ;
       pvc_pipes_fittings_adapter_class = new PVC_pipes_fittings_adapter_class(getActivity(),PVC_pipe_fittings_all_company_core_view.generate_products_pvc());
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(),2);
       recycle_pvc.setLayoutManager(gridLayoutManager);
        recycle_pvc.setAdapter(pvc_pipes_fittings_adapter_class);
        return pvc_pipes_fittings;
    }
}
