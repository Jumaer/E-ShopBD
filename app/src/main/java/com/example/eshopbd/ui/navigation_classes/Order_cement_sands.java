package com.example.eshopbd.ui.navigation_classes;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.eshopbd.R;

public class Order_cement_sands extends Fragment {
    public   Order_cement_sands(){

    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        View cement_sands = inflater.inflate(R.layout.order_cementsand_fragments,container,false);
        return cement_sands;
    }
}
