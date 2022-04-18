package com.cookandroid.viewcontainer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    Button[] btns=new Button[4];
    Integer[] btnIds={R.id.btnPre,R.id.btnStr,R.id.btnStop,R.id.btnNext};
    ViewFlipper ViewFlip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("이삭");

        ViewFlip=findViewById(R.id.ViewFlip);
        for (int i=0;i<btns.length;i++){
            btns[i]=findViewById(btnIds[i]);
            btns[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    switch (view.getId()){
                        case R.id.btnPre:
                            ViewFlip.showPrevious();
                            break;
                        case R.id.btnStr:
                            ViewFlip.setFlipInterval(500);
                            ViewFlip.startFlipping();
                            break;
                        case R.id.btnStop:
                            ViewFlip.stopFlipping();
                            break;
                        case R.id.btnNext:
                            ViewFlip.showNext();
                            break;
                    }
                }
            });
        }
    }
}