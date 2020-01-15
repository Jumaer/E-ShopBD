package com.example.eshopbd.products_to_beDisplayed;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.eshopbd.R;
import com.example.eshopbd.products_to_beDisplayed.product_subcatagory_fragments.plumbing_materials.GI_pipes_fittings_fragments;
import com.example.eshopbd.products_to_beDisplayed.product_subcatagory_fragments.plumbing_materials.Other_plumbing_products_fragments;
import com.example.eshopbd.products_to_beDisplayed.product_subcatagory_fragments.plumbing_materials.PVC_PIPES_and_Fittings_fragments;
import com.example.eshopbd.ui.navigation_classes.Others_order;

public class Plumbing_materials extends Fragment {
    public Plumbing_materials(){

    }

     CardView pvc_pipes_fittings,GI_pipes_fittings,others_fittings;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        View plumbing_build = inflater.inflate(R.layout.plumbing_materials,container,false);
        pvc_pipes_fittings = plumbing_build.findViewById(R.id.Card_PVC_PIPES_FITTINGS);
        GI_pipes_fittings = plumbing_build.findViewById(R.id.Card_GI_PIPES_FITTINGS);
        others_fittings = plumbing_build.findViewById(R.id.Card_others);


        pvc_pipes_fittings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager= getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
                fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
                fragmentTransaction.add(R.id.nav_host_fragment, new PVC_PIPES_and_Fittings_fragments());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
        GI_pipes_fittings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager= getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
                fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
                fragmentTransaction.add(R.id.nav_host_fragment, new GI_pipes_fittings_fragments());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
        others_fittings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager= getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
                fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
                fragmentTransaction.add(R.id.nav_host_fragment, new Other_plumbing_products_fragments());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
        return plumbing_build;
    }
}
