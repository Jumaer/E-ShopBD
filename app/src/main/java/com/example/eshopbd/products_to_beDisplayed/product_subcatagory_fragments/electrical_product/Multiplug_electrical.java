package com.example.eshopbd.products_to_beDisplayed.product_subcatagory_fragments.electrical_product;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.eshopbd.R;

public class Multiplug_electrical extends Fragment {
  public   Multiplug_electrical(){



    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v_multiplug_electrical = inflater.inflate(R.layout.electrical_multyplug_layout,container,false);
        return v_multiplug_electrical;
    }
}
