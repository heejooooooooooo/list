package com.example.list

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.list.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    private val profiles = listOf(
        Profile("김희주",false),
        Profile("김가가",false),
        Profile("김나나",false),
        Profile("김다다",false),
        Profile("김희희",false),
        Profile("김주주",false),
        Profile("김아아",false),
        Profile("김머머",false),
        Profile("김라라",false),
        Profile("김다가",false),
        Profile("김아휴",false),
        Profile("김에휴",false),
        Profile("김으으",false),
        Profile("김으악",false),
        Profile("김으앙",false),
        Profile("김후엥",false),
        Profile("김이야",false),

    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        initializeViews()
    }

    private fun initializeViews() {
        binding.rvProfile.layoutManager = LinearLayoutManager(this)
        binding.rvProfile.adapter = ProfileAdapter(profiles)

    }
}