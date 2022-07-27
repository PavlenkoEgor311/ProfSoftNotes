package com.example.profnotes

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.example.profnotes.databinding.FragmentLoginBinding
import android.content.Intent as Intent

class LoginFragment : Fragment() {
    // TODO: Rename and change types of parameters
    //private var param1: String? = null
    // private var param2: String? = null
    lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_login, container, false)
    }
}