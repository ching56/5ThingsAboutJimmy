package com.example.ching.a5thingsaboutjimmy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class FiveThings extends AppCompatActivity {

    int sequence = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five_things);
    }
    public void ActionRight(View view) {

        TextView title_ch = (TextView) findViewById(R.id.title);
        TextView title_en = (TextView) findViewById(R.id.title_en);
        ImageView bg = (ImageView) findViewById(R.id.bg);
        ImageView cover = (ImageView) findViewById(R.id.cover);

        if (sequence == 0) {
            title_ch.setText("地下鐵");
            title_en.setText("The colors of sound");
            cover.setImageResource(R.drawable.one);
            bg.setImageResource(R.drawable.one_bg);
            sequence++;
        } else if (sequence == 1) {
            title_ch.setText("向左走，向右走");
            title_en.setText("Turn left, turn right");
            title_ch.setTextSize(35);
            cover.setImageResource(R.drawable.two);
            bg.setImageResource(R.drawable.two_bg);
            sequence++;
        } else if (sequence == 2) {
            title_ch.setText("1.2.3 木頭人");
            title_en.setText("Blinking Seconds");
            title_ch.setTextSize(40);
            cover.setImageResource(R.drawable.third);
            bg.setImageResource(R.drawable.third_bg);
            sequence++;
        } else if (sequence == 3) {
            title_ch.setText("星 空");
            title_en.setText("Starry Starry Night");
            cover.setImageResource(R.drawable.four);
            bg.setImageResource(R.drawable.four_bg);
            sequence++;
        } else if (sequence == 4) {
            title_ch.setText("月亮忘記了");
            title_en.setText("When the Moon Forgot");
            title_en.setTextSize(20);
            cover.setImageResource(R.drawable.five);
            bg.setImageResource(R.drawable.five_bg);
            sequence=0;
        }else {
            Log.d("error", "illegal state");
        }

    }
    public void ActionLeft(View view) {

        TextView title_ch = (TextView) findViewById(R.id.title);
        TextView title_en = (TextView) findViewById(R.id.title_en);
        ImageView bg = (ImageView) findViewById(R.id.bg);
        ImageView cover = (ImageView) findViewById(R.id.cover);

        if (sequence == 0) {
            title_ch.setText("地下鐵");
            title_en.setText("The colors of sound");
            cover.setImageResource(R.drawable.one);
            bg.setImageResource(R.drawable.one_bg);
            sequence = 4;
        } else if (sequence == 1) {
            title_ch.setText("向左走，向右走");
            title_en.setText("Turn left, turn right");
            title_ch.setTextSize(35);
            cover.setImageResource(R.drawable.two);
            bg.setImageResource(R.drawable.two_bg);
            sequence--;
        } else if (sequence == 2) {
            title_ch.setText("1.2.3 木頭人");
            title_en.setText("Blinking Seconds");
            title_ch.setTextSize(40);
            cover.setImageResource(R.drawable.third);
            bg.setImageResource(R.drawable.third_bg);
            sequence--;
        } else if (sequence == 3) {
            title_ch.setText("星 空");
            title_en.setText("Starry Starry Night");
            cover.setImageResource(R.drawable.four);
            bg.setImageResource(R.drawable.four_bg);
            sequence--;
        } else if (sequence == 4) {
            title_ch.setText("月亮忘記了");
            title_en.setText("When the Moon Forgot");
            title_en.setTextSize(20);
            cover.setImageResource(R.drawable.five);
            bg.setImageResource(R.drawable.five_bg);
            sequence--;
        } else{
            Log.d("error", "illegal state");
        }

    }
}
