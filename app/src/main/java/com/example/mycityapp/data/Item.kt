package com.example.mycityapp.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Item (
    @DrawableRes val image: Int,
    @StringRes val text: Int,
    @StringRes val contentDescription: Int
)
