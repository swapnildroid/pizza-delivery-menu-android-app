package com.android.swapnilk.pizzamenu.sample.adapters

import android.view.LayoutInflater
import com.android.swapnilk.pizzamenu.sample.R
import com.android.swapnilk.pizzamenu.sample.databinding.ItemOfferLayoutView
import com.android.swapnilk.pizzamenu.sample.models.Product

class OfferRecyclerAdapter(layoutInflater: LayoutInflater, list: List<Product?>?) :
    ProductRecyclerAdapter<ItemOfferLayoutView>(layoutInflater, list, R.layout.item_offer)