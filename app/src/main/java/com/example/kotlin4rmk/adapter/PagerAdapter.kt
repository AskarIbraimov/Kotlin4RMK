package com.example.kotlin4rmk.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.kotlin4rmk.fragments.FirstFragment
import com.example.kotlin4rmk.fragments.HistoryFragment
import com.example.kotlin4rmk.fragments.SecondFragment

class PagerAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {

    private val fragments = arrayListOf(
        FirstFragment(),
        SecondFragment(),
        HistoryFragment()
    )

    override fun getItemCount(): Int = fragments.size
    override fun createFragment(position: Int): Fragment = fragments[position]

}