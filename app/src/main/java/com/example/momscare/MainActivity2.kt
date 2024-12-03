package com.example.momscare

import android.os.Bundle
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import com.example.momscare.databinding.ActivityMain2Binding
import com.google.android.material.navigation.NavigationView

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var toggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        // Initialize Toolbar
        setSupportActionBar(binding.toolbar) // Use binding to access toolbar
        drawerLayout = binding.drawerLayout
        toggle = ActionBarDrawerToggle(
            this,
            drawerLayout,
            binding.toolbar, // Reference to your toolbar
            R.string.navigation_drawer_open,
            R.string.navigation_drawer_close
        )

        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        val navigationView: NavigationView = binding.navigationView
        navigationView.setNavigationItemSelectedListener { menuItem ->
            menuItem.isChecked = true
            drawerLayout.closeDrawers()

            when (menuItem.itemId) {
                R.id.nav_home -> {
                    // Handle home click
                }
                R.id.nav_profile -> {
                    // Handle profile click
                }
                R.id.nav_settings -> {
                    // Handle settings click
                }
            }
            true
        }
    }
}
