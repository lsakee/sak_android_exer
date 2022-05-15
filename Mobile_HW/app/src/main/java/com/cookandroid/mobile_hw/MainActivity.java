package com.cookandroid.mobile_hw;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TableLayout;

public class MainActivity extends AppCompatActivity {

    Button btn1,btn2,exit1;
    RadioButton btnG1,btnG2,btnG3,btnG4;
    EditText name,first,final1,homeWork,attend;
    RadioGroup radioG;
    TableLayout tableLayout1;
    Switch vsibleSwitch;
    private String[] Grade;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("이삭 간단 학점 계산기");


        vsibleSwitch=(Switch)findViewById(R.id.vsibleSwitch);
        tableLayout1=(TableLayout)findViewById(R.id.tableLayout_1);
        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);
        exit1=(Button)findViewById(R.id.exit1);
        btnG1=(RadioButton)findViewById(R.id.btnG1);
        btnG2=(RadioButton)findViewById(R.id.btnG2);
        btnG3=(RadioButton)findViewById(R.id.btnG3);
        btnG4=(RadioButton)findViewById(R.id.btnG4);

        name=(EditText)findViewById(R.id.name);
        first=(EditText)findViewById(R.id.first);
        final1=(EditText)findViewById(R.id.final1);
        homeWork=(EditText)findViewById(R.id.homeWork);
        attend=(EditText)findViewById(R.id.attend);

        registerForContextMenu(btn2);
        registerForContextMenu(exit1);

        radioG =(RadioGroup)findViewById(R.id.radioG);

        vsibleSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(vsibleSwitch.isChecked()){
                    tableLayout1.setVisibility(View.VISIBLE);
                }else{
                    tableLayout1.setVisibility(View.INVISIBLE);
                }

            }
        });
        final String[] Grade = {null};


        
        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                EditText mF= first;
                int m = Integer.parseInt(mF.getText().toString());

                EditText fF= final1;
                int f=Integer.parseInt(fF.getText().toString());

                EditText hF= homeWork;
                int h=Integer.parseInt(hF.getText().toString());

                EditText atF= attend;
                int at=Integer.parseInt(atF.getText().toString());

                double total = (m*0.3)+(f*0.3)+(h*0.2)+(at*0.2);

                if(btnG1.isChecked()){
                    Grade[0] =btnG1.getText().toString();
                }else if(btnG2.isChecked()){
                    Grade[0] =btnG2.getText().toString();
                }else if(btnG3.isChecked()){
                    Grade[0] =btnG3.getText().toString();
                }
                else{
                    Grade[0] =btnG4.getText().toString();
                }
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("학점계산결과");
                View dialogView=getLayoutInflater().inflate(R.layout.image_1,null);
                View dialogView2=getLayoutInflater().inflate(R.layout.image_2,null);
                View dialogView3=getLayoutInflater().inflate(R.layout.image_3,null);
                View dialogView4=getLayoutInflater().inflate(R.layout.image_4,null);
                if(total >= 90){
                    dlg.setMessage( Grade[0] +name.getText().toString()+"학생의총점은" + total);
                    dlg.setView(dialogView);
                }else if(total >= 80){
                    dlg.setMessage( Grade[0] +name.getText().toString()+"학생의총점은" + total);
                    dlg.setView(dialogView2);
                }else if(total >= 70){
                    dlg.setMessage( Grade[0] +name.getText().toString()+"학생의총점은" + total);
                    dlg.setView(dialogView3);
                }else{
                    dlg.setMessage( Grade[0] +name.getText().toString()+"학생의총점은" + total);
                    dlg.setView(dialogView4);
                }
                dlg.show();

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name.setText("");
                first.setText("");
                final1.setText("");
                homeWork.setText("");
                attend.setText("");
                radioG.clearCheck();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu_1,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId())
        {
            case R.id.exit:
                finish();
                return true;
            case R.id.reset:
                name.setText("");
                first.setText("");
                final1.setText("");
                homeWork.setText(" ");
                radioG.clearCheck();
                Grade[0]="";
                return true;

        }
        return false;
    }
}