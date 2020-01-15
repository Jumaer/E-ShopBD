package com.example.eshopbd.ui.home;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import com.example.eshopbd.Construction_materials;
import com.example.eshopbd.R;
import com.example.eshopbd.products_to_beDisplayed.Construction_chymecals;
import com.example.eshopbd.products_to_beDisplayed.Discount_products;
import com.example.eshopbd.products_to_beDisplayed.Thai_aluminium;
import com.example.eshopbd.products_to_beDisplayed.Lighting_gallery;
import com.example.eshopbd.products_to_beDisplayed.Tiles_gallery;
import com.example.eshopbd.products_to_beDisplayed.Paint_Gallery;
import com.example.eshopbd.products_to_beDisplayed.MM_SS_Materials;
import com.example.eshopbd.products_to_beDisplayed.Plumbing_materials;
import com.example.eshopbd.products_to_beDisplayed.Electrical_products;
import com.example.eshopbd.products_to_beDisplayed.Hardware_tools;
import com.example.eshopbd.products_to_beDisplayed.Interior_materials;
import com.example.eshopbd.ui.home.array_list.Slide;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class HomeFragment extends Fragment  {

    public   HomeFragment(){

    }






    //  for all card views...

 private   CardView discount_products, construction_materials, construction_chemical, plumbing_materials, mm_ss_materials,
         electrical_products, lighting_gallery,sanitary_fittings, tiles_gallery, thai_fittings, interior_materials,
         hardware_tools, paint_gallery;


    //viewpager..code....

    private   ViewPager viewPager;
    private List<Slide> slideList = new ArrayList<>();
    private Timer timer;
    private int current_position = 0;
    private LinearLayout dotsLayout;
    private int custom_dot_position=0;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        View home = inflater.inflate(R.layout.fragment_home,container,false);

        //id conformation..CardViews..
        discount_products =(CardView) home.findViewById(R.id.discount_product);
          construction_materials =(CardView)home.findViewById(R.id.construction_materials) ;
        construction_chemical =(CardView)home.findViewById(R.id.construction_chemicals) ;
        plumbing_materials =(CardView)home.findViewById(R.id.plumbing_materials) ;
        mm_ss_materials =(CardView)home.findViewById(R.id.mm_ss_materilas) ;
        electrical_products =(CardView)home.findViewById(R.id.electrical_products) ;
        lighting_gallery =(CardView)home.findViewById(R.id.light_gallery) ;
        sanitary_fittings=(CardView) home.findViewById(R.id.sanitary_fittings);
        tiles_gallery =(CardView)home.findViewById(R.id.tiles_gallery) ;
        thai_fittings =(CardView)home.findViewById(R.id.thai_aluminium) ;
        interior_materials =(CardView)home.findViewById(R.id.interior_materials) ;
        hardware_tools =(CardView)home.findViewById(R.id.hardware_and_tools) ;
        paint_gallery =(CardView)home.findViewById(R.id.paint_gallery) ;


        // leave..back





     // onClick listeners for card views
        discount_products.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager= getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
                fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
                fragmentTransaction.add(R.id.nav_host_fragment, new Discount_products());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        construction_materials.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), Construction_materials.class);
                startActivity(i);
                ((Activity) getActivity()).overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);

            }
        });

        construction_chemical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager= getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
                fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
                fragmentTransaction.add(R.id.nav_host_fragment, new Construction_chymecals());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });
        plumbing_materials.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager= getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
                fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
                fragmentTransaction.add(R.id.nav_host_fragment, new Plumbing_materials());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
        mm_ss_materials.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager= getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
                fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
                fragmentTransaction.add(R.id.nav_host_fragment, new MM_SS_Materials());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });

        electrical_products.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager= getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
                fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
                fragmentTransaction.add(R.id.nav_host_fragment, new Electrical_products());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });
        lighting_gallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager= getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
                fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
                fragmentTransaction.add(R.id.nav_host_fragment, new Lighting_gallery());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });
        sanitary_fittings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getActivity(),"it has not been made yet..",Toast.LENGTH_SHORT).show();
            }
        });
        tiles_gallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager= getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
                fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
                fragmentTransaction.add(R.id.nav_host_fragment, new Tiles_gallery());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });
        thai_fittings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager= getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
                fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
                fragmentTransaction.add(R.id.nav_host_fragment, new Thai_aluminium());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });
        interior_materials.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager= getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
                fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
                fragmentTransaction.add(R.id.nav_host_fragment, new Interior_materials());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });
        hardware_tools.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager= getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
                fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
                fragmentTransaction.add(R.id.nav_host_fragment, new Hardware_tools());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });

        paint_gallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager= getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
                fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
                fragmentTransaction.add(R.id.nav_host_fragment, new Paint_Gallery());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });















        //view..
        viewPager = (ViewPager)home.findViewById(R.id.view_pager_forHomepage);
        //dots..
        dotsLayout =(LinearLayout) home.findViewById(R.id.dots_Layout);
        prepareslide();
        ViewPagerAdapterHome viewPagerAdapterHome = new ViewPagerAdapterHome(slideList,getActivity());
        viewPager.setAdapter(viewPagerAdapterHome);
       preparedots(custom_dot_position++);
        createSlideshow();

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                try{
                   try{
                       if(custom_dot_position>(slideList.size()-1))
                           custom_dot_position=0;
                   }
                   catch (Exception m){
                       System.out.println(m);
                   }

                        try{
                            preparedots(custom_dot_position++);
                        }
                        catch (Exception N){
                            System.out.println(N);
                        }

                }
                catch (Exception E)
                {
                    Toast.makeText(getActivity(),"CHANGED",Toast.LENGTH_SHORT).show();
                }


            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        return home;
    }






    //dots..code..according to the slider..
    private void preparedots(int currentSlidePosition){
        if(dotsLayout.getChildCount()>0)
            dotsLayout.removeAllViews();

        ImageView dots[]= new ImageView[slideList.size()];
        for(int i=0 ; i<slideList.size() ; i++){
            dots[i] = new ImageView(getActivity());
            if(i==currentSlidePosition)
                dots[i].setImageDrawable(ContextCompat.getDrawable(getActivity(),R.drawable.active_dot));
            else
                dots[i].setImageDrawable(ContextCompat.getDrawable(getActivity(),R.drawable.inactive_dot));


            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT);
            layoutParams.setMargins(6,0,6,0);
            dotsLayout.addView(dots[i],layoutParams);

        }

    }













    //   page slider code....
    private void prepareslide(){

        int[]imageId= {R.drawable.logo_final,R.drawable.banner,R.drawable.banner2,R.drawable.banner3,R.drawable.ban_temp};


        for(int count =0; count<imageId.length;count++){


            slideList.add(new Slide(imageId[count]));
        }

    }

    private void createSlideshow()
    {
           final Handler handler = new Handler();
           final Runnable runnable = new Runnable() {
               @Override
               public void run() {
                   try{
                       if(current_position== Integer.MAX_VALUE)
                           current_position =0;
                         try{viewPager.setCurrentItem(current_position++,true);}
                         catch (Exception e){
                             Toast.makeText(getActivity(),"CHANGED",Toast.LENGTH_SHORT).show();
                         }


                   }
                   catch (Exception e){
                       System.out.println(e);
                   }


               }
           };

           timer = new Timer();
           timer.schedule(new TimerTask() {
               @Override
               public void run() {
                       handler.post(runnable);
               }
           },250,2500);



    }


}