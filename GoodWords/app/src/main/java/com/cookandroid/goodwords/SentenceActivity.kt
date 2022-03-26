package com.cookandroid.goodwords

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import androidx.databinding.DataBindingUtil
import com.cookandroid.goodwords.databinding.ActivityMainBinding

class SentenceActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sentence)

        val sentenceList = mutableListOf<String>()

        sentenceList.add("삶이 있는 한 희망은 있다")
        sentenceList.add("산다는것 그것은 치열한 전투이다1")
        sentenceList.add("하루에 3시간을 걸으면 7년 후에 지구를 한바퀴 돌 수 있다.")
        sentenceList.add("언제나 현재에 집중할수 있다면 행복할것이다.")
        sentenceList.add("진정으로 웃으려면 고통을 참아야하며 , 나아가 고통을 즐길 줄 알아야 해")
        sentenceList.add("신은 용기있는자를 결코 버리지 않는다")
        sentenceList.add("피할수 없으면 즐겨라")
        sentenceList.add("먼저 자신을 비웃어라. 다른 사람이 당신을 비웃기 전에")

        val sentenceadapter = ListviewAdapter(sentenceList)

        val listview=findViewById<ListView>(R.id.sentenceListView)

        listview.adapter=sentenceadapter
        }

    }



