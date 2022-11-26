package com.kjy.practice_databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.kjy.practice_databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:  ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // dataBinding 설정
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.user = UserProfile("JaeYoun", "Kim")
        binding.detail = UserDetail("30", "951129")


    }
}