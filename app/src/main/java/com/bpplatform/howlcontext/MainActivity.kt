package com.bpplatform.howlcontext

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().replace(R.id.frameLayout_main,MyFragment()).commit()

        //Toast.makeText(this,"토스트메시지 입니다.",Toast.LENGTH_LONG).show()
    }
}
