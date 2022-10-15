package com.android.swapnilk.pizzamenu.sample.adapters

import android.view.LayoutInflater
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.PagerSnapHelper
import com.android.swapnilk.pizzamenu.sample.BR
import com.android.swapnilk.pizzamenu.sample.GenericRecyclerAdapter
import com.android.swapnilk.pizzamenu.sample.R
import com.android.swapnilk.pizzamenu.sample.databinding.ItemCategoryLayoutView
import com.android.swapnilk.pizzamenu.sample.models.Category

class CategoryRecyclerAdapter(layoutInflater: LayoutInflater, list: List<Category?>?) :
    GenericRecyclerAdapter<ItemCategoryLayoutView, Category>(
        layoutInflater, list, R.layout.item_category, BR.category
    ) {
    override fun bind(viewBinding: ItemCategoryLayoutView, genericData: Category?) {
        viewBinding.category = genericData
        PagerSnapHelper().attachToRecyclerView(viewBinding.categoryList)
//        viewBinding.categoryList.addItemDecoration(LinePagerIndicatorDecoration())
        viewBinding.run {
            adapter = when (genericData?.title) {
                "Recommended" -> RecommendedRecyclerAdapter(layoutInflater, genericData.productList)
                "Menu" -> {
                    categoryList.layoutManager = GridLayoutManager(categoryList.context, 2)
                    MenuRecyclerAdapter(layoutInflater, genericData.productList)
                }
                "Offers" -> OfferRecyclerAdapter(layoutInflater, genericData.productList)
                else -> null
            }
        }
    }
}