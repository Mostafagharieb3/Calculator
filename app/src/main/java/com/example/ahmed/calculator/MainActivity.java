package com.example.ahmed.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView screen;
    private String str,sign,str2,res;
    private double num1,num2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        screen=(TextView)findViewById(R.id.text);
        str="";
    }
    public void onClick(View v){
        Button button =(Button)v;
        str+=button.getText().toString();
        screen.setText(str);
        num1=Double.parseDouble(str);

    }
    public void onClickSigns(View v){
        Button button=(Button)v;
        sign=button.getText().toString();
        screen.setText(sign);
        str="";
    }
    public void calculate(View v){
        Button button=(Button)v;
        str2= screen.getText().toString();
        num2=Double.parseDouble(str2);
        if(sign.equals("+")){
         res= num1+num2+"";
        }
        else if(sign.equals("-")){
            res=num1-num2+"";
        }
        else if(sign.equals("*")){
            res=num1*num2+"";
        }
        else if(sign.equals("/")){
            res=num1/num2+"";
        }
        str=res;
        screen.setText(str);
    }
}
