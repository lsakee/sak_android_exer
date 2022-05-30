package com.cookandroid.project10_3_putgetactivity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edtX , edtY;
    Button btnAdd;
    TextView txtResult;
    RadioButton radioAdd,radioSub,radioMul,radioDiv;
    RadioGroup radioG;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("이삭 양방향엑티비티");
        radioG = findViewById(R.id.radioG);
        radioAdd=findViewById(R.id.radioAdd);
        radioSub=findViewById(R.id.radioSub);
        radioMul=findViewById(R.id.radioMul);
        radioDiv=findViewById(R.id.radioDiv);
        edtX=findViewById(R.id.edtX);
        edtY=findViewById(R.id.edtY);
        txtResult=findViewById(R.id.txtResult);
        btnAdd=findViewById(R.id.btnAdd);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(getApplicationContext(),SecondActivity.class);
                switch (radioG.getCheckedRadioButtonId()){
                    case R.id.radioAdd:
                        intent.putExtra("Calc","+");
                        break;
                    case R.id.radioSub:
                        intent.putExtra("Calc","-");
                        break;
                    case R.id.radioMul:
                        intent.putExtra("Calc","*");
                        break;
                    case R.id.radioDiv:
                        intent.putExtra("Calc","/");
                        break;
                }
                intent.putExtra("numX",Integer.parseInt(edtX.getText().toString()));
                intent.putExtra("numY",Integer.parseInt(edtY.getText().toString()));
                startActivityForResult(intent,0);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {

        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode==RESULT_OK){

            int sum = data.getIntExtra("sum",0);
            txtResult.setText("결과 : " + sum);

        }

    }

}