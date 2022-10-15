package com.android.swapnilk.pizzamenu.sample.adapters

import android.view.LayoutInflater
import androidx.databinding.ViewDataBinding
import com.android.swapnilk.pizzamenu.sample.BR
import com.android.swapnilk.pizzamenu.sample.GenericRecyclerAdapter
import com.android.swapnilk.pizzamenu.sample.models.Product

open class ProductRecyclerAdapter<GenericViewBinding : ViewDataBinding>(
    layoutInflater: LayoutInflater, list: List<Product?>?, itemLayoutRes: Int
) :
    GenericRecyclerAdapter<GenericViewBinding, Product>(
        layoutInflater, list, itemLayoutRes, BR.product
    )