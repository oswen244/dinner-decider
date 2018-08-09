package com.oswaldo.dinnerdecider

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val foodList = arrayListOf("Mexicana" , "China", "Hamburguesas", "Pizza", "Fit", "Ensalada", "Juan Valdez", "Popsy", "McFlurry")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_decide.setOnClickListener {
            val random = Random()
            val randomFood = random.nextInt(foodList.count())
            txt_selected_food.text = foodList[randomFood]
        }

        btn_add_food.setOnClickListener {
            val newFood = edit_add_food.text.toString()
            foodList.add(newFood)
            edit_add_food.text.clear()
            Toast.makeText(this, "Nuevo elemento agregado", Toast.LENGTH_SHORT).show()
            println(foodList)
        }
    }
}
