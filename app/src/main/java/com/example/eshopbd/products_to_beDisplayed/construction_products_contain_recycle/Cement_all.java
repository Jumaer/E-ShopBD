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
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import com.example.eshopbd.Construction_materials;
import com.example.eshopbd.R;
import com.example.eshopbd.all_recycler_view_code.construction_materials_product_subcatagory_recycler.all_adapter_class.cement_recycle_product_package.Cement_mat_company_products_adapter;
import com.example.eshopbd.all_recycler_view_code.construction_materials_product_subcatagory_recycler.all_company_model_class.cement_recycle_product_package_model.Cement_materials_company_core_class;

public class Cement_all extends AppCompatActivity implements Cement_mat_company_products_adapter.Cement_company_click {
   RecyclerView recycle_all_cement_companies;
    Cement_mat_company_products_adapter cement_mat_company_products_adapter;
    ImageView back_to_prev_cement;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); requestWindowFeature(Window.FEATURE_ACTION_BAR);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_cement_all);
        final FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        if (savedInstanceState==null){
            getSupportFragmentManager().beginTransaction().replace(R.id.frame_container_cement,new Cement_products()).commit();


        }
        recycle_all_cement_companies = findViewById(R.id.recycle_all_cement_companies);
        cement_mat_company_products_adapter = new Cement_mat_company_products_adapter(this, Cement_materials_company_core_class.generate_core_cement(),this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recycle_all_cement_companies.setLayoutManager(linearLayoutManager);
        recycle_all_cement_companies.setAdapter(cement_mat_company_products_adapter);


        back_to_prev_cement = findViewById(R.id.back_to_prev_cement);
    }

    @Override
    public void OnClick_cement_company(Cement_materials_company_core_class cement_materials_company_core_class) {
        FragmentManager fragmentManager= getSupportFragmentManager();
        FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.frame_container_cement, new Cement_products());
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();

    }
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    public void openActivity_next_move(View view) {
        Intent intent = new Intent(this, Construction_materials.class);
        startActivity(intent);
        finishAffinity();
        ActivityCompat.finishAffinity(Cement_all.this);
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this, Construction_materials.class);
        startActivity(intent);
        finishAffinity();
        ActivityCompat.finishAffinity(Cement_all.this);
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }
}
