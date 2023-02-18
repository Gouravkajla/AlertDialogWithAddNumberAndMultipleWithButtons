package com.layout.dialogwithaddnumberandmultiple

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import com.google.android.material.floatingactionbutton.FloatingActionButton
import kotlin.properties.Delegates

class MainActivity : AppCompatActivity() {
    lateinit var tvnumber:TextView
    lateinit var Floatbutton:FloatingActionButton
    lateinit var tvOutputR:TextView
   var a=0

    var multiply=5
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvnumber=findViewById(R.id.tvnumber)
        Floatbutton=findViewById(R.id.Floatbutton)
        tvOutputR=findViewById(R.id.tvOutputR)
        Floatbutton.setOnClickListener{
            var alertDialog=AlertDialog.Builder(this@MainActivity)
            alertDialog.setTitle("Alert")
            alertDialog.setMessage("Press Add ,to Add 10 Number" +
                    "\nPress Multiple, to Multiple 5 with Number" +
                    "\nPress Reset to Start the Number to 0 "
            )
            alertDialog.setCancelable(false)
            alertDialog.setPositiveButton("Add") { _, _ ->
                 a+=10
                tvOutputR.setText(a.toString())

            }
            alertDialog.setNegativeButton("Multiple") { _, _ ->
                a *=5
                tvOutputR.setText(a.toString())
            }

            alertDialog.setNeutralButton("Reset"){_,_->
              a=0
                tvOutputR.setText(a.toString())


            }


            alertDialog.show()

        }
    }
}




