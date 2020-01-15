package com.example.eshopbd.products_to_beDisplayed.product_subcatagory_fragments.lighting_gallery;

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
import com.example.eshopbd.all_recycler_view_code.lighting_gallery.adapter_light.Exterior_adapter;
import com.example.eshopbd.all_recycler_view_code.lighting_gallery.model_light.Exterior_model;

public class Exterior_lighting extends Fragment {
   public Exterior_lighting(){



    }
     RecyclerView ex_recycleview;
   Exterior_adapter exterior_adapter ;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View v_exterior = inflater.inflate(R.layout.exterior_lighting,container,false);
       ex_recycleview = (RecyclerView) v_exterior.findViewById(R.id.Recycler_exterior);
       exterior_adapter = new Exterior_adapter( getActivity(),Exterior_model.generate_exterior_models());
        GridLayoutManager glmex = new GridLayoutManager(getContext(),2);
        ex_recycleview.setLayoutManager(glmex);
        ex_recycleview.setAdapter(exterior_adapter);
       return v_exterior;
    }
}
