package com.example.eshopbd;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import com.example.eshopbd.special_method_class_interface_package.CloseApplication;

public class ClosingActivity extends Activity implements CloseApplication {
    Button removeBTN, cancelBTN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_closing);


        DisplayMetrics dm= new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width= dm.widthPixels;
        int height= dm.heightPixels;

        getWindow().setLayout((int)(width*.9), (int)(height*.2));
        getWindow().setBackgroundDrawable(getResources().getDrawable(R.drawable.button_design));

        WindowManager.LayoutParams params= getWindow().getAttributes();
        params.gravity= Gravity.CENTER;
        params.x= 0;
        params.y= -20;
        getWindow().setAttributes(params);

        removeBTN= (Button) findViewById(R.id.removebtnid);
        cancelBTN= (Button) findViewById(R.id.cancelbtnid);

        removeBTN.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                onClosing_appActivity();
            }
        });

        cancelBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Continue to the work",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(ClosingActivity.this, MainActivity.class);
                startActivity(intent);
                finish();

                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
            }
        });


        Bundle bundle =getIntent().getExtras();
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public void onClosing_appActivity() {


        finishAffinity();
        ActivityCompat.finishAffinity(ClosingActivity.this);
    }

    @Override
    public void onClosing_Fragments() {
        // Need not to use this..
    }


}
