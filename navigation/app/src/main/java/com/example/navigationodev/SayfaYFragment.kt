package com.example.navigationodev

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.navigationodev.databinding.FragmentSayfaYBinding


class SayfaYFragment : Fragment() {

    private  lateinit var  tasarim : FragmentSayfaYBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        tasarim = FragmentSayfaYBinding.inflate(inflater,container,false)

        val callback = object : OnBackPressedCallback(true)
        {
            override fun handleOnBackPressed() {
                findNavController().navigate(R.id.action_sayfaYFragment_to_anasayfaFragment2)
            }


        }
        requireActivity().onBackPressedDispatcher.addCallback(callback)







        return tasarim.root
    }



}