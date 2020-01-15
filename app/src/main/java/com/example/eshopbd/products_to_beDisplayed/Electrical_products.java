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
import com.example.eshopbd.products_to_beDisplayed.product_subcatagory_fragments.electrical_product.Cable_electrical;
import com.example.eshopbd.products_to_beDisplayed.product_subcatagory_fragments.electrical_product.Circuiet_breaker_electrical;
import com.example.eshopbd.products_to_beDisplayed.product_subcatagory_fragments.electrical_product.Db_box_electrical;
import com.example.eshopbd.products_to_beDisplayed.product_subcatagory_fragments.electrical_product.Holder_electrical;
import com.example.eshopbd.products_to_beDisplayed.product_subcatagory_fragments.electrical_product.Multiplug_electrical;
import com.example.eshopbd.products_to_beDisplayed.product_subcatagory_fragments.electrical_product.Others_electrical;
import com.example.eshopbd.products_to_beDisplayed.product_subcatagory_fragments.electrical_product.Pvc_electrical_product_fittings;
import com.example.eshopbd.products_to_beDisplayed.product_subcatagory_fragments.electrical_product.Sdb_box_electrical;
import com.example.eshopbd.products_to_beDisplayed.product_subcatagory_fragments.electrical_product.Soket_electrical;
import com.example.eshopbd.products_to_beDisplayed.product_subcatagory_fragments.electrical_product.Switch_electrical;

public class Electrical_products extends Fragment {
    public Electrical_products(){

    }

     CardView electrical_pvc, electrical_cable, electrical_db_box, electrical_sdb_box, electrical_circuit_breaker, electrical_switch, electrical_socket, electrical_holder, multi_plug_electrical, electrical_others;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        View electrical_products = inflater.inflate(R.layout.electrical_products,container,false);
        // all card_view_dec..
        electrical_pvc = (CardView)electrical_products.findViewById(R.id.card0);
        electrical_cable = (CardView)electrical_products.findViewById(R.id.card1);
        electrical_db_box = (CardView)electrical_products.findViewById(R.id.card2);
        electrical_sdb_box = (CardView)electrical_products.findViewById(R.id.card3);
        electrical_circuit_breaker = (CardView)electrical_products.findViewById(R.id.card4);
        electrical_switch = (CardView)electrical_products.findViewById(R.id.card5);
        electrical_socket = (CardView)electrical_products.findViewById(R.id.card6);
        electrical_holder = (CardView)electrical_products.findViewById(R.id.card7);
        multi_plug_electrical = (CardView)electrical_products.findViewById(R.id.card9);
        electrical_others = (CardView)electrical_products.findViewById(R.id.card10);

electrical_pvc.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        FragmentManager fragmentManager= getActivity().getSupportFragmentManager();
        FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.add(R.id.nav_host_fragment, new Pvc_electrical_product_fittings());
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
});
electrical_cable.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        FragmentManager fragmentManager= getActivity().getSupportFragmentManager();
        FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.add(R.id.nav_host_fragment, new Cable_electrical());
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
});
electrical_db_box.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        FragmentManager fragmentManager= getActivity().getSupportFragmentManager();
        FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.add(R.id.nav_host_fragment, new Db_box_electrical());
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
});
electrical_sdb_box.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        FragmentManager fragmentManager= getActivity().getSupportFragmentManager();
        FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.add(R.id.nav_host_fragment, new Sdb_box_electrical());
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
});
electrical_circuit_breaker.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        FragmentManager fragmentManager= getActivity().getSupportFragmentManager();
        FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.add(R.id.nav_host_fragment, new Circuiet_breaker_electrical());
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
});
electrical_switch.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        FragmentManager fragmentManager= getActivity().getSupportFragmentManager();
        FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.add(R.id.nav_host_fragment, new Switch_electrical());
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
});
electrical_socket.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        FragmentManager fragmentManager= getActivity().getSupportFragmentManager();
        FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.add(R.id.nav_host_fragment, new Soket_electrical());
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
});
electrical_holder.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        FragmentManager fragmentManager= getActivity().getSupportFragmentManager();
        FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.add(R.id.nav_host_fragment, new Holder_electrical());
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
});
multi_plug_electrical.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        FragmentManager fragmentManager= getActivity().getSupportFragmentManager();
        FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.add(R.id.nav_host_fragment, new Multiplug_electrical());
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
});
electrical_others.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        FragmentManager fragmentManager= getActivity().getSupportFragmentManager();
        FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.add(R.id.nav_host_fragment, new Others_electrical());
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
});
        return electrical_products;
    }
}
