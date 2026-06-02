package com.hanium.bookhelper

import android.os.Bundle
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    fun makeBookGuide(title: String, price: Int): String {
        return "선택한 책은 " + title + "이고 가격은 " + price + "원입니다. 구매 단계 안내를 시작합니다."
    }
}
