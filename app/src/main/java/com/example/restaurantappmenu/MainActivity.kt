package com.example.restaurantappmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.*
import com.example.restaurantappmenu.BreakfastFragment
import com.example.restaurantappmenu.DrinkFragment

class MainActivity : AppCompatActivity() {

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.restaurantmenu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {

            R.id.menu_item_1 -> {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.fragment_container, DrinkFragment())
                    .commit()
                true
            }
            R.id.menu_item_2 -> {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.fragment_container, BreakfastFragment())
                    .commit()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

}
