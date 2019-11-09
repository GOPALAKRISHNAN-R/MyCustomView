package com.example.mycustomview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list: MutableList<String> = ArrayList()
        list.add("Kotlin")
        list.add("Java")
        list.add("C++")
        list.add("Html")
        list.add("JavaScript")
        list.add("Php")

        customview.setData(list)
        customview.setTitle("Languages")
        submit.setOnClickListener {
            Toast.makeText(this, "Selected Datas : " + customview.getSelectedData().toString(), Toast.LENGTH_SHORT)
                .show()
        }

    }
}
