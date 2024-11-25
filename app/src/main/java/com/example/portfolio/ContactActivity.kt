package com.example.portfolio

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ContactActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_contact)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val url1="mailto:yuvaraj1624y@gmail.com"
        val GmailBtn=findViewById<Button>(R.id.gmailbtn)
        GmailBtn.setOnClickListener{
            val btn1intent= Intent(Intent.ACTION_VIEW, Uri.parse(url1))
            startActivity(btn1intent)
        }

        val url2="https://www.linkedin.com/in/yuvaraj-v-a189a0286/"
        val LinkedinBtn=findViewById<Button>(R.id.linkedinbtn)
        LinkedinBtn.setOnClickListener{
            val btn1intent= Intent(Intent.ACTION_VIEW, Uri.parse(url2))
            startActivity(btn1intent)
        }

        val url3="http://wa.me/917806948317"
        val WhatsappBtn=findViewById<Button>(R.id.whatsappbtn)
        WhatsappBtn.setOnClickListener{
            val btn1intent= Intent(Intent.ACTION_VIEW, Uri.parse(url3))
            startActivity(btn1intent)
        }

        val url4="https://github.com/V-Yuvaraj"
        val GithubBtn=findViewById<Button>(R.id.githubbtn)
        GithubBtn.setOnClickListener{
            val btn1intent= Intent(Intent.ACTION_VIEW, Uri.parse(url4))
            startActivity(btn1intent)
        }

        val url5="https://www.linkedin.com/in/yuvaraj-v-a189a0286/"
        val FacebookBtn=findViewById<Button>(R.id.facebookbtn)
        FacebookBtn.setOnClickListener{
            val btn1intent= Intent(Intent.ACTION_VIEW, Uri.parse(url5))
            startActivity(btn1intent)
        }
    }
}