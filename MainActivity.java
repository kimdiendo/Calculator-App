package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.view.View;
public class MainActivity extends AppCompatActivity {
    EditText ed;
    String old_number;
    String new_number;
    String operator ="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed = findViewById(R.id.editText);
    }

    public void numberEvent(View view)
    {
        String number = ed.getText().toString();
        switch(view.getId()) {
            case R.id.btnSeven:
                number += "7";
                break;
            case R.id.btnNine:
                number += "9";
                break;
            case R.id.btnEight:
                number += "8";
                break;
            case R.id.btnSix:
                number += "6";
                break;
            case R.id.btnFive:
                number += "5";
                break;
            case R.id.btnFour:
                number += "4";
                break;
            case R.id.btnThree:
                number += "3";
                break;
            case R.id.btnTwo:
                number += "2";
                break;
            case R.id.btnOne:
                number += "1";
                break;
            case R.id.btnZero:
                number += "0";
                break;
        }
        ed.setText(number);
    }
    public void operatorEvent(View view)
    {
       old_number = ed.getText().toString();
       ed.getText().clear();
       operator = ed.getText().toString();
        switch(view.getId()) {
            case R.id.btnPlus:
                operator = "+";
                break;
            case R.id.btnMinus:
                operator = "-";
                break;
            case R.id.btnMultiple:
                operator = "*";
                break;
            case R.id.btnDivide:
                operator = "/";
                break;
            case R.id.btnPercentage:
                operator = "%";
                break;
        }
        ed.setText(operator);
        ed.getText().clear();
    }
    public void equatorEvent(View view)
    {
         new_number = ed.getText().toString();
         ed.getText().clear();
         double result= 0.0 ;
         switch (operator)
         {

             case "+":
                 result = Double.parseDouble(new_number) + Double.parseDouble(old_number);
                 break;
             case  "-":
                 result = Double.parseDouble(old_number) - Double.parseDouble(new_number);
                 break;
             case  "*":
                 result = Double.parseDouble(new_number) * Double.parseDouble(old_number);
                 break;
             case "/":
                 result = Double.parseDouble(old_number) / Double.parseDouble(new_number);
                 break;
             case "%":
                 result = Double.parseDouble(old_number) /100;
         }
         ed.setText(Double.toString(result));
    }
    public void deleteall (View view)
    {
        ed.getText().clear();
    }
    public void deleteEvent(View view)
    {
        String str = ed.getText().toString();
        ed.getText().clear();
        String str_new ="";
        for (int i=0; i<str.length()-1;i++)
        {
            str_new += str.charAt(i);
        }
        ed.setText(str_new);

    }
}