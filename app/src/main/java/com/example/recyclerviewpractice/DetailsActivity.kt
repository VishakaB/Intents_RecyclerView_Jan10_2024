package com.example.recyclerviewpractice

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
private const val TAG = "detailsActivity"

class DetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        Log.i(TAG,"details acitivity 1")
        val contactName = intent.getStringExtra("contact_name")
        val contactAge = intent.getIntExtra("contact_age", 0)

        val nameTextView: TextView = findViewById(R.id.tvnewperson)
        val ageTextView: TextView = findViewById(R.id.tvnewage)

        nameTextView.text = "Name: $contactName"
        ageTextView.text = "Age: $contactAge"
    }
}
