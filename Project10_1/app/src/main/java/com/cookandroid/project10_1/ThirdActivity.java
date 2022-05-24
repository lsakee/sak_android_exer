package com.cookandroid.project10_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {
    Button btnThird;
    TextView txtSub;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        btnThird=findViewById(R.id.btnThird);
        txtSub=findViewById(R.id.txtSub);
        Intent in = getIntent();
        int x = in.getIntExtra("numX",0);
        int y = in.getIntExtra("numY",0);
        txtSub.setText("뺄셈결과 : "+(x-y));
        btnThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}