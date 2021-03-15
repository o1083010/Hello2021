package pu.edu.tw.hello2020

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.TestLooperManager
import android.view.MotionEvent
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onTouchEvent(event: MotionEvent?): Boolean {
        var txv: TextView = findViewById<TextView>(R.id.txv)
        txv.text = "tcyangpu修改螢幕觸控"
        return true
    }
}
