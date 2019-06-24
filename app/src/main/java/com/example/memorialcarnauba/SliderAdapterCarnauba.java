package com.example.memorialcarnauba;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class SliderAdapterCarnauba extends PagerAdapter {

    Context contextcarnauba;
    LayoutInflater layoutInflatercarnauba;

    public SliderAdapterCarnauba(Context context){

        this.contextcarnauba = context;

    }

    //ARRAYS
    public int [] slide_imagescarnauba = {
            R.drawable.feitodacarnauba_1,
            R.drawable.feitodacarnauba_2,
            R.drawable.feitodacarnauba_4,
            R.drawable.feitodacarnauba_5,
            R.drawable.feitodacarnauba_6,
            R.drawable.feitodacarnauba_7,
            R.drawable.feitodacarnauba_8,
            R.drawable.feitodacarnauba_9,
            R.drawable.feitodacarnauba_10,
            R.drawable.feitodacarnauba_11,
            R.drawable.feitodacarnauba_12
    };



    @Override
    public int getCount() {

        return slide_imagescarnauba.length;

    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {

        return view == (RelativeLayout) o;

    }

    @Override
    public Object instantiateItem(ViewGroup container, int position){

        layoutInflatercarnauba = (LayoutInflater) contextcarnauba.getSystemService(contextcarnauba.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflatercarnauba.inflate(R.layout.slide_layout_carnauba, container, false);

        ImageView slideImageView = (ImageView) view.findViewById(R.id.slide_imageCarnauba);

        slideImageView.setImageResource(slide_imagescarnauba[position]);

        container.addView(view);
        return view;

    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object){
        container.removeView((RelativeLayout)object);
    }

}
