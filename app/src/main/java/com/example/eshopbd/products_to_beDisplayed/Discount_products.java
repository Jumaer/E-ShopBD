package com.example.eshopbd.products_to_beDisplayed;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.example.eshopbd.R;
import com.example.eshopbd.all_recycler_view_code.discount_recycle.adapter_recycle.Discount_Adapter;
import com.example.eshopbd.all_recycler_view_code.discount_recycle.model_recycle.DiscountModel;

public class Discount_products extends Fragment {
  public  Discount_products(){


    }
      RecyclerView recyclerView_discount;
  Discount_Adapter  discount_adapter ;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View discount = inflater.inflate(R.layout.discount_layout,container,false);
        recyclerView_discount = (RecyclerView)discount.findViewById(R.id.discount_recycler);
        discount_adapter = new Discount_Adapter(getActivity(), DiscountModel.generate_discountModels());
        GridLayoutManager layoutManager = new GridLayoutManager(getContext(),2);
        recyclerView_discount.setLayoutManager(layoutManager);
        recyclerView_discount.setAdapter(discount_adapter);

        return discount ;
    }
}
