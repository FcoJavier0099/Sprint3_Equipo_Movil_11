package com.example.checkbox

import android.os.Bundle
import android.widget.CheckBox
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import android.media.MediaPlayer
import android.view.Gravity




var check1 : CheckBox? = null
var check2 : CheckBox? = null
var check3 : CheckBox? = null
var  mp : MediaPlayer? = null

class MainActivity : AppCompatActivity() ,View.OnClickListener{


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        check1 = findViewById<CheckBox>(R.id.checkBox1)
        check2 = findViewById<CheckBox>(R.id.checkBox2)
        check3 = findViewById<CheckBox>(R.id.checkBox3)

       mp = MediaPlayer.create(this, R.raw.click)

    }

    override fun onClick(view: View?) {
        mp?.start()

        val opcion1 = check1?.isChecked



        if (opcion1 == true){
            val toast: Toast = Toast.makeText(this, "Acuario Seleccionado !!", Toast.LENGTH_SHORT)

            toast.setGravity(Gravity.CENTER,0,0)
            toast.show()



        }
        if (check2?.isChecked == true){
            val toast: Toast = Toast.makeText(this, "Isla Seleccionado !!", Toast.LENGTH_SHORT)

            toast.setGravity(Gravity.CENTER,0,0)
            toast.show()
        }

        if (check3?.isChecked == true){
            val toast: Toast = Toast.makeText(this, "Piscina Seleccionado !!", Toast.LENGTH_SHORT)

            toast.setGravity(Gravity.CENTER,0,0)
            toast.show()
        }
    }

}