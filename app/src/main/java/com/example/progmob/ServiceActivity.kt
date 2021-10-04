package com.example.progmob

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class ServiceActivity : AppCompatActivity() {
    lateinit var btnGetapi : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_service)

        btnGetapi = findViewById(R.id.btnGETAPI)

        btnGetapi.setOnClickListener(View.OnClickListener { view ->
            var intent = Intent(this@ServiceActivity, GETAPIactivity::class.java)
            startActivity(intent)
        })
    }
}