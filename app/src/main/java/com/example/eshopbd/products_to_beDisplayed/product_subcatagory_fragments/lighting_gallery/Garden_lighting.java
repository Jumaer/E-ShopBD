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
import com.example.eshopbd.all_recycler_view_code.lighting_gallery.adapter_light.Garden_adapter;
import com.example.eshopbd.all_recycler_view_code.lighting_gallery.model_light.Garden_model;

public class Garden_lighting extends Fragment {
  public  Garden_lighting(){


    }
     RecyclerView recyclerView_garden;
  Garden_adapter garden_adapter ;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View v_garden_lighting = inflater.inflate(R.layout.garden_lighting,container,false);


       recyclerView_garden = (RecyclerView) v_garden_lighting .findViewById(R.id.Recycler_garden_lighting);
       garden_adapter = new Garden_adapter(getActivity(), Garden_model.generate_garden_models());
        GridLayoutManager glm_g = new GridLayoutManager(getContext(),2);
        recyclerView_garden.setLayoutManager(glm_g);
        recyclerView_garden.setAdapter(garden_adapter);



       return v_garden_lighting;
    }
}
