package com.cookandroid.android0314_01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edX,edY;
    Button btnAdd,btnSub,btnMul,btnDiv;
    TextView txtResult;
    String strNum1,strNum2;
    Integer result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ch4_1);
        setTitle("이삭");
        edX = findViewById(R.id.edX);
        edX = findViewById(R.id.edY);
        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnMul = findViewById(R.id.btnMul);
        btnDiv = findViewById(R.id.btnDiv);
        txtResult = findViewById(R.id.txtResult);
       btnAdd.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               strNum1=edX.getText().toString();
               strNum1=edX.getText().toString();
               result=Integer.parseInt(strNum1)+Integer.parseInt(strNum2);
               txtResult.setText("계산결과:"+result.toString());
           }
       });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                strNum1=edX.getText().toString();
                strNum1=edX.getText().toString();
                result=Integer.parseInt(strNum1)-Integer.parseInt(strNum2);
                txtResult.setText("계산결과:"+result.toString());
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                strNum1=edX.getText().toString();
                strNum1=edX.getText().toString();
                result=Integer.parseInt(strNum1)*Integer.parseInt(strNum2);
                txtResult.setText("계산결과:"+result.toString());
            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                strNum1=edX.getText().toString();
                strNum1=edX.getText().toString();
                result=Integer.parseInt(strNum1)/Integer.parseInt(strNum2);
                txtResult.setText("계산결과:"+result.toString());
            }
        });
          }
}