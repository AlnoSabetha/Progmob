package com.example.progmob

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class SampleListActivity : AppCompatActivity() {
    lateinit var btnList : Button
    lateinit var btnRec : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_list)

        btnList = findViewById(R.id.btn_list)
        btnRec = findViewById(R.id.btnSampleRV)

        btnList.setOnClickListener(View.OnClickListener { View ->
            var intent = Intent(this@SampleListActivity, SampleListView::class.java)
            startActivity(intent)
        })

        btnRec.setOnClickListener(View.OnClickListener { View ->
            var intent = Intent(this@SampleListActivity, RecyclerActivity::class.java)
            startActivity(intent)
        })
    }
}