package com.example.progmob

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class SampleListView : AppCompatActivity() {
    var items = arrayOf("lorem", "ipsum", "dolor", "sit", "amet",
        "consectetuer", "adipiscing", "elit", "morbi", "vel","ligula", "vitae",
        "arcu", "aliquet", "mollis","etiam", "vel",
        "erat", "placerat", "ante","porttitor", "sodales", "pellentesque", "augue", "purus")

    lateinit var lvSample : ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_list_view)

        lvSample = findViewById(R.id.lvsample)
        lvSample.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_activated_1, items)

    }
}