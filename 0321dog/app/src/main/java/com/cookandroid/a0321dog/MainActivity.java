package com.cookandroid.a0321dog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView Text1,Text2;
    CheckBox ChkAgree;
    RadioGroup Rgroup1;
    RadioButton RdoDog,RdoCat,RdoRabbit;
    Button BtnOK,BtnEnd;
    ImageView ImgPet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Text1 = (TextView)findViewById(R.id.Text1);
        Text2 = (TextView)findViewById(R.id.Text2);
        ChkAgree = (CheckBox) findViewById(R.id.ChkAgree);
        Rgroup1 = (RadioGroup)findViewById(R.id.Rgroup1);
        RdoCat = (RadioButton)findViewById(R.id.RdoCat);
        RdoDog = (RadioButton)findViewById(R.id.RdoDog);
        RdoRabbit = (RadioButton)findViewById(R.id.RdoRabbit);
        BtnOK = (Button)findViewById(R.id.BtnOK);
        BtnEnd = (Button)findViewById(R.id.BtnEnd);
        ImgPet = (ImageView)findViewById(R.id.ImgPet);

        ChkAgree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(ChkAgree.isChecked()==true){
                    Text2.setVisibility(View.VISIBLE);
                    Rgroup1.setVisibility(View.VISIBLE);
                    BtnOK.setVisibility(View.VISIBLE);
                    BtnEnd.setVisibility(View.VISIBLE);
                    ImgPet.setVisibility(View.VISIBLE);
                }
                else{
                    Text2.setVisibility(View.INVISIBLE);
                    BtnEnd.setVisibility(View.INVISIBLE);
                    Rgroup1.setVisibility(View.INVISIBLE);
                    BtnOK.setVisibility(View.INVISIBLE);
                    ImgPet.setVisibility(View.INVISIBLE);
                }
            }
        });
        BtnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (Rgroup1.getCheckedRadioButtonId()){
                    case R.id.RdoCat:
                        ImgPet.setImageResource(R.drawable.cat);break;
                    case R.id.RdoDog:
                        ImgPet.setImageResource(R.drawable.dog);break;
                    case R.id.RdoRabbit:
                        ImgPet.setImageResource(R.drawable.rabbit);break;
                    default:
                        Toast.makeText(getApplicationContext(),"먼저동물을선택",Toast.LENGTH_SHORT).show();

                }
            }
        });

        BtnEnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        RdoDog.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(RdoDog.isChecked()==true){
                    ImgPet.setImageResource(R.drawable.dog);
                }
            }
        });
    }
    }