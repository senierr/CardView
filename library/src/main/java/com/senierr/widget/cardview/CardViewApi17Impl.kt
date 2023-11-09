package com.senierr.widget.cardview

import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.RectF

internal class CardViewApi17Impl : CardViewBaseImpl() {


    override fun initStatic() {
        RoundRectDrawableWithShadow.sRoundRectHelper = object :
            RoundRectDrawableWithShadow.RoundRectHelper {
            override fun drawRoundRect(canvas: Canvas, bounds: RectF, cornerRadius: Float, cornerVisibility: Int, paint: Paint) {
                canvas.drawRoundRect(bounds, cornerRadius, cornerRadius, paint)
            }
        }
    }
}