package com.example.eshopbd.ui.any_queries;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.eshopbd.R;

public class Any_queries extends Fragment {
 public    Any_queries(){


    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v_any_queries = inflater.inflate(R.layout.extra_any_queries,container,false);
        return v_any_queries;
    }
}
