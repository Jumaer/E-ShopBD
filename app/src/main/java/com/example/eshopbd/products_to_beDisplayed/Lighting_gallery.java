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
import com.example.eshopbd.products_to_beDisplayed.product_subcatagory_fragments.lighting_gallery.Exterior_lighting;
import com.example.eshopbd.products_to_beDisplayed.product_subcatagory_fragments.lighting_gallery.Garden_lighting;
import com.example.eshopbd.products_to_beDisplayed.product_subcatagory_fragments.lighting_gallery.Interor_lighting;
import com.example.eshopbd.products_to_beDisplayed.product_subcatagory_fragments.plumbing_materials.PVC_PIPES_and_Fittings_fragments;

public class Lighting_gallery extends Fragment {
    public Lighting_gallery(){

    }

    CardView card_interior, card_exterior,card_garden;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        View light_v = inflater.inflate(R.layout.lighting_gallery,container,false);
        card_interior = (CardView)light_v.findViewById(R.id.interior);
        card_exterior = (CardView)light_v.findViewById(R.id.exterior);
        card_garden = (CardView)light_v.findViewById(R.id.garden_decoration);
        card_interior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager= getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
                fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
                fragmentTransaction.add(R.id.nav_host_fragment, new Interor_lighting());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
        card_exterior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager= getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
                fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
                fragmentTransaction.add(R.id.nav_host_fragment, new Exterior_lighting());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
        card_garden.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager= getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
                fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
                fragmentTransaction.add(R.id.nav_host_fragment, new Garden_lighting());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
        return light_v;
    }
}
