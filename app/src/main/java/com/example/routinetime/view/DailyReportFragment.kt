package com.example.routinetime.view

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.routinetime.databinding.FragmentDailyReportBinding
import com.example.routinetime.databinding.FragmentLaunchBinding
import com.example.routinetime.databinding.FragmentSignInOrUpBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [DailyReportFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class DailyReportFragment : Fragment() {
    private lateinit var binding: FragmentDailyReportBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            Log.d("CheckReport", "Hello Daily Report" )

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDailyReportBinding.inflate(inflater)

        return  binding.root
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val nickname = requireArguments().getString(ARG_NICKNAME)
        binding.txtSalutation.text = "Hello, $nickname. Complete the daily report "
    }

    companion object {
        const val ARG_NICKNAME = "nickname"

    }
}

