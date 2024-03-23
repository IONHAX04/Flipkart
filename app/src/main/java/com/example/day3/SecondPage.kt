package com.example.day3

import android.graphics.Color
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second_page)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val text1 = findViewById<TextView>(R.id.readTxt);
        val textView: Spannable = SpannableString("Read our")
        textView.setSpan(ForegroundColorSpan(Color.BLACK), 0, textView.length, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        val privacy: Spannable = SpannableString("Privacy Policy");
        privacy.setSpan(ForegroundColorSpan(Color.BLUE), 0, privacy.length, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);


        text1.text = textView

    }
}