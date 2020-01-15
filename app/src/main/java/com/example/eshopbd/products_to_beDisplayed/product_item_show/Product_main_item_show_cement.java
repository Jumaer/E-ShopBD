package com.example.eshopbd.products_to_beDisplayed.product_item_show;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;

import com.example.eshopbd.R;

public class Product_main_item_show_cement extends Fragment {
  public Product_main_item_show_cement(){


    }
RelativeLayout relativeLayout1,relativeLayout2,relative_layout_product_description;
  RelativeLayout relativeLayout_display;
  TextView product1,description;
  LinearLayout text_product,show_product;


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v_product_core_view_display = inflater.inflate(R.layout.product_main_item_show_cement,container,false);

      relative_layout_product_description = (RelativeLayout) v_product_core_view_display.findViewById(R.id.relative_Layout_product_description);
      relativeLayout1 = (RelativeLayout)  v_product_core_view_display.findViewById(R.id.Product_visibility_info);
      relativeLayout2 =(RelativeLayout)v_product_core_view_display.findViewById(R.id.description_visibility_info);
      product1= (TextView) v_product_core_view_display.findViewById(R.id.product);
      description=(TextView) v_product_core_view_display.findViewById(R.id.description_rod);

     text_product = v_product_core_view_display.findViewById(R.id.text_line);
     show_product= v_product_core_view_display.findViewById(R.id.pro_line);

      relativeLayout_display= (RelativeLayout) v_product_core_view_display.findViewById(R.id.relativeLayout_display);



      //  By default color..
        relativeLayout1.setBackgroundResource(R.color.colorAppTheme);
        relativeLayout2.setBackgroundResource(R.color.Sub_colorAppTheme);
        product1.setTextColor(Color.parseColor("#FFFFFF"));
        description.setTextColor(Color.parseColor("#dd9900"));
        text_product.setBackgroundResource(R.color.colorAppTheme);
        show_product.setBackgroundResource(R.color.Sub_colorAppTheme2);





      relativeLayout1.setOnClickListener(new View.OnClickListener() {

          @Override
          public void onClick(View v) {

             relativeLayout1.setBackgroundResource(R.color.colorAppTheme);
             relativeLayout2.setBackgroundResource(R.color.Sub_colorAppTheme);
             product1.setTextColor(Color.parseColor("#FFFFFF"));
             description.setTextColor(Color.parseColor("#dd9900"));
             relative_layout_product_description.setVisibility(View.GONE);
             relativeLayout_display.setVisibility(View.VISIBLE);
              text_product.setBackgroundResource(R.color.colorAppTheme);
              show_product.setBackgroundResource(R.color.Sub_colorAppTheme2);

          }
      });
        relativeLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               relativeLayout1.setBackgroundResource(R.color.Sub_colorAppTheme);
                relativeLayout2.setBackgroundResource(R.color.colorAppTheme);
                description.setTextColor(Color.parseColor("#FFFFFF"));
                product1.setTextColor(Color.parseColor("#dd9900"));
                relativeLayout_display.setVisibility(View.GONE);
                relative_layout_product_description.setVisibility(View.VISIBLE);
                text_product.setBackgroundResource(R.color.Sub_colorAppTheme2);
                show_product.setBackgroundResource(R.color.colorAppTheme);

            }
        });
        return  v_product_core_view_display;
    }


}
