package com.android.swapnilk.pizzamenu.sample.adapters

import android.view.LayoutInflater
import com.android.swapnilk.pizzamenu.sample.R
import com.android.swapnilk.pizzamenu.sample.databinding.ItemRecommendedLayoutView
import com.android.swapnilk.pizzamenu.sample.models.Product

class RecommendedRecyclerAdapter(layoutInflater: LayoutInflater, list: List<Product?>?) :
    ProductRecyclerAdapter<ItemRecommendedLayoutView>(
        layoutInflater, list, R.layout.item_recommended
    ) {

    override fun bind(viewBinding: ItemRecommendedLayoutView, genericData: Product?) {
        super.bind(viewBinding, genericData)
        viewBinding.priceAdapter = PriceRecyclerAdapter(layoutInflater, genericData?.priceList)
    }

}