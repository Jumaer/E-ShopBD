package com.example.eshopbd.ui.navigation_classes;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.eshopbd.R;

public class Full_Package_Order extends Fragment {
    public  Full_Package_Order(){

    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        View full_pack = inflater.inflate(R.layout.full_package_order_fragment,container,false);
        return full_pack;
    }
}
