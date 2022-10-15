package com.android.swapnilk.pizzamenu.sample

import com.android.swapnilk.pizzamenu.sample.models.*

object SampleData {

    private fun generateProductList(max: Int, label: String? = null): List<Product> {
        val mutableListOf = mutableListOf<Product>()
        for (i in 1..max) {
            mutableListOf.add(
                Product(
                    "Pizza $label $i",
                    "Pizza $label $i",
                    "https://foodish-api.herokuapp.com/images/pizza/pizza$i.jpg",
                    4.0f,
                    20.0f,
                    listOf(
                        PriceVariant(10f, "Medium"),
                        PriceVariant(8f, "Small"),
                    ),
                )
            )
        }
        return mutableListOf
    }

    fun generateRestaurantMenu(): RestaurantMenu {
        return RestaurantMenu(
            Header("Delivery", "Suite 220, 1235 West lake..."),
            listOf(
                Category("Recommended", generateProductList(3, "Rec")),
                Category("Menu", generateProductList(4, "MIB")),
                Category("Offers", generateProductList(4, "Ocean"))
            )
        )
    }

}