package com.faizikhwan.instagramclone.data.network

import com.faizikhwan.instagramclone.data.model.GenericResponseData
import io.reactivex.Observable
import retrofit2.http.GET

interface NetworkApi {
    @GET("ping")
    fun ping(): Observable<GenericResponseData>
}