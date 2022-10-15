package com.android.swapnilk.pizzamenu.sample.adapters

import android.view.LayoutInflater
import com.android.swapnilk.pizzamenu.sample.BR
import com.android.swapnilk.pizzamenu.sample.GenericRecyclerAdapter
import com.android.swapnilk.pizzamenu.sample.R
import com.android.swapnilk.pizzamenu.sample.databinding.ItemPriceVariantLayoutView
import com.android.swapnilk.pizzamenu.sample.models.PriceVariant

class PriceRecyclerAdapter(layoutInflater: LayoutInflater, list: List<PriceVariant?>?) :
    GenericRecyclerAdapter<ItemPriceVariantLayoutView, PriceVariant>(
        layoutInflater, list, R.layout.item_price_variant, BR.priceVariant
    )