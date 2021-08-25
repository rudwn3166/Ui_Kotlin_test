package com.example.ui_kotlin_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//  확인 버튼이 눌리면 동작 할 수 있는 기능추가하기
        okBtn.setOnClickListener {
//            입력된 내용:contentEdt의 text의 값 조회 조회(get-값을 확인하는것것)변수에 저장하기
            val inpuContent=contentEdt.text.toString()
        //            저장해둔 입력 값을 ->텍스트뷰에 반영하기 (set-값을 대입)

            if(inpuContent=="안녕하세요"){
                resultTxt.text="반가워요"
            }

            else{
                resultTxt.text="안녕하세요?"

            }


        }

    }
}