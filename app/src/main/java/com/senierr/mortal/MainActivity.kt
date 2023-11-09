package com.senierr.mortal

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.senierr.mortal.databinding.ActivityMainBinding

/**
 * 主页面
 *
 * @author zhouchunjie
 * @date 2019/7/6
 */
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

}