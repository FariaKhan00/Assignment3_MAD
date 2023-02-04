package com.Assignment3.MAD_3.ui.news

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class NewsResponse(
    @SerializedName("status")
    val status: String,
    @SerializedName("totalResults")
    val totalResults: Int,
    @SerializedName("articles")
    val newsList: List<News>
    ) {
}