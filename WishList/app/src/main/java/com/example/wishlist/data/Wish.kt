package com.example.wishlist.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "wish-table")
data class Wish(
    @PrimaryKey(autoGenerate = true)
    val id:Long = 0L,
    @ColumnInfo(name = "wish-title")
    val title:String = "",
    @ColumnInfo(name = "wish-desc")
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