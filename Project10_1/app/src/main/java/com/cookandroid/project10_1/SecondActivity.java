package com.cookandroid.project10_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    Button btnSecond;
    TextView txtAdd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        btnSecond=findViewById(R.id.btnSecond);
        txtAdd=findViewById(R.id.txtAdd);
        Intent in = getIntent();
        int x = in.getIntExtra("numX",0);
        int y = in.getIntExtra("numY",0);
        txtAdd.setText("덧셈결과 : "+(x+y));
        ArrayList<String> ho = in.getStringArrayListExtra("hobby");
        btnSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}