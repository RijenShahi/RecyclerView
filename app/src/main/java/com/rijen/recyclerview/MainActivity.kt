package com.rijen.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.rijen.recyclerview.adapter.ActorAdapter
import com.rijen.recyclerview.model.Actors

class MainActivity : AppCompatActivity() {
    val lstActors = ArrayList<Actors>()
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadActors()
        val adapter = ActorAdapter(lstActors,this)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
    }

    private fun loadActors() {
        lstActors.add(Actors(1, "Kiran Rana",
            "https://avatars3.githubusercontent.com/u/17020882?s=400&u=59482bbaa74bd232941350394cf3bb9f59c4abbd&v=4",
            "Kathmandu", 1000000F))
        lstActors.add(Actors(2, "Dahayang Rai",
            "https://myrepublica.nagariknetwork.com/uploads/media/Dayahang-Rai_20191015162610.jpg",
            "Lalitpur", 150000F))
        lstActors.add(Actors(3, "Rajesh Hamal",
            "https://myrepublica.nagariknetwork.com/uploads/media/RajeshHamal.jpg",
            "Kathmandu", 2000000F))
        lstActors.add(Actors(4, "Saugat Malla",
            "https://bigulmedia.com/wp-content/uploads/2016/04/Saugat-Malla-Picture.gif",
            "Bhaktapur", 3000000F))
    }
}