package com.example.spotify

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
    }


    override fun onRestart() {
        fun proxTela2(view: View) {
            var intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
        super.onRestart()
    }

    fun fechaTela(view: View) {
        Toast.makeText(this, "finalizou programa", Toast.LENGTH_LONG).show()

    }
}