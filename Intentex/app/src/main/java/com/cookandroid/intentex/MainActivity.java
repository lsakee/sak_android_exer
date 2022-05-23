package com.cookandroid.intentex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> hobby = new ArrayList<>();
    EditText edName,edAge;
    Button btn;
    CheckBox chkgame,chkmusic,chkexer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("이삭");
        edName=findViewById(R.id.edName);
        edAge=findViewById(R.id.edAge);
        chkexer=findViewById(R.id.chkexer);
        chkgame=findViewById(R.id.chkgame);
        chkmusic=findViewById(R.id.chkmusic);
        btn=findViewById(R.id.btn);
        chkgame.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b)hobby.add(chkgame.getText().toString());
                else hobby.remove(hobby.indexOf(chkgame.getText().toString()));
            }
        });
        chkexer.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b)hobby.add(chkexer.getText().toString());
                else hobby.remove(hobby.indexOf(chkexer.getText().toString()));
            }
        });
        chkmusic.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b)hobby.add(chkmusic.getText().toString());
                else hobby.remove(hobby.indexOf(chkmusic.getText().toString()));
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),SecondActivity.class);
                intent.putExtra("name",edName.getText().toString());
                intent.putExtra("Age",Integer.parseInt(edAge.getText().toString()));
                intent.putExtra("hobby",hobby);
                startActivity(intent);
            }
        });
    }
}