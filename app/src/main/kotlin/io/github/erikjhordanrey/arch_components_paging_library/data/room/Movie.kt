package io.github.erikjhordanrey.arch_components_paging_library.data.room

import androidx.room.Entity
import androidx.room.PrimaryKey
import io.github.erikjhordanrey.arch_components_paging_library.data.room.DATABASE.TABLE_MOVIE

@Entity(tableName = TABLE_MOVIE)
data class Movie(@PrimaryKey val id: Long,
                 val title: String,
                 val popularity: Int,
                 val voteAverage: Int,
                 val posterUrl: String,
                 val description: String)
