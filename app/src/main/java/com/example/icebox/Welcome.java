package com.example.icebox;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

public class Welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        // 從XML載入Drawable Animation
//        AnimationDrawable ani = (AnimationDrawable)getResources().getDrawable(R.drawable.animation);
//        ImageView imgView = (ImageView)findViewById(R.id.imgView);
//        imgView.setImageDrawable(ani);
//        ani.start();


        mHandler.sendEmptyMessageDelayed(GOTO_MAIN_ACTIVITY, 3000);//3秒跳轉
    }
    private static final int GOTO_MAIN_ACTIVITY = 0;

    private Handler mHandler = new Handler()
    {
        public void handleMessage(android.os.Message msg)
        {
            switch (msg.what)
            {
                case GOTO_MAIN_ACTIVITY:
                    Intent intent = new Intent();
                    intent.setClass(Welcome.this, Framelayout_Main.class);
                    startActivity(intent);
                    finish();
                    break;
                default:
                    break;
            }
        }
    };
}