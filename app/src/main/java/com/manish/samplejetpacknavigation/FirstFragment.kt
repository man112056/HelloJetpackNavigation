package com.manish.samplejetpacknavigation

import android.annotation.SuppressLint
import androidx.fragment.app.viewModels
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController

class FirstFragment : Fragment() {

    companion object {
        fun newInstance() = FirstFragment()
    }

    private val viewModel: FirstViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // TODO: Use the ViewModel
    }

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        var view =  inflater.inflate(R.layout.fragment_first, container, false)
        view.findViewById<Button>(R.id.navigate_btn).setOnClickListener { 
            btnClickedAction()
        }
        return view
    }

    private fun btnClickedAction() {
        Toast.makeText(requireContext(), "button clicked", Toast.LENGTH_SHORT).show()
//        findNavController().navigate(R.id.second_Fragment)
//        navController.navigate(R.id.second_Fragment)
        Navigation.findNavController(requireActivity(), R.id.nav_host_fragment).navigate(R.id.second_Fragment)
    }
}