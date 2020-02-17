package com.faizikhwan.instagramclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.faizikhwan.instagramclone.ui.home.HomeFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction().replace(
                R.id.frame_layout,
                HomeFragment()
            ).commit()
        }
    }
}
