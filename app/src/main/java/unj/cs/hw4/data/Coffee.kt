package unj.cs.hw4.data

import androidx.annotation.DrawableRes

data class Coffee(
    @DrawableRes var imageResourceId: Int,
    var title: String,
    var description: String
) {
}