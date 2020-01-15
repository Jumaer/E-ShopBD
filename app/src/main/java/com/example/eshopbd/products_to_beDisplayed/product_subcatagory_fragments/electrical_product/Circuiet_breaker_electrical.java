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
import com.example.eshopbd.all_recycler_view_code.electrical_product_recycle.electrical_adapter.Cable_electrical_adapter;
import com.example.eshopbd.all_recycler_view_code.electrical_product_recycle.electrical_adapter.Circuit_breaker_electrical_adapter;
import com.example.eshopbd.all_recycler_view_code.electrical_product_recycle.electrical_model.Cable_electrical_model;
import com.example.eshopbd.all_recycler_view_code.electrical_product_recycle.electrical_model.Circuit_electrical_model;

public class Circuiet_breaker_electrical extends Fragment {
   public Circuiet_breaker_electrical(){


    }

RecyclerView recyclerView_circuit;
        Circuit_breaker_electrical_adapter circuiet_breaker_electrical;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v_circuit_breaker = inflater.inflate(R.layout.electrical_circuit_breaker_layout,container,false);
        recyclerView_circuit = (RecyclerView)v_circuit_breaker.findViewById(R.id.recycle_electrical_circuit_breaker);
        circuiet_breaker_electrical = new Circuit_breaker_electrical_adapter(getActivity(),Circuit_electrical_model.generate_circuit_electrical_models());
        GridLayoutManager  gridLayoutManager = new GridLayoutManager(getContext(),2);
        recyclerView_circuit.setLayoutManager(gridLayoutManager);
        recyclerView_circuit.setAdapter(circuiet_breaker_electrical);

        return  v_circuit_breaker;
    }
}
