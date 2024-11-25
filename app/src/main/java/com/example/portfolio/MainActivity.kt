package com.example.portfolio

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        var ContactButton = findViewById<Button>(R.id.buttoncontact)
        ContactButton.setOnClickListener {
            intent = Intent(this, ContactActivity::class.java)
            startActivity(intent)
        }

        var SkillButton = findViewById<Button>(R.id.buttonskills)
        SkillButton.setOnClickListener {
            intent = Intent(this, SkillsActivity::class.java)
            startActivity(intent)
        }

            var InternshipButton = findViewById<Button>(R.id.buttoninternship)
            InternshipButton.setOnClickListener {
                intent = Intent(this, InternshipActivity::class.java)
                startActivity(intent)

            }
        
        var projectbutton = findViewById<Button>(R.id.buttonprojects)
        projectbutton.setOnClickListener{
              intent = Intent(this,ProjectActivity::class.java)
            startActivity(intent)
        }

        val url1="https://drive.google.com/file/d/1M0W0IyzBXV6fsG9xrvRHHUQX2mnhr4BY/view?usp=sharing"
        val ResumeBtn=findViewById<Button>(R.id.buttonresume)
        ResumeBtn.setOnClickListener{
            val btn1intent= Intent(Intent.ACTION_VIEW, Uri.parse(url1))
            startActivity(btn1intent)
        }
    }
}
