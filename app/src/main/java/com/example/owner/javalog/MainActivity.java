package com.example.owner.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Human human= new Human("渡部",58,"ゴルフ");     // 名前を、年齢渡部歳で、Humanのインスタンスを作る

       human.say();  // （ログ出力）
        Log.d("javatest", "私の名前は" + human.name + "です。");
        Log.d("javatest", "私の年齢は" + human.age + "歳です。");


    }

}