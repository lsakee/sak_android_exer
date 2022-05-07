package com.cookandroid.project6_1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Chronometer;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {
    Chronometer chrono;
    Button btnStart,btnStop;
    RadioButton rdCal,rdTime;
    CalendarView calendar;
    TimePicker timePick;
    TextView tvDate;
    int selYear,selMon,selDay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("이삭");
        chrono=findViewById(R.id.chrono);
        btnStart=findViewById(R.id.btnStart);
        btnStop=findViewById(R.id.btnStop);
        calendar=findViewById(R.id.calender);
        rdCal=findViewById(R.id.rdCal);
        rdTime=findViewById(R.id.rdTime);
        timePick=findViewById(R.id.timePick);
        tvDate=findViewById(R.id.tvDate);

        calendar.setVisibility(View.INVISIBLE);
        timePick.setVisibility(View.INVISIBLE);

        rdCal.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                calendar.setVisibility(View.VISIBLE);
                timePick.setVisibility(View.INVISIBLE);
            }
        });

        rdTime.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                calendar.setVisibility(View.INVISIBLE);
                timePick.setVisibility(View.VISIBLE);
            }
        });

        calendar.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int year, int month, int day) {
                selYear=year;
                selMon=month+1;
                selDay=day;
            }
        });
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chrono.setBase(SystemClock.elapsedRealtime());
                chrono.start();
                chrono.setTextColor(Color.RED);
            }
        });
        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chrono.stop();
                chrono.setTextColor(Color.BLUE);
                String str="예약날짜:"+selYear+"년"+selMon+"월"+selDay+"일"+timePick.getCurrentHour()+"시"+timePick.getCurrentMinute()+"분";
                tvDate.setText(str);
            }
        });

    }
}