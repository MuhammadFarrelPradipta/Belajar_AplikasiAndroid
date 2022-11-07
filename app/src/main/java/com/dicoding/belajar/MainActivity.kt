 package com.dicoding.belajar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

 class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnView : Button = findViewById(R.id.btn_view)
        btnView.setOnClickListener(this)
    }

     override fun onClick(v: View?) {
         TODO("Not yet implemented")
            var moveView = Intent(this@MainActivity, VVGroupActivity::class.java)
            startActivity(moveView)

     }
 }