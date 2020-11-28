package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class TextActivity extends AppCompatActivity {
    private Button mBtnLogin;
    private ImageView IV_imagview1;
    private ImageView IV_imagview2;
    private TextView TV_zuce;
    private TextView TV_tengxun;
    private TextView TV_xinglang;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);
        mBtnLogin=findViewById(R.id.TV_TextView);
        IV_imagview1=findViewById(R.id.IV_imagview1);
        IV_imagview2=findViewById(R.id.IV_imagview2);
        TV_zuce=findViewById(R.id.TV_zuce);
        TV_tengxun=findViewById(R.id.TV_tengxun);
        TV_xinglang=findViewById(R.id.TV_xinglang);
        TV_xinglang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TextActivity.this,WebViewActivity.class);
                startActivity(intent);
            }
        });
        TV_tengxun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TextActivity.this,WebViewActivity.class);
                startActivity(intent);
            }
        });
        mBtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TextActivity.this,WebViewActivity.class);
                Toast.makeText(TextActivity.this,"登录成功",Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }

        });
        IV_imagview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TextActivity.this,WebViewActivity.class);
                startActivity(intent);
            }
        });
        IV_imagview2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TextActivity.this,WebViewActivity.class);
                startActivity(intent);
            }
        });
        TV_zuce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TextActivity.this,WebViewActivity.class);
                startActivity(intent);
            }
        });
    }
}