package com.nepplus.intent_20220215

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edit_nickname.*

class EditNicknameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_nickname)

        btnSave.setOnClickListener {

            // 입력된 닉네임을 변수에 저장
            val inputNickname =  edtNickname.text.toString()

            // 복귀시 데이터를 들고갈 Intent를 생성
            val resultIntent = Intent()  // 결과를 담기위한 용도로만 사용. 출발지 /도착지 명시 x

            // Intent에 결과(데이터) 담기 -> putExtra 활용
            resultIntent.putExtra("nick",inputNickname)

            // 실제 복귀 결과로 세팅
            // 확인을 눌렀다 + 들고 돌아갈 데이터
            setResult(RESULT_OK, resultIntent)

            finish()
        }
    }
}