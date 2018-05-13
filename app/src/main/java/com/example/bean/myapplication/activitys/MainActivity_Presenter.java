package com.example.bean.myapplication.activitys;

import android.content.Context;
import com.example.bean.myapplication.contrast.MainActivity_M_V_P;
import com.example.bean.myapplication.entitys.Bean;

public class MainActivity_Presenter implements MainActivity_M_V_P.MainActivityPresenter {

    private MainActivity view;
    private MainActivity_Model model;

    public MainActivity_Presenter(MainActivity view, Context context){

        this.view = view;
        this.model = new MainActivity_Model();
    }
    @Override
    public void login(Bean bean ) {

        model.judge(bean);
        if(model.callBack()){
            view.LoginSuccessful();
        }else{
            view.LOginfail();
        }

    }

    @Override
    public void srart() {

    }

}
