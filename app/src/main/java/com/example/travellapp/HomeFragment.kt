package com.example.travellapp


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.travellapp.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    private var _binding : FragmentHomeBinding ? = null
    private val binding get() = _binding!!
    val recycler_view = _binding?.recyclerView
    val data: ArrayList<CardData> = ArrayList()

    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        data.add(CardData(R.drawable.jaisalmer, "Jaisalmer"))
        data.add(CardData(R.drawable.kolkota, "Kolkota"))
        data.add(CardData(R.drawable.meghalaya, "Meghalaya"))

        recycler_view?.setLayoutManager(layoutManager)
        adapter = activity?.let { RecyclerAdapter(data, it) }
        recycler_view?.setAdapter(adapter)
        adapter!!.notifyDataSetChanged()



        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }



}