package com.cookandroid.trot_play

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class singer2Fragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =inflater.inflate(R.layout.fragment_singer2, container, false)
        val items= mutableListOf<String>()
        items.add("#2노래1")
        items.add("#2노래2")
        items.add("#2노래3")
        items.add("#2노래4")
        items.add("#2노래5")
        items.add("#2노래6")
        items.add("#2노래7")
        items.add("#2노래8")

        val rv= view.findViewById<RecyclerView>(R.id.singRV)
        val rvAdapter=RVAdapter(items)
        rv.adapter=rvAdapter
        rv.layoutManager= LinearLayoutManager(context)
        view.findViewById<ImageView>(R.id.image1).setOnClickListener {
            it.findNavController().navigate(R.id.action_singer2Fragment_to_singer1Fragment)
        }
        view.findViewById<ImageView>(R.id.image3).setOnClickListener {
            it.findNavController().navigate(R.id.action_singer2Fragment_to_singer3Fragment)
        }
        return view

    }
}
