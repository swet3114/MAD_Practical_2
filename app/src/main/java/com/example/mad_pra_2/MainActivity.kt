package com.example.mad_pra_2

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        Log.i("logging","onCreate executing")
        Toast.makeText(this, "onCreate", Toast.LENGTH_LONG).show()
    }
    override fun onStart() {
        super.onStart()
        Log.i("logging","onStart executing")
        Toast.makeText(this, "onStart", Toast.LENGTH_LONG).show()
        Snackbar.make(findViewById(R.id.main),"hello everyone",Snackbar.LENGTH_LONG).show()
    }
    //dhudhgoishgdjdklgj
    override fun onResume() {
        super.onResume()
        Log.i("logging","onResume executing")
    }
    override fun onPause() {
        super.onPause()
        Log.i("logging","onPause executing")
    }
    override fun onRestart() {
        super.onRestart()
        Log.i("logging","onRestart executing")
    }
}
