package com.nepplus.intent_20220215

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnMoveToOtherActivity.setOnClickListener {

            //OtherActivity로 이동

            val myIntent = Intent(this, OtherActivity::class.java)
            startActivity(myIntent)
        }


        btnSendMessage.setOnClickListener {
            //1. 뭐라고 입력했는지 추출
            val inputMessage = edtMessage.text.toString()

            //2. 추출한 내용을 다른화면에 전달 (화면으로 이동)
            val myIntent =Intent(this, ViewMessageActivity::class.java)

            // myIntent에, 입력한 내용을 첨부
            myIntent.putExtra("message",inputMessage)

            startActivity(myIntent)
        }
    }
}