package com.fuusy.navigationremake

import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import com.google.android.material.bottomnavigation.BottomNavigationView

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navView: BottomNavigationView = findViewById(R.id.nav_view)

        navView.setItemIconTintList(null);
        val navController = Navigation.findNavController(this, R.id.nav_host_fragment);

        navView.setOnNavigationItemSelectedListener {

            when (it.itemId) {
                R.id.navigation_home -> {
                    navController.navigate(R.id.homeFragment)
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.navigation_health -> {
                    navController.navigate(R.id.projectFragment)
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.navigation_personal -> {
                    navController.navigate(R.id.weFragment)
                    return@setOnNavigationItemSelectedListener true
                }
            }
            false
        }

    }
}