package com.example.nameyourfeelings

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.view.View
import android.widget.EditText
import com.example.nameyourfeelings.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var etName : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.button -> if (etName.text.isEmpty()) {
                Toast.makeText(
                    applicationContext,
                    "Harap isi nama terlebih dahulu",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                Toast.makeText(this@MainActivity, "Hi "+etName.text+"!"+"You Are Happy", Toast.LENGTH_SHORT).show()
            }
            R.id.button2 -> Toast.makeText(this@MainActivity, "You Are Sad", Toast.LENGTH_SHORT).show()
            R.id.button3 -> Toast.makeText(this@MainActivity, "You Are Mad", Toast.LENGTH_SHORT).show()
        }
    }
}