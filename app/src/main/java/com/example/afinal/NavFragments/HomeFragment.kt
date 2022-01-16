package com.example.afinal.NavFragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.afinal.Posts
import com.example.afinal.R
import com.example.myapplication.RecyclerViewPersonAdapter

class HomeFragment: Fragment(R.layout.fragment_home) {
        private lateinit var recyclerView: RecyclerView
        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            recyclerView = view.findViewById(R.id.recyclerView)
            recyclerView.layoutManager = LinearLayoutManager(requireContext())
            recyclerView.adapter = RecyclerViewPersonAdapter(getData())
        }

        private fun getData(): List<Posts> {
            val list = ArrayList<Posts>()
            list.add(
                Posts(
                    1,
                    "https://www.myanbiz-consulting.com/wp-content/uploads/2019/04/4214892-news-images.jpg",
                    "Best news in the world\nfor you"
                )
            )
            list.add(
                Posts(
                    2,
                    "https://www.myanbiz-consulting.com/wp-content/uploads/2019/04/4214892-news-images.jpg",
                    "very very gooood\nnews for you"
                )
            )
            list.add(
                Posts(
                    3,
                    "https://www.myanbiz-consulting.com/wp-content/uploads/2019/04/4214892-news-images.jpg",
                    "very very gooood\nnews for you"
                )
            )
            list.add(
                Posts(
                    4,
                    "https://www.myanbiz-consulting.com/wp-content/uploads/2019/04/4214892-news-images.jpg",
                    "very very gooood\nnews for you"
                )
            )
            return list
        }
}