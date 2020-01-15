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
import com.example.eshopbd.all_recycler_view_code.lighting_gallery.adapter_light.Interior_adapter;
import com.example.eshopbd.all_recycler_view_code.lighting_gallery.model_light.Interior_model;

public class Interor_lighting extends Fragment {
  public Interor_lighting(){



    }
  RecyclerView int_recycle;
  Interior_adapter interior_adapter ;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v_interior_light = inflater.inflate(R.layout.interor_lighting,container,false);
        int_recycle = (RecyclerView)v_interior_light.findViewById(R.id.Recycler_interior_lighting);
        interior_adapter = new Interior_adapter(getActivity(), Interior_model.generate_interior_models());
        GridLayoutManager glm = new GridLayoutManager( getContext(),2);
        int_recycle.setLayoutManager(glm);
        int_recycle.setAdapter(interior_adapter);
        return  v_interior_light;
    }
}
