package com.cookandroid.project10_3_putgetactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    Button btnReturn;
    int sum=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        setTitle("이삭 두번째 엑티비티");

        btnReturn=findViewById(R.id.btnReturn);

        Intent intent = getIntent();
        String calc=(intent.getStringExtra("Calc"));
        if (calc.equals("+")){
            sum=intent.getIntExtra("numX",0)+intent.getIntExtra("numY",0);
        }else if (calc.equals("-")) {
            sum = intent.getIntExtra("numX", 0) - intent.getIntExtra("numY", 0);
        }else if (calc.equals("*")) {
            sum = intent.getIntExtra("numX", 0) * intent.getIntExtra("numY", 0);
        }else {
            sum = intent.getIntExtra("numX", 0) / intent.getIntExtra("numY", 0);
        }


        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent out = new Intent(getApplicationContext(),MainActivity.class);
                out.putExtra("sum",sum);
                setResult(RESULT_OK,out);
                finish();

            }

        });

    }

}