package com.example.eshopbd.products_to_beDisplayed.construction_products_contain_recycle;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.eshopbd.R;
import com.example.eshopbd.all_recycler_view_code.construction_materials_product_subcatagory_recycler.all_adapter_class.rod_recycle_product_package.Rod_products_R_company_adapter;
import com.example.eshopbd.all_recycler_view_code.construction_materials_product_subcatagory_recycler.all_company_model_class.rod_recycle_product_package_model.Rod_products_all_model_class;

public class Rod_products extends Fragment implements Rod_products_R_company_adapter.Rod_item_click {
   public Rod_products(){

    }
       RecyclerView recycle_rod;
   Rod_products_R_company_adapter rod_products_r_company_adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v_rod_all_recyle = inflater.inflate(R.layout.rod_products_container,container,false);
        recycle_rod = v_rod_all_recyle.findViewById(R.id.recycle_rod_products_all_according_company);
        rod_products_r_company_adapter = new Rod_products_R_company_adapter( getActivity(), Rod_products_all_model_class.generate_rod_products_all_model_classes(),this);
        GridLayoutManager glm = new GridLayoutManager(getContext(),2);
        recycle_rod.setLayoutManager(glm);
        recycle_rod.setAdapter(rod_products_r_company_adapter);

        return v_rod_all_recyle;
    }

    @Override
    public void OnRod_click_item(Rod_products_all_model_class rod_products_all_model_class) {
        Toast toast = Toast.makeText(getActivity(),
                "The item is clicked but the problem is display page is not ready to show",
                Toast.LENGTH_SHORT);

        toast.show();
    }
}
