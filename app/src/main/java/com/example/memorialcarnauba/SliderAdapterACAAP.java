package com.example.memorialcarnauba;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class SliderAdapterACAAP extends PagerAdapter {
    Context contextacaap;
    LayoutInflater layoutInflateracaap;

    public SliderAdapterACAAP (Context context){

        this.contextacaap = context;

    }

    //ARRAYS
    public int [] slide_imagesacaap = {
            R.drawable.image_slide_acaap1,
            R.drawable.image_slide_acaap4,
            R.drawable.image_slide_acaap2,
            R.drawable.image_slide_acaap3
    };

    @Override
    public int getCount() {
        return slide_imagesacaap.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == (RelativeLayout) o;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position){
        layoutInflateracaap = (LayoutInflater) contextacaap.getSystemService(contextacaap.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflateracaap.inflate(R.layout.slide_layout_acaap, container, false);

        ImageView slideImageView = (ImageView) view.findViewById(R.id.slide_imageAcaap);


        slideImageView.setImageResource(slide_imagesacaap[position]);


        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object){
        container.removeView((RelativeLayout)object);
    }
}
