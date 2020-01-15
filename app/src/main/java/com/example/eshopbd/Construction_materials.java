package com.example.eshopbd;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.app.ActivityCompat;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.eshopbd.products_to_beDisplayed.construction_products_contain_recycle.Block_all;
import com.example.eshopbd.products_to_beDisplayed.construction_products_contain_recycle.Brick_all;
import com.example.eshopbd.products_to_beDisplayed.construction_products_contain_recycle.Cement_all;
import com.example.eshopbd.products_to_beDisplayed.construction_products_contain_recycle.Rod_all;
import com.example.eshopbd.products_to_beDisplayed.construction_products_contain_recycle.Sand_all;
import com.example.eshopbd.products_to_beDisplayed.construction_products_contain_recycle.Stone_all;

public class Construction_materials extends AppCompatActivity {
    CardView card_rod,card_cement,card_brick,card_sand,card_stone,card_block;
    ImageView back_to_home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_construction_materials);
        card_rod = findViewById(R.id.rod_card_category);
        card_cement = findViewById(R.id.cement_card_category);
        card_brick = findViewById(R.id.brick_card_category);
        card_sand =findViewById(R.id.sand_card_category);
        card_stone= findViewById(R.id.stone_card_category);
        card_block = findViewById(R.id.block_card_category);
        card_block.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Construction_materials.this, Block_all.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
            }
        });
        card_rod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Construction_materials.this, Rod_all.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
            }
        });
        card_cement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Construction_materials.this, Cement_all.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
            }
        });
        card_brick.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Construction_materials.this,Brick_all.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
            }
        });
        card_sand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Construction_materials.this, Sand_all.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
            }
        });
        card_stone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Construction_materials.this, Stone_all.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
            }
        });
        back_to_home= findViewById(R.id.back_to_home);
    }
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    public void openActivity_main(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finishAffinity();
        ActivityCompat.finishAffinity(Construction_materials.this);
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    public void onBackPressed() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finishAffinity();
        ActivityCompat.finishAffinity(Construction_materials.this);
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }
}
