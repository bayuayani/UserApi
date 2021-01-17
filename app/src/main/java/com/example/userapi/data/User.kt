package com.example.userapi.data

import android.os.Parcel
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class User (
    val login: String,
    val avatarUrl: String,
    val htmUrl: String,
    val followersUrl: String,
    val followingUrl: String,
    val followers: Int,
    val following: Int,
    val reposUrl: String,
    val repos: Int
        ): Parcelable
