package com.cookandroid.project_customview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MovieAdapter extends BaseAdapter {
    Context mContext;
    ArrayList<Movie> mData;

    public MovieAdapter(Context mContext, ArrayList<Movie> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Object getItem(int i) {
        return mData.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        //항목의 어댑터에서의 위치값(i), 재사용할 항목의 view, 항목의 뷰들을 포함하고 있는 리스트뷰
        if(view == null){ //재사용되는 view가 없을때
            view = View.inflate(mContext, R.layout.listitem, null);//listitem.xml 레이아웃을 inflate
        }
        ImageView image = view.findViewById(R.id.imgPoster);
        TextView title = view.findViewById(R.id.txtTitle);
        TextView genre = view.findViewById(R.id.txtGenre);
        //Data Set(mData)에서 위치값 i에 위치한 데이터 참조 획득후  아이템 내 각 위젯에 데이터 반영
        image.setImageDrawable(mData.get(i).getImage());
        title.setText(mData.get(i).getTitle());
        genre.setText(mData.get(i).getGenre());

        return view;
    }
}
