package com.abishek.database.Adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class VpAdapter(val fragmentManager: FragmentManager,val lifecycle: Lifecycle,val lstFragment:ArrayList<Fragment>):FragmentStateAdapter(fragmentManager,lifecycle) {
    override fun getItemCount(): Int {
        return lstFragment.size
    }

    override fun createFragment(position: Int): Fragment {
       return lstFragment[position]
    }
}