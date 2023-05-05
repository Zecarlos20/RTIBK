package com.ibk.retotecnico;

import java.io.*;
import okhttp3.*;

public class main {
    public static void main(String []args) throws IOException{
        OkHttpClient client = new OkHttpClient().newBuilder().build();

        Request request = new Request.Builder()
                .url("https://api.apilayer.com/exchangerates_data/convert?to=EUR&from=PEN&amount=12.50")
                .addHeader("apikey", "6rGu1ThPcjnu2lZEiT82XYVRtXN4wzQG")
                .method("GET", null)
                .build();
    Response response = client.newCall(request).execute();
    System.out.println(response.body().string());
}
}
