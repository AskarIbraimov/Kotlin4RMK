package com.example.kotlin4rmk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlin4rmk.adapter.PagerAdapter
import com.example.kotlin4rmk.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.mainPager.adapter = PagerAdapter(this)
    }
}