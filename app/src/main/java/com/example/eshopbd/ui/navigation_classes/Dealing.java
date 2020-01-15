package com.example.eshopbd.ui.navigation_classes;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.eshopbd.R;

public class Dealing extends Fragment {
    public   Dealing(){

    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        View deal = inflater.inflate(R.layout.dealing_fragment,container,false);
        return deal;
    }
}
