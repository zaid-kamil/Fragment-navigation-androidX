package com.digipod.quizapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.digipod.quizapp.R
import com.digipod.quizapp.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    private lateinit var _binding: FragmentHomeBinding
    private val binding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnStartQuiz.setOnLongClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_quizFragment)
            true
        }
        val bundle = HomeFragmentArgs.fromBundle(requireArguments())
        binding.textUsername.text = getString(
            R.string.username_display,
            bundle.username
        )
    }

}