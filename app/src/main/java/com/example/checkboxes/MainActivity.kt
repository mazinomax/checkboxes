package com.example.checkboxes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.CheckBox
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun onCheckBoxClick(view:View) {
            view as CheckBox // cast view as checkbox type, object or view

        var isChecked: Boolean = view.isChecked

        when ( view.id) {

            R.id.cassCheckBox -> {if (isChecked) { Log.d("check", "cassChecked")} else{ Log.d("check","CassNotChecked")}
                                                                 veggieCheckBox.isChecked = false
                                                                 fruitcheckBox.isChecked = false}
            R.id.veggieCheckBox -> if (isChecked) {Log.d("check", "veggieChecked")} else{ Log.d("check","VeggieNotChecked")}
            R.id.fruitcheckBox -> if (isChecked) {Log.d("check", "fruitChecked")} else{ Log.d("check","FruitsNotChecked")}

        }



    }




}