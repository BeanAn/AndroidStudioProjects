package com.example.bean.myapplication.entitys;

public class Bean {

    private String str_1;
    private String str_2;

    public Bean (String str1,String str2){
        this.str_1 = str1;
        this.str_2 = str2;
    }

    public String getStr_1() {
        return str_1;
    }

    public void setStr_1(String str_1) {
        this.str_1 = str_1;
    }

    public String getStr_2() {
        return str_2;
    }

    public void setStr_2(String str_2) {
        this.str_2 = str_2;
    }

    @Override
    public String toString() {
        return "Bean{" +
                "str_1='" + str_1 + '\'' +
                ", str_2='" + str_2 + '\'' +
                '}';
    }
}
