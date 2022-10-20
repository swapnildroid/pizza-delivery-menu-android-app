package com.android.swapnilk.pizzamenu.sample.adapters

import android.net.Uri
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners

@BindingAdapter("app:imageUrl")
fun setImageUrl(imageView: ImageView, url: String?) {
    Glide.with(imageView.context)
        .load(Uri.parse("file:///android_asset/$url"))
        .transform(RoundedCorners(20))
        .into(imageView)
}