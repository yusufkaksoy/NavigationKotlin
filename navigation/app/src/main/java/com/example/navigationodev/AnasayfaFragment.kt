package com.example.navigationodev

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigationodev.databinding.FragmentAnasayfaBinding


class AnasayfaFragment : Fragment() {

    private  lateinit var tasarim : FragmentAnasayfaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        tasarim = FragmentAnasayfaBinding.inflate(inflater,container,false)
        //Layout yok cunku yukarıda kullandık..

        tasarim.buttonAnasayfaA.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_anasayfaFragment_to_sayfaAFragment)


        }

        tasarim.buttonAnasayfaX.setOnClickListener {

            Navigation.findNavController(it).navigate(R.id.action_anasayfaFragment_to_sayfaXFragment)



        }

        return tasarim.root
    }



}