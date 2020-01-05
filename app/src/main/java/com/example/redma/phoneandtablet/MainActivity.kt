package com.example.redma.phoneandtablet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //スタートボタンクリック時の動作
        startBtn.setOnClickListener{
            //srtartServiceメソッドを実行するようにする
            val intent = Intent(this, TorchOnService::class.java)
            startService(intent)
        }

        //ストップボタンクリックでサービスを停止
        stopBtn.setOnClickListener{
            val intent = Intent(this, TorchOnService::class.java)
            stopService(intent)
        }
    }
}
