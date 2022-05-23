package com.cookandroid.intentex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {
    Button btn1;

    TextView txtName,txtAge,txtHobby;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        txtAge=findViewById(R.id.txtAge);
        txtName=findViewById(R.id.txtName);
        txtHobby=findViewById(R.id.txtHobby);
        btn1=findViewById(R.id.btn1);
        Intent in = getIntent();
        String name = in.getStringExtra("name");
        txtName.setText("이름"+name);
        int age = in.getIntExtra("age",1);
        txtAge.setText("나이"+age);
        ArrayList<String> ho = in.getStringArrayListExtra("hobby");
        String hobb = "";
        for(int i=0;i<ho.size();i++)
            hobb +=" "+ ho.get(i) + " ";
        txtHobby.setText("취미"+hobb);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}