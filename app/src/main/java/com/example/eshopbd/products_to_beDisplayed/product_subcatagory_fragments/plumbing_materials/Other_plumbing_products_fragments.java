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
import com.example.eshopbd.all_recycler_view_code.plumbing_mat_recycler_view_sub_catagory.adapter_class_all.Others_adapter;
import com.example.eshopbd.all_recycler_view_code.plumbing_mat_recycler_view_sub_catagory.model_class_all.Others_core_view;

public class Other_plumbing_products_fragments extends Fragment {
    public Other_plumbing_products_fragments(){



    }
    RecyclerView recycle_others;
    Others_adapter others_adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v_others_plumbings = inflater.inflate(R.layout.others_fittins_plumbings,container,false);
        recycle_others = v_others_plumbings.findViewById(R.id.Recycler_others_settings);
        others_adapter = new Others_adapter(getActivity(), Others_core_view.generate_other_products());
        GridLayoutManager glm = new GridLayoutManager(getActivity(),2);
        recycle_others.setLayoutManager(glm);
        recycle_others.setAdapter(others_adapter);
        return v_others_plumbings;
    }
}
