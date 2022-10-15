package com.android.swapnilk.pizzamenu.sample

import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.android.swapnilk.pizzamenu.sample.adapters.CategoryRecyclerAdapter
import com.android.swapnilk.pizzamenu.sample.databinding.MainLayoutView
import com.android.swapnilk.pizzamenu.sample.models.RestaurantMenu

class MainActivity : AppCompatActivity() {

    lateinit var mMainLayoutView: MainLayoutView

    private val generateRestaurantMenu: RestaurantMenu = SampleData.generateRestaurantMenu()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mMainLayoutView = DataBindingUtil.setContentView(this, R.layout.activity_main)
        setSupportActionBar(mMainLayoutView.toolbar)
        mMainLayoutView.header = generateRestaurantMenu.header
        mMainLayoutView.adapter =
            CategoryRecyclerAdapter(layoutInflater, generateRestaurantMenu.categoryList)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

}

