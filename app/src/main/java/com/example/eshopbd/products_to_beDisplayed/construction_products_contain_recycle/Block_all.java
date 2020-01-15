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
import com.example.eshopbd.all_recycler_view_code.construction_materials_product_subcatagory_recycler.all_adapter_class.blocks_recycle_product_package.Blocks_materials_all_company_adapter;
import com.example.eshopbd.all_recycler_view_code.construction_materials_product_subcatagory_recycler.all_company_model_class.blocks_recycle_product_package_model.Blocks_materials_all_category_core;

public class Block_all extends AppCompatActivity implements Blocks_materials_all_company_adapter.Block_category_click {
    RecyclerView recycle_all_block_companies;
    Blocks_materials_all_company_adapter bl_category;
    ImageView back_to_block;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_ACTION_BAR);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_block_all);
        final FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        if (savedInstanceState==null){
            getSupportFragmentManager().beginTransaction().replace(R.id.frame_container_block,new Block_products()).commit();


        }
        recycle_all_block_companies = findViewById(R.id.recycle_all_block_companies);
        back_to_block = findViewById(R.id.back_to_prev_block);
        recycle_all_block_companies = findViewById(R.id.recycle_all_block_companies);
        bl_category = new Blocks_materials_all_company_adapter(this, Blocks_materials_all_category_core.generate_blocks_materials_all_category_cores(),this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recycle_all_block_companies.setLayoutManager(linearLayoutManager);
        recycle_all_block_companies.setAdapter(bl_category);
    }

    @Override
    public void onBlock_click(Blocks_materials_all_category_core blocks_materials_all_category_core) {

        FragmentManager fragmentManager= getSupportFragmentManager();
        FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.frame_container_block, new Block_products());
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();

    }
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    public void openActivity_next_move(View view) {
        Intent intent = new Intent(this, Construction_materials.class);
        startActivity(intent);
        finishAffinity();
        ActivityCompat.finishAffinity(Block_all.this);
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this, Construction_materials.class);
        startActivity(intent);
        finishAffinity();
        ActivityCompat.finishAffinity(Block_all.this);
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }
}
