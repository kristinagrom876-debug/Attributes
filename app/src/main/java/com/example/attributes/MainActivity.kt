package com.example.attributes

import android.graphics.Color
import android.os.Bundle
import android.util.TypedValue
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText = findViewById<EditText>(R.id.editText)

        // Чёрный текст
        findViewById<Button>(R.id.button_black_text).setOnClickListener {
            editText.setTextColor(Color.BLACK)
        }

        // Красный текст
        findViewById<Button>(R.id.button_red_text).setOnClickListener {
            editText.setTextColor(Color.RED)
        }

        // Размер 8sp
        findViewById<Button>(R.id.button_size_8).setOnClickListener {
            editText.setTextSize(TypedValue.COMPLEX_UNIT_SP, 8f)
        }

        // Размер 24sp
        findViewById<Button>(R.id.button_size_24).setOnClickListener {
            editText.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24f)
        }

        // Белый фон
        findViewById<Button>(R.id.button_white_bg).setOnClickListener {
            editText.setBackgroundColor(Color.WHITE)
        }

        // Жёлтый фон
        findViewById<Button>(R.id.button_yellow_bg).setOnClickListener {
            editText.setBackgroundColor(Color.YELLOW)
        }
    }
}