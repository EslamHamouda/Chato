package com.example.chato.ui.channels

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.chato.R
import com.example.chato.databinding.FragmentChannelsBinding
import com.example.chato.databinding.FragmentChatsBinding


class ChannelsFragment : Fragment() {

    private lateinit var binding: FragmentChannelsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding=FragmentChannelsBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

    }
}