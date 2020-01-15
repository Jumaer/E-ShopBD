package com.example.eshopbd.products_to_beDisplayed.construction_products_contain_recycle;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

import com.example.eshopbd.Construction_materials;
import com.example.eshopbd.R;
import com.example.eshopbd.all_recycler_view_code.construction_materials_product_subcatagory_recycler.all_adapter_class.sand_recycle_product_package.Sand_materials_category_complications_adapter;
import com.example.eshopbd.all_recycler_view_code.construction_materials_product_subcatagory_recycler.all_company_model_class.sand_recycle_product_package_model.Sand_materials_category_complications_class;

public class Sand_all extends AppCompatActivity implements Sand_materials_category_complications_adapter.Sand_category_click {
    RecyclerView recycle_sand_cetegories;
    Sand_materials_category_complications_adapter sand_materials_category_complications_adapter ;
   ImageView back_to_prev_sand;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_sand_all);
        final FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        if (savedInstanceState==null){
            getSupportFragmentManager().beginTransaction().replace(R.id.frame_container_sand,new Sand_products()).commit();


        }
        recycle_sand_cetegories = findViewById(R.id.recycle_all_sand_companies);
        sand_materials_category_complications_adapter = new Sand_materials_category_complications_adapter(this, Sand_materials_category_complications_class.generate_sand_companies(),this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recycle_sand_cetegories.setLayoutManager(linearLayoutManager);
        recycle_sand_cetegories.setAdapter(sand_materials_category_complications_adapter);

        back_to_prev_sand = findViewById(R.id.back_to_prev_sand);
    }

    @Override
    public void on_sand_catagory_click(Sand_materials_category_complications_class sand_materials_category_complications_class) {
        FragmentManager fragmentManager= getSupportFragmentManager();
        FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.frame_container_sand, new Sand_products());
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    public void openActivity_next_move(View view) {
        Intent intent = new Intent(this, Construction_materials.class);
        startActivity(intent);
        finishAffinity();
        ActivityCompat.finishAffinity(Sand_all.this);
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this, Construction_materials.class);
        startActivity(intent);
        finishAffinity();
        ActivityCompat.finishAffinity(Sand_all.this);
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }
}
