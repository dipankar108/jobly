package com.university_project.jobly.employee

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.university_project.jobly.databinding.FragmentAppliedPostBinding

class AppliedPostFragment : Fragment() {
    private lateinit var _binding: FragmentAppliedPostBinding
    private val binding get() = _binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentAppliedPostBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
}