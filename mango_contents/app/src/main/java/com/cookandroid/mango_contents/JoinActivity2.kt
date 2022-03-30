package com.cookandroid.mango_contents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class JoinActivity2 : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {

// ...
// Initialize Firebase Auth
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_join2)
        val email=findViewById<EditText>(R.id.emailArea)
        val password=findViewById<EditText>(R.id.passArea)
        auth = Firebase.auth
        auth.createUserWithEmailAndPassword(email.text.toString(), password.text.toString())
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    // Sign in success, update UI with the signed-in user's information
                    val intent= Intent(this,MainActivity::class.java)
                    startActivity(intent)
                } else {
                    // If sign in fails, display a message to the user.
                    Log.w("JOIMActivity","createUserWithEmail:failure" , task.exception)
                }
            }


    }
}