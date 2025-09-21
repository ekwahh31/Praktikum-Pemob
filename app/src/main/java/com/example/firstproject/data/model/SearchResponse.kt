package com.example.firstproject.data.model

import com.google.gson.annotations.SerializedName
data class SearchResponse(
    @SerializedName("docs")
    val docs: List<BookDoc>
)
data class BookDoc(
    @SerializedName("title")
    val title: String?,
    @SerializedName("author_name")
    val authorName: List<String>?,
    @SerializedName("First_publish_year")
    val FirstPublishYear: Int?
)


