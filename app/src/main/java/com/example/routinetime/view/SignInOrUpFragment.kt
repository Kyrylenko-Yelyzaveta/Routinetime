package com.example.routinetime.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.core.widget.doAfterTextChanged
import androidx.navigation.fragment.findNavController
import com.example.routinetime.R
import com.example.routinetime.databinding.FragmentSignInOrUpBinding
import com.example.routinetime.model.Profile.Profile
import com.example.routinetime.viewmodel.MainViewModel

class SignInOrUpFragment : Fragment() {
    private lateinit var binding: FragmentSignInOrUpBinding
    private var profile = Profile()
    private var viewModel= MainViewModel()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentSignInOrUpBinding.inflate(inflater)




        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val text = requireArguments().getString(ARG_TEXT)
        binding.header.text = text

        if(text == "Sign In"){
            binding.edFirstName.visibility = View.GONE
            binding.edLastName.visibility = View.GONE
            binding.edRepeatPassword.visibility = View.GONE
            binding.btnDoneSignInOrUp.text = text
        }
        else(View.VISIBLE)

        saveInputData()



    }
    private fun saveInputData() {
        binding.edFirstName.doAfterTextChanged { profile.firstName = it.toString() }
        binding.edLastName.doAfterTextChanged { profile.lastName = it.toString() }
        binding.edNickname.doAfterTextChanged { profile.nickname = it.toString() }
        binding.edPassword.doAfterTextChanged { profile.password = it.toString() }
        binding.edRepeatPassword.doAfterTextChanged {
            profile.repeatPassword = it.toString()
            if (binding.edPassword.text == binding.edRepeatPassword.text) {
                binding.btnDoneSignInOrUp.isClickable
            }
        }
        binding.btnDoneSignInOrUp.setOnClickListener {
            openReportScreen(binding.edNickname.text.toString())
            viewModel.writeAccountToFirebase()
        }

    }
    private fun openReportScreen(nickname:String)
    {
        findNavController().navigate(R.id.action_singInOrOutFragment_to_dailyReportFragment,
            bundleOf(DailyReportFragment.ARG_NICKNAME to nickname))
    }


    companion object {
        const val ARG_TEXT = "text"
//        const val REQUEST_CODE = "REQUEST_CODE"

    }
}