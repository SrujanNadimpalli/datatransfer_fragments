package com.srujan.datatransfer.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.srujan.datatransfer.R


class FragmentB : Fragment() {
    var output : String ?= ""
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_b, container, false)
        val textView : TextView = view.findViewById(R.id.message)
        output = arguments?.getString("message")
        textView.text = output
        return view

    }

}