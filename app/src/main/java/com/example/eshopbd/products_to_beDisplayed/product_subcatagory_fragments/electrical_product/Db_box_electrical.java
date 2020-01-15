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

import com.example.eshopbd.R;
import com.example.eshopbd.all_recycler_view_code.electrical_product_recycle.electrical_adapter.Db_box_electrical_adapter;
import com.example.eshopbd.all_recycler_view_code.electrical_product_recycle.electrical_model.Db_box_electrical_model;

public class Db_box_electrical extends Fragment {
    public Db_box_electrical(){

    }
RecyclerView recyclerView_Db ;
    Db_box_electrical_adapter db_box_electrical_adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            View v_db_box = inflater.inflate(R.layout.electrical_db_box_layout,container,false);
            recyclerView_Db = (RecyclerView)v_db_box.findViewById(R.id.recycle_db_box_layout);
            db_box_electrical_adapter = new Db_box_electrical_adapter(getActivity(), Db_box_electrical_model.generate_db_box_electrical_model());
            GridLayoutManager grid_layout_manager = new GridLayoutManager(getContext(),2);
             recyclerView_Db.setLayoutManager(grid_layout_manager);
             recyclerView_Db.setAdapter(db_box_electrical_adapter);
            return v_db_box;
    }
}
