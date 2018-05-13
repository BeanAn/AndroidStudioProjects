package com.example.bean.myapplication.activitys;

import com.example.bean.myapplication.contrast.MainActivity_M_V_P;
import com.example.bean.myapplication.entitys.Bean;

public class MainActivity_Model implements MainActivity_M_V_P.MainActivityModel {

    private static final String NAME = "YanBin";
    private static final String PASSWORD = "yb634548";
    private Boolean aBoolean = false;

    @Override
    public void judge(Bean bean) {
        if(bean.getStr_1().equals(NAME) && bean.getStr_2().equals(PASSWORD)){
            aBoolean = true;
        }else {
            aBoolean = false;
        }
    }

    public boolean callBack(){

        return aBoolean;
    }

}
