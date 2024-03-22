package com.example.chatbox

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.chatbox.Message
import com.example.chatbox.MessageAdapter
import com.example.chatbox.R

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val messages = listOf(
            Message("Person 1", "I commented on Figma, I want to add some fancy icons. Do you have any icon set?", "10:00 AM"),
            Message("Person 2", "I am in a process of designing some. When do you need them?", "10:05 AM"),
            Message("Person 1", "Next month?", "10:10 AM"),
            Message("Person 2", "I am almost finish. Please give me your email, I will ZIP them and send you as son as im finish.", "10:10 AM"),
            Message("Person 1", "?", "10:10 AM"),
            Message("Person 2", "maciej.kowalski@email.com", "10:10 AM")
        )

        val adapter = MessageAdapter(messages)
        recyclerView.adapter = adapter
    }
}
