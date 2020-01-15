package com.example.eshopbd.ui.navigation_classes;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.eshopbd.R;

public class Order_of_Bricks extends Fragment {
    public   Order_of_Bricks(){

    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        View bricks_order = inflater.inflate(R.layout.order_bricks_fragments,container,false);
        return bricks_order;
    }
}
