package com.example.portfolio

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ProjectActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_project)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val url1="https://github.com/V-Yuvaraj/Portfolio-yuvaraj"

        val portfoliobtn=findViewById<Button>(R.id.button1)

        portfoliobtn.setOnClickListener{
            val btn1intent=Intent(Intent.ACTION_VIEW, Uri.parse(url1))
            startActivity(btn1intent)
        }

        val url2="https://github.com/V-Yuvaraj/ATM-INTERFACE"

        val atmbtn=findViewById<Button>(R.id.button2)

        atmbtn.setOnClickListener{
            val btn1intent=Intent(Intent.ACTION_VIEW, Uri.parse(url2))
            startActivity(btn1intent)
        }

        val url3="https://github.com/V-Yuvaraj/Portfolio-yuvaraj"

        val atmswingbtn=findViewById<Button>(R.id.button3)

        atmswingbtn.setOnClickListener{
            val btn1intent=Intent(Intent.ACTION_VIEW, Uri.parse(url3))
            startActivity(btn1intent)
        }

        val url4="https://github.com/V-Yuvaraj/Portfolio-yuvaraj"

        val busreservationbtn=findViewById<Button>(R.id.button4)

        portfoliobtn.setOnClickListener{
            val btn1intent=Intent(Intent.ACTION_VIEW, Uri.parse(url4))
            startActivity(btn1intent)
        }

        val url5="https://github.com/V-Yuvaraj/Portfolio-yuvaraj"

        val portfolioappbtn=findViewById<Button>(R.id.button5)

        portfolioappbtn.setOnClickListener{
            val btn1intent=Intent(Intent.ACTION_VIEW, Uri.parse(url5))
            startActivity(btn1intent)
        }

    }

}