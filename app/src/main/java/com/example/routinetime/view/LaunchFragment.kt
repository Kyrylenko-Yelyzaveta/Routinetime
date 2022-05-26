package com.example.routinetime.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.routinetime.R
import com.example.routinetime.databinding.FragmentLaunchBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [LaunchFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class LaunchFragment : Fragment() {
    private lateinit var binding: FragmentLaunchBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentLaunchBinding.inflate(inflater)

        initListeners()

        return binding.root
    }

    private fun initListeners() {
        binding.btnSignIn.setOnClickListener { replaceToSingInScr() }
        binding.btnSignUp.setOnClickListener { replaceToSingUpScr() }

    }

    private fun replaceToSingInScr() {
                 openSingScreen("Sign In")
    }
    private fun replaceToSingUpScr() {
            openSingScreen("Sign Up")
    }
    private fun openSingScreen(text:String)
    {
        findNavController().navigate(R.id.action_launchFragment_to_signInOrUpFragment,
            bundleOf(SignInOrUpFragment.ARG_TEXT to text))
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        findNavController()
    }

}
