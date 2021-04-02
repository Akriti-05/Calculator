package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etFirst, etSecond;
    TextView tvAns;
    Button add, sub, mul, div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFirst= findViewById(R.id.etFirst);
        etSecond= findViewById(R.id.etSecond);
        tvAns= findViewById(R.id.tvAns);
        add= findViewById(R.id.btnAdd);
        sub= findViewById(R.id.btnSub);
        mul= findViewById(R.id.btnMultiply);
        div= findViewById(R.id.btnDiv);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstValue, secondValue, ans;
                firstValue = Integer.parseInt(etFirst.getText().toString());
                secondValue = Integer.parseInt(etSecond.getText().toString());
                ans= firstValue+secondValue;
                tvAns.setText("Ans is =" +ans);
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstValue, secondValue, ans;
                firstValue = Integer.parseInt(etFirst.getText().toString());
                secondValue = Integer.parseInt(etSecond.getText().toString());
                ans= firstValue-secondValue;
                tvAns.setText("Ans is =" +ans);
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstValue, secondValue, ans;
                firstValue = Integer.parseInt(etFirst.getText().toString());
                secondValue = Integer.parseInt(etSecond.getText().toString());
                ans= firstValue*secondValue;
                tvAns.setText("Ans is =" +ans);
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstValue, secondValue, ans;
                firstValue = Integer.parseInt(etFirst.getText().toString());
                secondValue = Integer.parseInt(etSecond.getText().toString());
                ans= firstValue/secondValue;
                tvAns.setText("Ans is =" +ans);
            }
        });
    }
}