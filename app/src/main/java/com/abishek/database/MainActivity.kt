package com.abishek.database

import Fragment.DetailsFragment
import Fragment.StudentFragment
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TableLayout
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.abishek.database.Adapter.VpAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

   private lateinit var vp : ViewPager2
   private lateinit var tb : TabLayout
    private lateinit var adapter : VpAdapter
    var lstFragment: ArrayList<Fragment> = arrayListOf(DetailsFragment(),StudentFragment())
    var lstTitle : ArrayList<String> = arrayListOf("Details","Add Students")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding()
        initialize()
    }


    private fun binding() {
       vp =findViewById(R.id.vp)
       tb = findViewById(R.id.tb)
    }

    private fun initialize()
    {
        adapter = VpAdapter(supportFragmentManager,lifecycle,lstFragment)
        vp.adapter = adapter

        TabLayoutMediator(tb,vp){
            tab, position ->
            tab.text = lstTitle[position]
        }.attach()
    }
}