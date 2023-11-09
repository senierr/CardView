package com.senierr.widget.cardview

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.drawable.Drawable
import androidx.annotation.ColorInt


internal interface CardViewImpl {
    fun initialize(cardView: CardViewDelegate, context: Context, backgroundColor: ColorStateList,
                   radius: Float, elevation: Float, maxElevation: Float, direction: Int, cornerVisibility: Int, startColor: Int = -1, endColor: Int = -1)

    fun setRadius(cardView: CardViewDelegate, radius: Float)

    fun getRadius(cardView: CardViewDelegate): Float

    fun setElevation(cardView: CardViewDelegate, elevation: Float)

    fun getElevation(cardView: CardViewDelegate): Float

    fun initStatic()

    fun setMaxElevation(cardView: CardViewDelegate, maxElevation: Float)

    fun getMaxElevation(cardView: CardViewDelegate): Float

    fun getMinWidth(cardView: CardViewDelegate): Float

    fun getMinHeight(cardView: CardViewDelegate): Float

    fun updatePadding(cardView: CardViewDelegate)

    fun onCompatPaddingChanged(cardView: CardViewDelegate)

    fun onPreventCornerOverlapChanged(cardView: CardViewDelegate)

    fun setBackgroundColor(cardView: CardViewDelegate, color: ColorStateList?)

    fun setShadowColor(cardView: CardViewDelegate, @ColorInt startColor: Int, @ColorInt endColor: Int)

    fun getBackgroundColor(cardView: CardViewDelegate): ColorStateList

    fun getShadowBackground(cardView: CardViewDelegate): Drawable

    fun setColors(cardView: CardViewDelegate, backgroundColor: Int, shadowStartColor: Int, shadowEndColor: Int)
}
