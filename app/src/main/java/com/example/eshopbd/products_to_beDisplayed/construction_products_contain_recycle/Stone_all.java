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
import com.example.eshopbd.all_recycler_view_code.construction_materials_product_subcatagory_recycler.all_adapter_class.stone_recycle_product_package.Stone_materials_category_complications_adapter;
import com.example.eshopbd.all_recycler_view_code.construction_materials_product_subcatagory_recycler.all_company_model_class.stone_recycle_product_package_model.Stone_materials_category_complications_class;

public class Stone_all extends AppCompatActivity implements Stone_materials_category_complications_adapter.Stone_category_item_click {
    RecyclerView recyclerView_stone_company;
    Stone_materials_category_complications_adapter stone_materials_category_complications_adapter;
    ImageView back_to_prev_stone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_stone_all);
        final FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        if (savedInstanceState==null){
            getSupportFragmentManager().beginTransaction().replace(R.id.frame_container_stone,new Stone_products()).commit();


        }


      back_to_prev_stone = findViewById(R.id.back_to_prev_stone);


        recyclerView_stone_company = findViewById(R.id.recycle_all_stone_companies);
        stone_materials_category_complications_adapter = new Stone_materials_category_complications_adapter(this, Stone_materials_category_complications_class.generate_stone_materials_company(),this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView_stone_company.setLayoutManager(linearLayoutManager);
        recyclerView_stone_company.setAdapter(stone_materials_category_complications_adapter);
    }

    @Override
    public void OnStone_ctegory_item_catgory(Stone_materials_category_complications_class stone_materials_category_complications_class) {
        FragmentManager fragmentManager= getSupportFragmentManager();
        FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
        fragmentTransaction.replace(R.id.frame_container_stone, new Stone_products());
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    public void openActivity_next_move(View view) {
        Intent intent = new Intent(this, Construction_materials.class);
        startActivity(intent);
        finishAffinity();
        ActivityCompat.finishAffinity(Stone_all.this);
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this, Construction_materials.class);
        startActivity(intent);
        finishAffinity();
        ActivityCompat.finishAffinity(Stone_all.this);
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }
}
