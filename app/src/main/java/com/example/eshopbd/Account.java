package com.example.eshopbd;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.eshopbd.special_method_class_interface_package.CloseApplication;

public class Account extends AppCompatActivity implements CloseApplication {
    TextView skip;
    RelativeLayout relativeLayout;
    RelativeLayout leave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        relativeLayout=(RelativeLayout)findViewById(R.id.relative_next_page);
        leave = (RelativeLayout)findViewById(R.id.leave) ;
       leave.setOnClickListener(new View.OnClickListener() {
           @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
           @Override
           public void onClick(View v) {

           onClosing_appActivity();


           }
       });
       skip=(TextView)findViewById(R.id.SkipText_view);

    }
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    public void openActivity2(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finishAffinity();
        ActivityCompat.finishAffinity(Account.this);
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }


    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public void onClosing_appActivity() {

        finishAffinity();
        ActivityCompat.finishAffinity(Account.this);
    }

    @Override
    public void onClosing_Fragments() {
        //  not using.. This method..  it will be used for fragments..
    }
}
