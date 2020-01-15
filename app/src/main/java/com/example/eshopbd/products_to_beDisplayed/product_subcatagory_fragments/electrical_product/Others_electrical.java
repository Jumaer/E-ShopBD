package com.example.eshopbd.products_to_beDisplayed.product_subcatagory_fragments.electrical_product;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.eshopbd.R;

public class Others_electrical extends Fragment {
  public  Others_electrical(){


    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v_other_electrical = inflater.inflate(R.layout.electrical_others_product_layout,container,false);
        return v_other_electrical;
    }
}
