package com.foziea.fetch.networking

import com.foziea.fetch.model.FetchRewardsItem
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface FetchRewardsApi {

    @GET("hiring.json")
    suspend fun fetchItems(): List<FetchRewardsItem>

    companion object {
        operator fun invoke(

        ): FetchRewardsApi{

            val okHttpClient = OkHttpClient.Builder().build()

            return Retrofit.
                    Builder()
                .client(okHttpClient)
                .baseUrl("https://fetch-hiring.s3.amazonaws.com/")
                //https://fetch-hiring.s3.amazonaws.com/hiring.json
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(FetchRewardsApi::class.java)

        }
    }
}
