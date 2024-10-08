package com.map.nguyenhongquan.mobileappdemo2.model

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(tableName = "tblInOut")
data class InOut (
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val name: String
)
