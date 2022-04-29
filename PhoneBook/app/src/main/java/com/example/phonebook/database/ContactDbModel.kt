package com.example.phonebook.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ContactDbModel(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "content") val content: String,
    @ColumnInfo(name = "can_be_checked_off") val canBeCheckedOff: Boolean,
    @ColumnInfo(name = "is_checked_off") val isCheckedOff: Boolean,
    @ColumnInfo(name = "tag_id") val tagId: Long,
    @ColumnInfo(name = "in_trash") val isInTrash: Boolean,
    @ColumnInfo(name = "is_favorite") val isFavorite: Boolean,




) {
    companion object {
        val DEFAULT_CONTACTS = listOf(
            ContactDbModel(1, "RW Meeting", "0819512365", false, false, 1, false,false),
            ContactDbModel(2, "Bills", "0812345678", false, false, 2, false,false),
            ContactDbModel(3, "Pancake recipe", "0819321654", false, false, 3, false,false),
            ContactDbModel(
                4,
                "Workout",
                "0899999999",
                false,
                false,
                4,
                false,
                false
            ),
            ContactDbModel(5, "Andrew Kotlin", "0823654589", false, false, 5, false,false),
            ContactDbModel(6, "Python", "0863215689", false, false, 1, false,false),
            ContactDbModel(7, "Manager", "0681565155", false, false, 2, false,false),
            ContactDbModel(8, "Zootopia", "0813216549", false, false, 3, false,false),
            ContactDbModel(9, "Gangnam Style", "012345678", false, false, 4, false,false),
            ContactDbModel(10, "Justin Barber", "987654321", false, false, 5, false,false),
            ContactDbModel(11, "Coward", "0912345678", true, false, 1, false,false),
            ContactDbModel(12, "Tomas Edison", "0235564891", true, false, 2, false,false)
        )
    }
}


