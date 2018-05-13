package com.example.bean.bean.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.bean.bean.R;

public class BeanMainActivity extends Activity {

    private TextView tv_1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bean_main_layout);
        tv_1 = findViewById(R.id.bean_main_tv_1);
        tv_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(BeanMainActivity.this,"触摸事件发生",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
