package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var monHoc : List<String>  = listOf("IOS", "ANDROID", ".NET", "PHP", "JAVA", "IOS", "ANDROID", ".NET", "PHP",
            "JAVA", "IOS", "ANDROID", ".NET", "PHP", "JAVA", "IOS", "ANDROID", ".NET", "PHP", "JAVA" )
        listView.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, monHoc)
    }
}
