package com.cookandroid.dday

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.DatePicker
import android.widget.TextView
import java.util.*
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startBtn = findViewById<Button>(R.id.startBtn)
        val endBtn = findViewById<Button>(R.id.endBtn)

        var startDate = ""

        val calenderstart = Calendar.getInstance()
        val calenderemd = Calendar.getInstance()
        startBtn.setOnClickListener {

            val today = GregorianCalendar()
            val year = today.get(Calendar.YEAR)
            val month = today.get(Calendar.MONTH)
            val day = today.get(Calendar.DATE)

            val dlg2 = DatePickerDialog(this, object : DatePickerDialog.OnDateSetListener {
                override fun onDateSet(p0: DatePicker?, p1: Int, p2: Int, p3: Int) {

                    startDate = p1.toString()+(p2+1).toString()+p3.toString()
                    Log.d("day:",startDate)
                    calenderstart.set(p1,p2,p3)
                    //same
                    // startDate=year.toString() + (month+1).toString() + day.toString()

                }

            }, year, month, day)
            dlg2.show()
        }

        var endDate = ""

        endBtn.setOnClickListener {

            val today = GregorianCalendar()
            val year = today.get(Calendar.YEAR)
            val month = today.get(Calendar.MONTH)
            val day = today.get(Calendar.DATE)

            val dlg = DatePickerDialog(this, object : DatePickerDialog.OnDateSetListener {
                override fun onDateSet(p0: DatePicker?, p1: Int, p2: Int, p3: Int) {

                    endDate = p1.toString()+(p2+1).toString()+p3.toString()
                    Log.d("day:",endDate)
                    calenderemd.set(p1,p2,p3)

                    val finalDate=TimeUnit.MILLISECONDS.toDays(calenderemd.timeInMillis-calenderstart.timeInMillis)
                    val textArea= findViewById<TextView>(R.id.finalDate)

                    textArea.setText(finalDate.toString())

                }

            }, year, month, day)

            dlg.show()

        }

    }
}