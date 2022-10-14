package com.example.multipantalla

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity()

{
    var editText: EditText? = null
    var editText5: EditText? = null
    var editText6: EditText? = null
    var editText7: EditText? = null
    var editText8: EditText? = null
    val button2: Button? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editText = findViewById<EditText>(R.id.editText)
        editText5 = findViewById<EditText>(R.id.editText5)
        editText6 = findViewById<EditText>(R.id.editText6)
        editText7 = findViewById<EditText>(R.id.editText7)
        editText8 = findViewById<EditText>(R.id.editText8)



        val btn: Button = findViewById(R.id.button2)
        btn.setOnClickListener {

            val intent: Intent = Intent(this, pantalla2:: class.java)
            startActivity(intent)


        }
    }
}