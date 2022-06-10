package com.cookandroid.project_customview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView mList;
    MovieAdapter mAdapter;
    ArrayList<Movie> mArray;
    Movie mItem;
    Integer[] poster={R.drawable.mov01, R.drawable.mov02, R.drawable.mov03, R.drawable.mov04, R.drawable.mov05,
            R.drawable.mov06, R.drawable.mov07, R.drawable.mov08, R.drawable.mov09, R.drawable.mov10 };
    String[] title = {"써니", "완득이", "괴물", "라디오스타", "비열한거리", "왕의남자",
            "아일랜드", "웰컴투동막골", "헬보이", "백투더퓨쳐"};

    String[] genre = {"DRAMA", "DRAMA", "SRILLER", "DRAMA", "DRAMA", "DRAMA",
            "SRILLER", "DRAMA", "SRILLER", "DRAMA"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("이삭");
        mList=findViewById(R.id.list);
        mArray=new ArrayList<>();
        for(int i=0;i<poster.length;i++){
            mItem=new Movie(ContextCompat.getDrawable(this,poster[i]),title[i],genre[i] );
            mArray.add(mItem);
        }
        mAdapter=new MovieAdapter(this,mArray);
        mList.setAdapter(mAdapter);

        mList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Movie item = (Movie)mList.getItemAtPosition(i);
                String title = item.getTitle();
                Toast.makeText(getApplicationContext(), title, Toast.LENGTH_SHORT).show();
            }
        });
    }
}