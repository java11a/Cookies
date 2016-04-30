package com.yasam.cookies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void eatCookie(View view) {
        ImageView iv = (ImageView) findViewById(R.id.imgVw_status);
        if(iv != null)
            iv.setImageResource(R.drawable.after_cookie);

        TextView tv = (TextView) findViewById(R.id.txtVw_status);
        if(tv != null)
            tv.setText(R.string.after_cookie);
    }
}
