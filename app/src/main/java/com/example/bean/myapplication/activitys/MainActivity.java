package com.example.bean.myapplication.activitys;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.bean.myapplication.R;
import com.example.bean.myapplication.contrast.MainActivity_M_V_P;
import com.example.bean.myapplication.entitys.Bean;

public class MainActivity extends AppCompatActivity implements MainActivity_M_V_P.MaincAtivityView{

    private EditText et_name;
    private EditText et_password;
    private Button bt_1;
    private MainActivity_Presenter presenter;
    private Handler mhandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        mhandler = new Handler(){
            @Override
            public void handleMessage(Message msg) {
                super.handleMessage(msg);
                switch (msg.what){
                    case 1:
                        break;
                }
            }
        };
        setPresenter();
        et_name = findViewById(R.id.editText3);
        et_password = findViewById(R.id.editText4);
        bt_1 = findViewById(R.id.button);
        bt_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.login(new Bean(et_name.getText().toString(),et_password.getText().toString()));
            }
        });
    }

    @Override
    public void LoginSuccessful() {

        Toast.makeText(MainActivity.this,"登陆成功",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void LOginfail() {

        Toast.makeText(MainActivity.this,"登录失败",Toast.LENGTH_SHORT).show();

    }

    @Override
    public void setPresenter() {

        presenter = new MainActivity_Presenter(this,MainActivity.this);

    }
}
