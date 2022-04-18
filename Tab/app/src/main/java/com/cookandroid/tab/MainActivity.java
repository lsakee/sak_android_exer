package com.cookandroid.tab;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    TabLayout tabLay;
    ViewPager viewPage;
    FragAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("이삭");

        tabLay=findViewById(R.id.tabLay);
        viewPage=findViewById(R.id.viewPage);
        adapter=new FragAdapter(getSupportFragmentManager());
        viewPage.setAdapter(adapter); //뷰페이저와 어뎁터
        tabLay.setupWithViewPager(viewPage);//뷰페이저와 탭레이아웃

        tabLay.getTabAt(0).setText("첫번째 탭");
        tabLay.getTabAt(0).setIcon(R.drawable.icon1);

        tabLay.getTabAt(1).setText("두번째 탭");
        tabLay.getTabAt(1).setIcon(R.drawable.icon_rabbit);

        tabLay.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if(tab.getPosition()==0)
                    Toast.makeText(getApplicationContext(),"첫번째 탭선택",Toast.LENGTH_SHORT).show();
                else Toast.makeText(getApplicationContext(),"두번째 탭선택",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}