package com.example.medetationui

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Color

data class Feature(
    val title: String,
    @DrawableRes
    val iconId: Int,
    val darkColor: Color,
    val mediumColor: Color,
    val lightColor: Color
)
