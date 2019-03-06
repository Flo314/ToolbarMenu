package com.example.android.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.Toolbar
import android.util.Log

class GreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_green)

        val toolbar = findViewById<Toolbar>(R.id.toolbar);
        setSupportActionBar(toolbar);

        // fléche de retour toolbar
        supportActionBar!!.setDisplayHomeAsUpEnabled(true);

    }
}
