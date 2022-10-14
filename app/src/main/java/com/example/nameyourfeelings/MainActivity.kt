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

        etName = findViewById(R.id.et_name)

        button.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)



    }

    override fun onClick(view: View) {
            /*if (view.id == R.id.button) {
                if (etName.text.isEmpty()) {
                    Toast.makeText(
                        applicationContext,
                        "Harap isi nama terlebih dahulu",
                        Toast.LENGTH_SHORT
                    ).show()
                }
                Toast.makeText(
                    this@MainActivity,
                    "Hi " + etName.text + "!" + "You Are Happy",
                    Toast.LENGTH_SHORT
                ).show()
            }*/

            when (view.id) {
                R.id.button -> {
                    if (etName.text.isEmpty()) {
                        Toast.makeText(
                            this@MainActivity,
                            "How would I know you? Please input your name first",
                            Toast.LENGTH_SHORT
                        ).show()
                    } else {
                        Toast.makeText(
                            this@MainActivity,
                            "Hi " + etName.text + " ! " + "Glad to know that you are happy ^^",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                }
                R.id.button2 -> {
                    if (etName.text.isEmpty()) {
                        Toast.makeText(
                            this@MainActivity,
                            "How would I know you? Please input your name first",
                            Toast.LENGTH_SHORT
                        ).show()
                    } else {
                        Toast.makeText(
                            this@MainActivity,
                            "Hi " + etName.text + " ! " + "We know that you are sad, but calm down. It's not the end of the world :)",
                            Toast.LENGTH_LONG
                        ).show()
                    }
                }
                R.id.button3 -> {
                    if (etName.text.isEmpty()) {
                        Toast.makeText(
                            this@MainActivity,
                            "How would I know you? Please input your name first",
                            Toast.LENGTH_SHORT
                        ).show()
                    } else {
                        Toast.makeText(
                            this@MainActivity,
                            "Hi " + etName.text + " ! " + "Why you are mad? Everybody do make mistakes at some points. Forgive, and let go :) ",
                            Toast.LENGTH_LONG
                        ).show()
                    }
                }
            }
        }
}