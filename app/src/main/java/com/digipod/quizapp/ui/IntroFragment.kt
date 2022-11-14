package com.digipod.quizapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.digipod.quizapp.R
import com.digipod.quizapp.databinding.FragmentIntroBinding


class IntroFragment : Fragment() {

    private lateinit var _binding: FragmentIntroBinding
    private val binding get() = _binding // backing property

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentIntroBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnCont.setOnClickListener {
            val uname = binding.editUsername.text.toString()
            val dir = IntroFragmentDirections.actionIntroFragmentToHomeFragment(uname)
            findNavController().navigate(dir)
        }
    }
}