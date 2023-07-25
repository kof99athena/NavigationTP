package com.athena.navigationtp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.athena.navigationtp.databinding.ActivityMainBinding

/*
대상 : 앱의 콘텐츠 화면 영역
작엽 : 논리적 연결 (인텐트 등 )
탐색 : 앱의 대상간에 탐색이 발생한다. 대상들은 작업을 통해 연결됨.
탐색 그래프 : 모든 대상 및 작업을 포함하는 리소스 파일, 그래프는 앱의 모든 탐색 경로를 나타냄.
*/

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent = Intent(this,WebviewActivity::class.java)
        binding.btn.setOnClickListener {
            startActivity(intent)
        }


    }
}