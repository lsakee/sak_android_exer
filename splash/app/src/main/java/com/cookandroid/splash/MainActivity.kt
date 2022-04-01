package com.cookandroid.splash

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listitem= mutableListOf<String>()
        listitem.add("a")
        listitem.add("ab")
        listitem.add("abc")

        val listView=findViewById<ListView>(R.id.mainListView)
        val adapter = ListAdapter(listitem)
        listView.adapter=adapter

    }
}