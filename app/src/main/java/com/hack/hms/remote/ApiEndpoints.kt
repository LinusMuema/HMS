package com.hack.hms.remote

import android.provider.ContactsContract
import retrofit2.http.GET

interface ApiEndpoints {

    @GET("")
    suspend fun getData(): List<ContactsContract.Data>
}