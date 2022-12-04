package com.example.chato.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuInflater
import android.view.MenuItem
import androidx.core.view.get
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.example.chato.R
import com.example.chato.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val navHostFragment=this.supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        val navController=navHostFragment.navController
        NavigationUI.setupWithNavController(binding.bottomNavigation,navController)
    }

    private fun changeBtnIcon(){
       /* binding.bottomNavigation.setOnItemSelectedListener { item->
            when(item.itemId){
                R.id.channelsFragment-> {
                    binding.floatingBtn.setImageResource(R.drawable.ic_baseline_groups)
                    true
                }
                else->{
                    binding.floatingBtn.setImageResource(R.drawable.ic_baseline_chat)
                    true
                }
            }
        }*/
    }
}