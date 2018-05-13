package com.example.bean.myapplication.contrast;

import com.example.bean.myapplication.entitys.Bean;
import com.example.bean.myapplication.utils.BasePresenter;
import com.example.bean.myapplication.utils.BaseView;

public class MainActivity_M_V_P {

    public interface MaincAtivityView extends BaseView{

        void LoginSuccessful();
        void LOginfail();
    }

    public interface MainActivityPresenter extends BasePresenter{

        void login(Bean bean);

    }

    public interface MainActivityModel{

        void judge (Bean bean);
    }
}
