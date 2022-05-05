package com.example.kotlin4rmk.fragments

import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.example.kotlin4rmk.BaseFragment
import com.example.kotlin4rmk.MainViewModel
import com.example.kotlin4rmk.databinding.FragmentFirstBinding

class FirstFragment : BaseFragment<FragmentFirstBinding>() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        buttonActions()
    }

    private fun buttonActions() {
        binding.btnPlus.setOnClickListener {
            liveData.plusCounter()
        }
        binding.btnMinus.setOnClickListener {
            liveData.minusCounter()
        }
    }

    override fun bind(): FragmentFirstBinding {
        return FragmentFirstBinding.inflate(layoutInflater)
    }

    override fun initLiveData(): MainViewModel {
        return ViewModelProvider(requireActivity())[MainViewModel::class.java]
    }
}