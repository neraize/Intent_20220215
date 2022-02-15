package com.nepplus.intent_20220215

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_view_message.*

class ViewMessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_message)

        // 화면이 시작되면 바로 문구 설정

        // 이전 화면에서  ("Message" 이름붙여서 ) 첨부한 문구 받기
        val message =intent.getStringExtra("Message")

        txtMessage.text = message
    }
}