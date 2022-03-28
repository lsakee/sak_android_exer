package com.cookandroid.fb_firebase_email_test

import android.graphics.Paint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        auth = Firebase.auth

        val joinbtn=findViewById<Button>(R.id.join)
        joinbtn.setOnClickListener {


            val email=findViewById<EditText>(R.id.emailArea)
            val pass=findViewById<EditText>(R.id.passArea)

            Log.d("Main",email.text.toString())
            Log.d("Main",pass.text.toString())
            auth.createUserWithEmailAndPassword(email.text.toString(), pass.text.toString())
                .addOnCompleteListener(this) { task ->
                    if (task.isSuccessful) {
                        Toast.makeText(this,"성공",Toast.LENGTH_LONG).show()
                    } else {
                        Toast.makeText(this,"실패",Toast.LENGTH_LONG).show()
                    }
                }


        }
        val loginbtn=findViewById<Button>(R.id.login)
        loginbtn.setOnClickListener {
            val email=findViewById<EditText>(R.id.emailArea)
            val pass=findViewById<EditText>(R.id.passArea)

            auth.signInWithEmailAndPassword(email.text.toString(), pass.text.toString())
                .addOnCompleteListener(this) { task ->
                    if (task.isSuccessful) {
                        Toast.makeText(this, "성공",
                            Toast.LENGTH_SHORT).show()
                    } else {
                        Toast.makeText(this, "실패",
                            Toast.LENGTH_SHORT).show()
                    }
                }


        }

        val logoutBtn=findViewById<Button>(R.id.logout)
        logoutBtn.setOnClickListener {
            Firebase.auth.signOut()
            Toast.makeText(this,"로그아웃완료",Toast.LENGTH_LONG).show()


        }
    }
}