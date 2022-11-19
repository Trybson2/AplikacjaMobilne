package com.example.aplikacjamobilne

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var x = 1

        findViewById<Button>(R.id.button_prawo).setOnClickListener {
            if (x == 1) {
                findViewById<ImageView>(R.id.jablko).setImageResource(R.drawable.jez)
                x = 2
            } else if (x == 0) {
                findViewById<ImageView>(R.id.jablko).setImageResource(R.drawable.waz)
                x = 1
            } else if (x == 2) {
                findViewById<ImageView>(R.id.jablko).setImageResource(R.drawable.jabko)
                x = 0
            }
            findViewById<Button>(R.id.button_lewo).setOnClickListener {
                if (x == 1) {
                    findViewById<ImageView>(R.id.jablko).setImageResource(R.drawable.waz)
                    x = 0
                } else if (x == 0) {
                    findViewById<ImageView>(R.id.jablko).setImageResource(R.drawable.jez)
                    x = 1
                } else if (x == 2) {
                    findViewById<ImageView>(R.id.jablko).setImageResource(R.drawable.jabko)
                    x = 2
                }
            }
        }
        val silniaRun = findViewById<Button>(R.id.button_oblicz)

        val silniaInput = findViewById<EditText>(R.id.editTextTextPersonName)

        silniaRun.setOnClickListener {
            val inputInt = silniaInput.text.toString().toInt()
            var liczbazsilni=1
            if(inputInt==0 || inputInt==1){
                liczbazsilni=1
            }
            else{
                for(i in 2..inputInt)
                    liczbazsilni += i
            }
            val text = liczbazsilni.toString()
            findViewById<TextView>(R.id.wynik).text=(text)
        }
    }
}