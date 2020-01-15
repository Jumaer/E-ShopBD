package com.example.eshopbd.products_to_beDisplayed.product_subcatagory_fragments.electrical_product;

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
import com.example.eshopbd.all_recycler_view_code.electrical_product_recycle.electrical_adapter.Sdb_electrical_adapter;
import com.example.eshopbd.all_recycler_view_code.electrical_product_recycle.electrical_model.Sdb_electrical_model;

public class Sdb_box_electrical extends Fragment {
  public Sdb_box_electrical(){



    }
     RecyclerView recyclerView_sd;
  Sdb_electrical_adapter sdb_electrical_adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v_Sdb_box = inflater.inflate(R.layout.electrical_sdb_box_layout,container,false);
        recyclerView_sd = (RecyclerView)v_Sdb_box.findViewById(R.id.recycle_sdb_box);
        sdb_electrical_adapter = new Sdb_electrical_adapter(getActivity(),Sdb_electrical_model.generate_sdb_electrical_models());
        GridLayoutManager gs = new GridLayoutManager(getContext(),2);
        recyclerView_sd.setLayoutManager(gs);
        recyclerView_sd.setAdapter(sdb_electrical_adapter);
        return v_Sdb_box;
    }
}
