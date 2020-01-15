package com.example.eshopbd;

import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.example.eshopbd.special_method_class_interface_package.CloseApplication;
import com.example.eshopbd.ui.account_fragment_all.Account_Open_Control_Fragment;
import com.example.eshopbd.ui.any_queries.Any_queries;
import com.example.eshopbd.ui.all_product.All_products;
import com.example.eshopbd.ui.home.HomeFragment;
import com.example.eshopbd.ui.navigation_classes.Dealing;
import com.example.eshopbd.ui.navigation_classes.Fix_meetings;
import com.example.eshopbd.ui.navigation_classes.Full_Package_Order;
import com.example.eshopbd.ui.navigation_classes.Order_cement_sands;
import com.example.eshopbd.ui.navigation_classes.Order_of_Bricks;
import com.example.eshopbd.ui.navigation_classes.Order_of_electrical_feetings;
import com.example.eshopbd.ui.navigation_classes.Order_of_rod_metals;
import com.example.eshopbd.ui.navigation_classes.Order_of_senitary_items;
import com.example.eshopbd.ui.navigation_classes.Others_order;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.graphics.drawable.DrawerArrowDrawable;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ActivityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;


public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;



    //  Drawer Nav...

    DrawerLayout drawerLayout;
    Toolbar toolbar;
    NavigationView navigationView;
    ActionBarDrawerToggle toggle;
    RelativeLayout relative_leave;

    private View cView;
    private static final float END_SCALE = 0.7f;


    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        final FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        cView = findViewById(R.id.content);
        Intent intent = getIntent();
        bottomNavigationView =(BottomNavigationView)findViewById(R.id.nav_view) ;



        if (savedInstanceState==null){
            getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment,new HomeFragment()).commit();


        }


//  navigation drawer code

        drawerLayout = findViewById(R.id.drawer);
        toolbar = findViewById(R.id.tool_bar_Nav);
        navigationView = findViewById(R.id.Navigation_drawer_left_side);
        toolbar.setNavigationIcon(new DrawerArrowDrawable(this));
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (drawerLayout.isDrawerOpen(navigationView)) {
                    drawerLayout.closeDrawer(navigationView);

                }
                else {
                    drawerLayout.openDrawer(navigationView);
                }
            }
        });
        // DRAWER ANIMATION...
        drawerLayout.setScrimColor(Color.TRANSPARENT);
        drawerLayout.addDrawerListener(new DrawerLayout.SimpleDrawerListener() {
                                           @Override
                                           public void onDrawerSlide(View drawerView, float slideOffset) {

                                               // Scale the View based on current slide offset
                                               final float diffScaledOffset = slideOffset * (1 - END_SCALE);
                                               final float offsetScale = 1 - diffScaledOffset;
                                               cView.setScaleX(offsetScale);
                                               cView.setScaleY(offsetScale);

                                               // Translate the View, accounting for the scaled width
                                               final float xOffset = drawerView.getWidth() * slideOffset;
                                               final float xOffsetDiff = cView.getWidth() * diffScaledOffset / 2;
                                               final float xTranslation = xOffset - xOffsetDiff;
                                               cView.setTranslationX(xTranslation);
                                           }

                                           @Override
                                           public void onDrawerClosed(View drawerView) {

                                           }
                                       }
        );



       //  item listener..navigation drawer
       navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
           @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
           @Override
           public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
               int id = menuItem.getItemId();
               if(id==R.id.bricks){

                   getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment,new Order_of_Bricks()) .commit();
               }
               if(id==R.id.cement){

                   getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment,new Order_cement_sands()) .commit();
               }
               if(id==R.id.rod){

                   getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment,new Order_of_rod_metals()) .commit();
               }
               if(id==R.id.bathroom_Senitary){

                   getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment,new Order_of_senitary_items()) .commit();
               }
               if(id==R.id.electrical_fittings){

                   getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment,new Order_of_electrical_feetings()) .commit();
               }
               if(id==R.id.inner_home_fittings){

                   getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment,new Others_order()) .commit();
               }
               if(id==R.id.navigation_product2){

                   getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment,new Dealing()) .commit();
               }
               if(id==R.id.navigation_product3){

                   getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment,new Full_Package_Order()) .commit();
               }
               if(id==R.id.navigation_product4){


                   getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment,new Fix_meetings()) .commit();
               }
               if(id==R.id.leave){

                   Intent intent = new Intent(MainActivity.this, ClosingActivity.class);
                   startActivity(intent);

                   overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);

               }
               return false;

           }
       });





        // bottom navigation item selection code...

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                Fragment fragment = null;
                item.setChecked(true).setEnabled(true);

                try{ switch (item.getItemId()) {
                        case R.id.navigation_home:
                            fragment = new HomeFragment();

                            break;
                        case R.id.navigation_drawer:
                            fragment = new Account_Open_Control_Fragment();

                            break;
                        case R.id.navigation_dashboard:
                            fragment = new All_products();


                            break;
                        case R.id.extra:
                            fragment = new Any_queries();

                            break;
                    }

                  return loadFragment(fragment);

                }

                catch (Exception e){

                }




                getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment,fragment).commit();





                return false;
            }



        });




    }
    private boolean loadFragment(Fragment fragment) {
        if(fragment != null) {
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.setCustomAnimations(R.anim.slide_in_right, R.anim.slide_out_left);
            transaction.add(R.id.nav_host_fragment, fragment);
            transaction.commit();
            return true;
        }
        return false;
    }
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        // TODO Auto-generated method stub
        super.onConfigurationChanged(newConfig);
    }


}
