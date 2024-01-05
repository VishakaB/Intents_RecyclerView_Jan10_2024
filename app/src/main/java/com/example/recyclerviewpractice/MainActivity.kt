package com.example.recyclerviewpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

data class Person(val name: String,val age: Int)

class MainActivity : AppCompatActivity() {

    private lateinit var contacts: MutableList<Person>
    private lateinit var adapter: ContactsAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Define the data list
        contacts = createContacts()
        //Define the rv adapter class
        adapter = ContactsAdapter(this, contacts)

        //connect the adapter to the recyclerview
        val recyclerView: RecyclerView = findViewById(R.id.rvcontacts)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)
        //rvcontacts.layoutManager = LinearLayoutManager(this)
    }

    //outside oncreate define a function to create the list of data
    private fun createContacts(): MutableList<Person>{

        val contacts = mutableListOf<Person>()
        for (i in 1..20) {
            contacts.add(Person("Person $i", i))
        }
        return contacts
    }
}