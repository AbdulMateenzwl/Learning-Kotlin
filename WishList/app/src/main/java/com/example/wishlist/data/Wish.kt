package com.example.wishlist.data

data class Wish(
    val id:Long = 0L,
    val title:String = "",
    val description:String = ""
)

object DummyWish{
    val wishList = listOf(
        Wish(title = "Google Watch", description = "description1"),
        Wish(title = "Google Watch 1", description = "description1"),
        Wish(title = "Google Watch 2", description = "description1"),
        Wish(title = "Google Watch 3", description = "description1"),
        Wish(title = "Google Watch 4", description = "description of the object "),
        Wish(title = "Google Watch 5", description = "descriptio of the object 1"), Wish(title = "Google Watch", description = "description1"),
        Wish(title = "Google Watch 2", description = "description1"),
        Wish(title = "Google Watch 3", description = "description1"),
        Wish(title = "Google Watch 4", description = "description of the object "),
        Wish(title = "Google Watch 5", description = "descriptio of the object 1"),
    )
}