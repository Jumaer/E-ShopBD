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
import com.example.eshopbd.all_recycler_view_code.construction_materials_product_subcatagory_recycler.all_adapter_class.rod_recycle_product_package.Rod_mat_company_products_adapter;
import com.example.eshopbd.all_recycler_view_code.construction_materials_product_subcatagory_recycler.all_company_model_class.rod_recycle_product_package_model.Rod_materials_company_core_class;

public class Rod_all extends AppCompatActivity implements Rod_mat_company_products_adapter.Rod_Click_events {
    RecyclerView recyclerView_rod_products;
    Rod_mat_company_products_adapter rod_mat_company_products_adapter;
    ImageView back_to_prev_rod;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_rod);
        final FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        if (savedInstanceState==null){
            getSupportFragmentManager().beginTransaction().replace(R.id.frame_container_rod,new Rod_products()).commit();


        }
        recyclerView_rod_products = findViewById(R.id.recycle_all_rod_products); rod_mat_company_products_adapter = new Rod_mat_company_products_adapter(this, Rod_materials_company_core_class.generate_rode_materials_company(),this);
        LinearLayoutManager glm = new LinearLayoutManager(this);
        recyclerView_rod_products.setLayoutManager(glm);
        recyclerView_rod_products.setAdapter(rod_mat_company_products_adapter);
        back_to_prev_rod = findViewById(R.id.back_to_prev_rod);
    }

    @Override
    public void onCompany_click(Rod_materials_company_core_class rod_materials_company_core_class) {
        FragmentManager fragmentManager= getSupportFragmentManager();
        FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.frame_container_rod, new Rod_products());
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    public void openActivity_next_move(View view) {
        Intent intent = new Intent(this, Construction_materials.class);
        startActivity(intent);
        finishAffinity();
        ActivityCompat.finishAffinity(Rod_all.this);
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this, Construction_materials.class);
        startActivity(intent);
        finishAffinity();
        ActivityCompat.finishAffinity(Rod_all.this);
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }
}
