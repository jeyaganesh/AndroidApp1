package com.example.deepak.informationbank;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by deepak on 4/4/17.
 */

public class SwipeCardAdapter extends PagerAdapter {
    Context context;
    String[] news;
    String[] author;
    String[] date;
    int[] images;
    LayoutInflater inflater;

    public SwipeCardAdapter(Context context, String[] news, String[] author,
                            String[] date, int[] images) {
        this.context = context;
        this.news = news;
        this.author = author;
        this.date = date;
        this.images = images;
    }

    @Override
    public int getCount() {
        return news.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((RelativeLayout) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        // Declare Variables
        TextView txtrank;
        TextView txtcountry;
        TextView txtpopulation;
        ImageView imgflag;

        inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView = inflater.inflate(R.layout.swipe_card_layout, container,
                false);

        // Locate the TextViews in viewpager_item.xml
        txtrank = (TextView) itemView.findViewById(R.id.news);
        txtcountry = (TextView) itemView.findViewById(R.id.author);
        txtpopulation = (TextView) itemView.findViewById(R.id.date);

        // Capture position and set to the TextViews
        txtrank.setText(news[position]);
        txtcountry.setText(author[position]);
        txtpopulation.setText(date[position]);

        // Locate the ImageView in viewpager_item.xml
        imgflag = (ImageView) itemView.findViewById(R.id.image);
        // Capture position and set to the ImageView
        imgflag.setImageResource(images[position]);

        // Add viewpager_item.xml to ViewPager
        ((ViewPager) container).addView(itemView);

        return itemView;
}
    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        // Remove viewpager_item.xml from ViewPager
        ((ViewPager) container).removeView((RelativeLayout) object);

    }
}