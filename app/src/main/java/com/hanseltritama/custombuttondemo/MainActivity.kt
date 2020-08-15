package com.hanseltritama.custombuttondemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        custom_button.setOnClickListener {
            Snackbar.make(it, "Click", Snackbar.LENGTH_SHORT).show()
        }
        
        switch_enable_button.setOnCheckedChangeListener { switchButton, isChecked ->
            custom_button.isEnabled = isChecked
        }
    }
}
