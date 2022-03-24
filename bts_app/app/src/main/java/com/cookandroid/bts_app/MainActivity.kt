package com.cookandroid.bts_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //1.화면 클릭한걸 프로그램이 알기
        val image1 = findViewById<ImageView>(R.id.image_1)
        image1.setOnClickListener{

            Toast.makeText(this, "1번클릭완료", Toast.LENGTH_SHORT).show()
            //2.다음화면 넘어가서,사진크게보기
            val intent = Intent(this,Bts1Activity::class.java)
            startActivity(intent)

        }
        val image2 = findViewById<ImageView>(R.id.image_2)
        image2.setOnClickListener{

            Toast.makeText(this, "2번클릭완료", Toast.LENGTH_SHORT).show()
            //2.다음화면 넘어가서,사진크게보기
            val intent = Intent(this,bts2Activity::class.java)
            startActivity(intent)

        }
        val image3 = findViewById<ImageView>(R.id.image_3)
        image3.setOnClickListener{

            Toast.makeText(this, "3번클릭완료", Toast.LENGTH_SHORT).show()
            //2.다음화면 넘어가서,사진크게보기
            val intent = Intent(this,Bts3Activity::class.java)
            startActivity(intent)

        }
        val image4 = findViewById<ImageView>(R.id.image_4)
        image4.setOnClickListener{

            Toast.makeText(this, "4번클릭완료", Toast.LENGTH_SHORT).show()
            //2.다음화면 넘어가서,사진크게보기
            val intent = Intent(this,Bts4Activity::class.java)
            startActivity(intent)

        }
        val image5 = findViewById<ImageView>(R.id.image_5)
        image5.setOnClickListener{

            Toast.makeText(this, "5번클릭완료", Toast.LENGTH_SHORT).show()
            //2.다음화면 넘어가서,사진크게보기
            val intent = Intent(this,Bts5Activity::class.java)
            startActivity(intent)

        }
        val image6 = findViewById<ImageView>(R.id.image_6)
        image6.setOnClickListener{

            Toast.makeText(this, "6번클릭완료", Toast.LENGTH_SHORT).show()
            //2.다음화면 넘어가서,사진크게보기
            val intent = Intent(this,Bts6Activity::class.java)
            startActivity(intent)

        }
        val image7 = findViewById<ImageView>(R.id.image_7)
        image7.setOnClickListener{

            Toast.makeText(this, "7번클릭완료", Toast.LENGTH_SHORT).show()
            //2.다음화면 넘어가서,사진크게보기
            val intent = Intent(this,Bts7Activity::class.java)
            startActivity(intent)

        }


    }
}