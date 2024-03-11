package com.srujan.datatransfer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import com.srujan.datatransfer.Fragments.FragmentA
import com.srujan.datatransfer.Fragments.FragmentB

class MainActivity : AppCompatActivity(),Communicator


{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentA = FragmentA()
        // to start the app with fragment A
        supportFragmentManager.beginTransaction().replace(R.id.fragment_container,fragmentA).commit()
    }

    override fun passData(editText: String) {
        val bundle = Bundle()
        bundle.putString("message",editText)

        val transaction = this.supportFragmentManager.beginTransaction()
        val fragmentB = FragmentB()

        fragmentB.arguments = bundle

        // to pass data to fragment B and open it
        transaction.replace(R.id.fragment_container,fragmentB).commit()
    }
}