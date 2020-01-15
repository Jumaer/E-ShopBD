package com.example.eshopbd.products_to_beDisplayed;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.eshopbd.R;

public class Paint_Gallery extends Fragment {
    public Paint_Gallery(){

    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        View others = inflater.inflate(R.layout.paint_gallery,container,false);
        return others;
    }
}
