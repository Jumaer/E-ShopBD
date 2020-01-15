package com.example.eshopbd.products_to_beDisplayed.construction_products_contain_recycle;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import com.example.eshopbd.Construction_materials;
import com.example.eshopbd.R;
import com.example.eshopbd.all_recycler_view_code.construction_materials_product_subcatagory_recycler.all_adapter_class.bricks_recycle_product_package.Bricks_mat_all_company_adapter;
import com.example.eshopbd.all_recycler_view_code.construction_materials_product_subcatagory_recycler.all_company_model_class.bricks_recycle_product_package_model.Bricks_materials_all_company_core;

public class Brick_all extends AppCompatActivity implements Bricks_mat_all_company_adapter.Brick_company_click {
    public static final String FRAGMENT_TAG = "single";
    private Fragment fragment;
    RecyclerView recycle_brick_company ;
    Bricks_mat_all_company_adapter bricks_mat_all_company_adapter;
    ImageView back_to_prev;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_ACTION_BAR);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_brick_all);
        final FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        if (savedInstanceState==null){
            getSupportFragmentManager().beginTransaction().replace(R.id.frame_container,new Brick_products()).commit();


        }
//  recycler code..
        recycle_brick_company = findViewById(R.id.recycle_all_brick_companies);
        bricks_mat_all_company_adapter = new Bricks_mat_all_company_adapter(this, Bricks_materials_all_company_core.generate_brick_material_core_company(),this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recycle_brick_company.setHasFixedSize(true);
        recycle_brick_company.setLayoutManager(linearLayoutManager);
        recycle_brick_company.setAdapter(bricks_mat_all_company_adapter);


        //  move back..

       back_to_prev= findViewById(R.id.back_to_prev) ;
    }

    @Override
    public void onClick_Brick_company(Bricks_materials_all_company_core bricks_materials_all_company_core_click) {


        FragmentManager fragmentManager= getSupportFragmentManager();
        FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.frame_container, new Brick_products());
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();


    }
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    public void openActivity_next_move(View view) {
        Intent intent = new Intent(this, Construction_materials.class);
        startActivity(intent);
        finishAffinity();
        ActivityCompat.finishAffinity(Brick_all.this);
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this, Construction_materials.class);
        startActivity(intent);
        finishAffinity();
        ActivityCompat.finishAffinity(Brick_all.this);
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }
}
