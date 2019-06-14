package com.bogdan.codeforceswatcher.model

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
data class User(@PrimaryKey(autoGenerate = true) var id: Long = 0, val avatar: String, val rank: String?, val handle: String, val rating: Int?, val maxRating: Int?, val firstName: String?, val lastName: String?, var ratingChanges: List<RatingChange>)