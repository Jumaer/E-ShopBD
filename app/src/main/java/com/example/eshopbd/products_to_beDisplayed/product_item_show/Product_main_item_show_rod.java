package com.example.eshopbd.products_to_beDisplayed.product_item_show;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.eshopbd.R;

public class Product_main_item_show_rod extends Fragment {
  public  Product_main_item_show_rod(){



    }
    TextView product_rod,description_rod;
  RelativeLayout product_description_rod,product_info_rod,product_visiablityinfo_rod,description_visiablity_info_rod;
  LinearLayout linearLayout_product_rod ,linearLayout_product_description;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v_cement_product_core_item = inflater.inflate(R.layout.product_main_item_show_rod,container,false);

        product_rod= v_cement_product_core_item.findViewById(R.id.product_rod);
        description_rod= v_cement_product_core_item.findViewById(R.id.description_rod);
        product_info_rod = v_cement_product_core_item.findViewById(R.id.relativeLayout_display_rod);
        product_description_rod= v_cement_product_core_item.findViewById(R.id.relative_Layout_product_description_rod);
        product_visiablityinfo_rod = v_cement_product_core_item.findViewById(R.id.Product_visibility_info_rod);
        description_visiablity_info_rod = v_cement_product_core_item.findViewById(R.id.description_visibility_info_rod);
        linearLayout_product_rod =v_cement_product_core_item.findViewById(R.id.pro_line);
        linearLayout_product_description = v_cement_product_core_item.findViewById(R.id.text_line);





        //   pre_defined view...

    //   product_rod.setTextColor(Color.parseColor("#ffff"));
     //   description_rod.setTextColor(Color.parseColor("#dd9900"));
        product_rod.setTextColor(Color.parseColor("#FFFFFF"));
        description_rod.setTextColor(Color.parseColor("#dd9900"));
        linearLayout_product_rod.setBackgroundResource(R.color.Sub_colorAppTheme2);
        linearLayout_product_description.setBackgroundResource(R.color.colorAppTheme);
        product_visiablityinfo_rod.setBackgroundResource(R.color.colorAppTheme);
        description_visiablity_info_rod.setBackgroundResource(R.color.Sub_colorAppTheme);
        product_info_rod.setVisibility(View.VISIBLE);
        product_description_rod.setVisibility(View.GONE);

        product_visiablityinfo_rod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                product_rod.setTextColor(Color.parseColor("#FFFFFF"));
                description_rod.setTextColor(Color.parseColor("#dd9900"));
                linearLayout_product_rod.setBackgroundResource(R.color.Sub_colorAppTheme2);
                linearLayout_product_description.setBackgroundResource(R.color.colorAppTheme);
                product_visiablityinfo_rod.setBackgroundResource(R.color.colorAppTheme);
                description_visiablity_info_rod.setBackgroundResource(R.color.Sub_colorAppTheme);
                product_info_rod.setVisibility(View.VISIBLE);
                product_description_rod.setVisibility(View.GONE);
            }
        });
        description_visiablity_info_rod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                product_rod.setTextColor(Color.parseColor("#dd9900"));
                description_rod.setTextColor(Color.parseColor("#FFFFFF"));
                linearLayout_product_description.setBackgroundResource(R.color.Sub_colorAppTheme2);
                linearLayout_product_rod.setBackgroundResource(R.color.colorAppTheme);
                description_visiablity_info_rod.setBackgroundResource(R.color.colorAppTheme);
                product_visiablityinfo_rod.setBackgroundResource(R.color.Sub_colorAppTheme);
                product_info_rod.setVisibility(View.GONE);
                product_description_rod.setVisibility(View.VISIBLE);

            }
        });

        return v_cement_product_core_item;
    }
}
