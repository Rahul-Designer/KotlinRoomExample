package com.example.kotlinroomexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    lateinit var database: ContactDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        database = ContactDatabase.getDatabase(this)

        // Insert data in DataBase
        GlobalScope.launch {
            database.contactDao().insertContact(Contact(0,"RAHUL","9660338900",1))
        }

        getData.setOnClickListener{
            database.contactDao().getContact().observe(this, Observer {
                Log.d("MAIN",it.toString())
            })
        }
    }
}