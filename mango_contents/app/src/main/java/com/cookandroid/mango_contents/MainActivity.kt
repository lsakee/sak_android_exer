package com.cookandroid.mango_contents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private val items = mutableListOf<ContentsModel>()

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bookmarkButton=findViewById<TextView>(R.id.bookmarkBtn)
        bookmarkButton.setOnClickListener{
            val intent=Intent(this,BookmarkActivity::class.java)
            startActivity(intent)
        }

        //데이터연결리사이클러뷰
        items.add(
            ContentsModel("https://www.mangoplate.com/restaurants/ByuIW33rXc",
                    "https://mp-seoul-image-production-s3.mangoplate.com/added_restaurants/63176_1468144532794478.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                        "알라프리마"
            )
        )
        items.add(
            ContentsModel("https://www.mangoplate.com/restaurants/9lwUASfsAqk2",
                "https://mp-seoul-image-production-s3.mangoplate.com/34450_1594044538348465.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "오츠커피"
            )
        )
        items.add(
            ContentsModel("https://www.mangoplate.com/restaurants/RR-c78uMYpQl",
                "https://mp-seoul-image-production-s3.mangoplate.com/280181/172778_1569745518991_100835?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "어게인리프래쉬"
            )
        )
        items.add(
            ContentsModel("https://www.mangoplate.com/restaurants/C1EUU9PoZuIN",
                "https://mp-seoul-image-production-s3.mangoplate.com/284356/57716_1646883966450_78898?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "한입소반"
            )
        )
        items.add(
            ContentsModel("https://www.mangoplate.com/restaurants/ByuIW33rXc",
                "https://mp-seoul-image-production-s3.mangoplate.com/added_restaurants/63176_1468144532794478.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "알라프리마"
            )
        )
        items.add(
            ContentsModel("https://www.mangoplate.com/restaurants/9lwUASfsAqk2",
                "https://mp-seoul-image-production-s3.mangoplate.com/34450_1594044538348465.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "오츠커피"
            )
        )
        items.add(
            ContentsModel("https://www.mangoplate.com/restaurants/RR-c78uMYpQl",
                "https://mp-seoul-image-production-s3.mangoplate.com/280181/172778_1569745518991_100835?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "어게인리프래쉬"
            )
        )
        items.add(
            ContentsModel("https://www.mangoplate.com/restaurants/C1EUU9PoZuIN",
                "https://mp-seoul-image-production-s3.mangoplate.com/284356/57716_1646883966450_78898?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "한입소반"
            )
        )

        val recyclerView=findViewById<RecyclerView>(R.id.rv)
        val rvAdapter=RVAdapter(baseContext,items)
        recyclerView.adapter=rvAdapter
        rvAdapter.itemClick=object :RVAdapter.ItemClick{
            override fun onClick(view: View, positon:Int){
                val intent = Intent(baseContext,viewActivity::class.java)
                intent.putExtra("url",items[positon].url)
                intent.putExtra("title",items[positon].titleText)
                intent.putExtra("ImageUrl",items[positon].ImageUrl)
                startActivity(intent)
            }
        }
        recyclerView.layoutManager=GridLayoutManager(this,2)

    }
}