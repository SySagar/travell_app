package com.example.travellapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import com.example.travellapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private  var binding : ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding!!.root)
        replaceFragment(HomeFragment())

        binding!!.bottomNavigationView.setOnItemSelectedListener {

            when(it.itemId){
                R.id.Home -> replaceFragment(HomeFragment())
                R.id.profile -> replaceFragment(Profile())
                R.id.Location -> replaceFragment(Location())

                else ->{



                }

            }

            true

        }

    }

    private fun replaceFragment(fragment : Fragment){

        val fragmentManager =  supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout,fragment)
        fragmentTransaction.commit()


    }

}