package com.example.moviedb.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.moviedb.R
import com.example.moviedb.databinding.FragmentHomeBinding
import com.example.moviedb.model.Movie
import com.example.moviedb.vm.MainViewModel

class HomeFragment : Fragment(R.layout.fragment_home) {

    lateinit var viewModel: MainViewModel
    private val binding: FragmentHomeBinding by viewBinding()
    private val movieAdapter by lazy {
        MovieAdapter() {
            navigateToBooksDetails(it)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(requireActivity())[MainViewModel::class.java]
    }

    private fun navigateToBooksDetails(movie: Movie) {
        val action = HomeFragmentDirections.actionHomeFragmentToDetailsFragment()
        findNavController().navigate(action)
    }
}