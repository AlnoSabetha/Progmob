package com.example.progmob.model.network

class networkconfig {
    fun getInterceptor() : okHttpClient {
        val logging = HttpLoggingInterceptor()
        Logging.level = HttpLoggingInterceptor.level.BODY
        val okHttpClient = okHttpClient.Builder()
            .addInterceptor(logging)
            .build()
        return okHttpClient
    }
    fun getRetrofit() : Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.typicode.com/")
            .client(getInterceptor())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    fun getService() = getRetrofit().create(Users::class.java)
}
interface Users {
    @GET("users")
    fun getUsers() : Call<List<ResponseUsersItem>>
}