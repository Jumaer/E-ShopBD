package com.example.eshopbd.products_to_beDisplayed;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.eshopbd.R;

public class Interior_materials extends Fragment {
    public Interior_materials(){

    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        View WINDOWS = inflater.inflate(R.layout.interior_materials,container,false);
        return WINDOWS;
    }
}
