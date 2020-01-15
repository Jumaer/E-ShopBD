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
import com.example.eshopbd.products_to_beDisplayed.product_subcatagory_fragments.mm_ss_materials.MS_materials;
import com.example.eshopbd.products_to_beDisplayed.product_subcatagory_fragments.mm_ss_materials.SS_materials;

public class MM_SS_Materials extends Fragment {
    public MM_SS_Materials(){

    }

    CardView card_mm,card_ss;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        View mm_ss = inflater.inflate(R.layout.ms_ss_materials,container,false);
        card_mm = (CardView)mm_ss.findViewById(R.id.card_mm);
        card_ss = (CardView)mm_ss.findViewById(R.id.card_ss);
        card_mm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager= getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
                fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
                fragmentTransaction.add(R.id.nav_host_fragment, new MS_materials());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
        card_ss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager= getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
                fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
                fragmentTransaction.add(R.id.nav_host_fragment, new SS_materials());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
        return mm_ss;
    }
}
