package com.example.eshopbd.products_to_beDisplayed;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.eshopbd.R;

public class Thai_aluminium extends Fragment {
    public Thai_aluminium(){

    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        View doors = inflater.inflate(R.layout.thai_aluminium,container,false);
        return doors;
    }
}
