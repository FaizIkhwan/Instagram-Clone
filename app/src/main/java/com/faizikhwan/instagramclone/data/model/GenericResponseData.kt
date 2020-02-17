package com.faizikhwan.instagramclone.data.model

import com.google.gson.JsonElement
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class GenericResponseData (
    @SerializedName("data")
    val data: JsonElement,
    @SerializedName("message")
    val message: String,
    @SerializedName("status")
    val status: Boolean
) : Serializable