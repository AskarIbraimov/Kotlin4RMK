package com.example.kotlin4rmk.fragments

import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.example.kotlin4rmk.BaseFragment
import com.example.kotlin4rmk.MainViewModel
import com.example.kotlin4rmk.databinding.FragmentSecondBinding


class SecondFragment : BaseFragment<FragmentSecondBinding>() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        liveData.observer.observe(requireActivity()) {
            binding.tvCounter.text = it.toString()
        }
    }

    override fun bind(): FragmentSecondBinding {
        return FragmentSecondBinding.inflate(layoutInflater)
    }

    override fun initLiveData(): MainViewModel {
        return ViewModelProvider(requireActivity())[MainViewModel::class.java]
    }

}