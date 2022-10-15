package com.android.swapnilk.pizzamenu.sample.adapters

import android.view.LayoutInflater
import com.android.swapnilk.pizzamenu.sample.R
import com.android.swapnilk.pizzamenu.sample.databinding.ItemMenuLayoutView
import com.android.swapnilk.pizzamenu.sample.models.Product

class MenuRecyclerAdapter(layoutInflater: LayoutInflater, list: List<Product?>?) :
    ProductRecyclerAdapter<ItemMenuLayoutView>(layoutInflater, list, R.layout.item_menu)