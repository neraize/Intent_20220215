package com.nepplus.intent_20220215

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_other.*

class OtherActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other)

        btnReturnToMain.setOnClickListener {
            // 돌아가는 경우에는 Intent 활용x
//            val myIntent = Intent(this, MainActivity::class.java)
//            startActivity(myIntent)

            finish()
        }
    }
}