package com.example.owner.javalog;

import android.os.Bundle;
import android.util.Log;

 public class Human extends Animal implements Thinkable{
    // クラス変数
    static String to_jp = "私";

    // メンバ変数
    String name;  // 名前
    int age;    // 年齢
    String hobby;  // 趣味
    // コンストラクタ
    public Human(String name, int age,String hobby) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
        name = "";
        age = 0;
        hobby = "";

    }

    // クラス関数
    public static void introduce() {
        Log.d("javatest", "これは私クラスです。");
    }

    // メンバ関数
    public void say() {
        Log.d("javatest", this.name + "(" + this.age + "歳)" );


    }
    @Override

    public void think() {
        Log.d("javatest", "私は" + "(" + this.hobby + ")" + "について考える。");
    }
}