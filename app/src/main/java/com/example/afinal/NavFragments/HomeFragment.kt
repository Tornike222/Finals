package com.example.afinal.NavFragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.afinal.Posts
import com.example.afinal.R
import com.example.myapplication.RecyclerViewPersonAdapter
import com.google.firebase.database.*

class HomeFragment : Fragment(R.layout.fragment_home) {
    private lateinit var database: FirebaseDatabase
    private lateinit var referance: DatabaseReference

    private lateinit var recyclerView: RecyclerView
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        recyclerView = view.findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = RecyclerViewPersonAdapter(getData())
        database = FirebaseDatabase.getInstance()
        referance = database.getReference("Movies")
        getData()
//        getData()
//        new()
    }

//    private fun new(){
//        val list = ArrayList<Posts>()
//        val db = FirebaseDatabase.getInstance().getReference("Posts").child("1")
//        db.addValueEventListener (object :ValueEventListener{
//            override fun onDataChange (snapshot: DataSnapshot) {
//                if (snapshot.exists()) {
//                    for (bookSnapshot in snapshot.children) {
//                 g       val book = bookSnapshot.getValue(Posts::class.java)
//                        list.add(book!!)
//                    }
//                    recyclerView.adapter = RecyclerViewPersonAdapter(list)
//                }
//            }
//            override fun onCancelled(error: DatabaseError) {
//            }
//        })
//    }


        private fun getData(): List<Posts> {
            val list = ArrayList<Posts>()
            list.add(
                Posts(
                    1,
                    "https://www.myanbiz-consulting.com/wp-content/uploads/2019/04/4214892-news-images.jpg",
                    "Best news in the world\nfor you"
                )
            )
            return list
        }
}