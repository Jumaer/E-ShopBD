package com.example.eshopbd.ui.home;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.eshopbd.R;
import com.example.eshopbd.ui.home.array_list.Slide;

import java.util.List;
import java.util.Timer;

public class ViewPagerAdapterHome extends PagerAdapter {

    private Context context ;
    private LayoutInflater inflater;
    private List<Slide> slides ;
    private int customPosition = 0;


    public ViewPagerAdapterHome( List<Slide> slides, Context context){
            this.slides = slides;
         this.context = context;
        inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public int getCount() {
        return Integer.MAX_VALUE;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }


    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        if(customPosition>(slides.size()-1))
            customPosition =0;

        Slide slide =slides.get(customPosition);
        customPosition++;
      //  inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view =inflater.inflate(R.layout.viewpager_home,container,false);
        ImageView imageView = (ImageView)view.findViewById(R.id.viewpagerAdapterImage);
        imageView.setImageResource(slide.getPicture());
        ViewPager viewPager = (ViewPager)container;
        viewPager.addView(view);
        return view ;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        ViewPager viewPager = (ViewPager)container;
      View view = (View)object;
        viewPager.removeView(view);
    }
}
