package com.cookandroid.project7_1_ex;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    EditText edit1;
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit1=(EditText)findViewById(R.id.Edit1);
        img=(ImageView)findViewById(R.id.imgView);
        setTitle("이삭");

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu1,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId())
        {
            case R.id.rotate:
                img.setRotation(Integer.parseInt(edit1.getText().toString())%360);
                return true;
            case R.id.hanla:
                img.setImageResource(R.drawable.api23);
                img.setVisibility(View.VISIBLE);
                return true;
            case R.id.chuza:
                img.setImageResource(R.drawable.api30);
                img.setVisibility(View.VISIBLE);
                return true;
            case R.id.bam:
                img.setImageResource(R.drawable.api40);
                img.setVisibility(View.VISIBLE);
                return true;

        }
        return false;
    }
}