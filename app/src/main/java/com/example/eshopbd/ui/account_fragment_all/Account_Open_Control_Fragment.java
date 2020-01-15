package com.example.eshopbd.ui.account_fragment_all;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.eshopbd.R;

public class Account_Open_Control_Fragment extends Fragment {

    public Account_Open_Control_Fragment(){


    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        View all_display_nav = inflater.inflate(R.layout.fragment_account_open_control,container,false);
        return all_display_nav;
    }
}
