package com.example.recyclerviewpractice

import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
private const val TAG = "ContactsAdapter"
class ContactsAdapter(private val context: Context, private val contacts: List<Person>) :
    RecyclerView.Adapter<ContactsAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nameTextView: TextView = itemView.findViewById(R.id.tvpersonname)
        val ageTextView: TextView = itemView.findViewById(R.id.tvage)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        Log.i(TAG,"oncreateviewholder $viewType")
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val contact = contacts[position]

        holder.nameTextView.text = contact.name
        holder.ageTextView.text = "Age: ${contact.age}"

        holder.itemView.setOnClickListener {
            // Create an explicit intent to start DetailsActivity
            val intent = Intent(context, DetailsActivity::class.java).apply {
                putExtra("contact_name", contact.name)
                putExtra("contact_age", contact.age)
                Log.i(TAG,"intent onbindviewholder $position")
            }
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return contacts.size
    }
}
