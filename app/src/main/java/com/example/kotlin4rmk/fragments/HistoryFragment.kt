package com.example.kotlin4rmk.fragments

import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.example.kotlin4rmk.BaseFragment
import com.example.kotlin4rmk.MainViewModel
import com.example.kotlin4rmk.adapter.MyAdapter
import com.example.kotlin4rmk.databinding.FragmentHistoryBinding

class HistoryFragment : BaseFragment<FragmentHistoryBinding>() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        liveData.observer.observe(requireActivity()) {
            binding.rvHistory.adapter = MyAdapter(liveData.getHistory())
        }
    }
    override fun bind(): FragmentHistoryBinding {
        return FragmentHistoryBinding.inflate(layoutInflater)
    }

    override fun initLiveData(): MainViewModel {
        return ViewModelProvider(requireActivity())[MainViewModel::class.java]
    }


}