package com.Assignment3.MAD_3.ui.records

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity
data class Record(
    @PrimaryKey val id: Int,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "description") val description: String?,
    @ColumnInfo(name = "image") val image: String?,
    @ColumnInfo(name = "isFav") var isFav: Boolean
    ) : Serializable {
}