package com.example.recyclerviewpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

private const val TAG  = "Mainactivity"
data class Person(val name: String,val age: Int, val bio: String, val imageid: Int)

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
    // MainActivity.kt
    private fun createContacts(): MutableList<Person> {
        val contacts = mutableListOf<Person>()
        val bioDataArray = resources.getStringArray(R.array.bio_data_array)
        for (i in 1..20) {
            val bioData = bioDataArray.getOrNull(i - 1) ?: ""
            //val bio = BioDataRepository.getBioDataForPerson(i)
            val imageName = "person$i" // Adjust this based on your naming convention
            val imageResId = resources.getIdentifier(imageName, "drawable", packageName)
            Log.i(TAG, imageResId.toString())
            contacts.add(Person("Person $i", i, bioData, imageResId))
            //contacts.add(Person("Person $i", i, "Person $i is a "+bioData))
            Log.i(TAG," getbiodata for person")
        }
        return contacts
    }

}

