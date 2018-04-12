package com.epicodus.nba_matchup;

import android.util.Log;

import com.epicodus.nba_matchup.Constants;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by Edgar on 4/11/2018.
 */

public class SportsFeedsService {

    public static void findPlayer(String name, Callback callback){
        OkHttpClient client = new OkHttpClient.Builder().build();
        HttpUrl.Builder urlBuilder = HttpUrl.parse(Constants.CURRENT_ACTIVE_PLAYER_URL).newBuilder();
        urlBuilder.addQueryParameter(Constants.PlAYER_QUERY_PARAMETER, name);
        String url = urlBuilder.build().toString();

        Request request = new Request.Builder()
                .url(url)
                .header("Authorization", Constants.SPORTSFEEDS_TOKEN)
                .build();

        Call call = client.newCall(request);
        call.enqueue(callback);
    }
}
