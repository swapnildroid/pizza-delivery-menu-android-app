package com.android.swapnilk.pizzamenu.sample

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView

abstract class GenericRecyclerAdapter<GenericViewBinding : ViewDataBinding, GenericData : Any?>(
    protected val layoutInflater: LayoutInflater,
    private val list: List<GenericData?>?,
    private val itemLayoutRes: Int,
    private val bindingVariable: Int
) : RecyclerView.Adapter<GenericRecyclerAdapter<GenericViewBinding, GenericData>.GenericViewHolder>() {

    inner class GenericViewHolder(val viewBinding: GenericViewBinding) :
        RecyclerView.ViewHolder(viewBinding.root)

    open fun bind(viewBinding: GenericViewBinding, genericData: GenericData?) {
        viewBinding.setVariable(bindingVariable, genericData)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GenericViewHolder =
        GenericViewHolder(
            DataBindingUtil.inflate(
                layoutInflater, itemLayoutRes, parent, false
            )
        )

    override fun getItemCount(): Int = list?.size ?: 0

    override fun onBindViewHolder(holder: GenericViewHolder, position: Int) =
        bind(holder.viewBinding, list?.get(position))

}