package com.android.swapnilk.pizzamenu.sample.models

data class Product(
    var title: String? = null,
    var subTitle: String? = null,
    var imageUrl: String? = null,
    var rating: Float? = null,
    var discount: Float? = null,
    var priceList: List<PriceVariant?>? = listOf()
) {

    fun getMinimumPrice(): String? {
        val minPriceVariant: PriceVariant? = priceList?.minByOrNull { it ->
            it?.price ?: 0.0f
        }
        return minPriceVariant?.price?.toString()
    }

}