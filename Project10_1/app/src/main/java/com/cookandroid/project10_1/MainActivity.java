package com.cookandroid.project10_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RadioGroup rg;
    Button btn;
    EditText edX,edY;
    ArrayList<String> hobby = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("이삭");
        rg=findViewById(R.id.rg);
        btn=findViewById(R.id.btn);
        edX=findViewById(R.id.edX);
        edY=findViewById(R.id.edY);
        hobby.add("음악");
        hobby.add("게임");
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                int x = Integer.parseInt(edX.getText().toString());
                int y = Integer.parseInt(edY.getText().toString());
                if(rg.getCheckedRadioButtonId()==R.id.rbSecond){
                    intent = new Intent(getApplicationContext(),SecondActivity.class);

                }else{
                    intent = new Intent(getApplicationContext(),ThirdActivity.class);

                }
                intent.putExtra("numX",x);
                intent.putExtra("numY",y);
                intent.putExtra("hobby",hobby);
                startActivity(intent);
            }
        });
    }
}