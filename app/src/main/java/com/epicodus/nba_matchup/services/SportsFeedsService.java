package com.epicodus.nba_matchup.services;

import android.util.Log;

import com.epicodus.nba_matchup.Constants;
import com.epicodus.nba_matchup.models.Player;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by Edgar on 4/11/2018.
 */

public class SportsFeedsService {

    public static void findPlayer(String name, Callback callback){
        OkHttpClient client = new OkHttpClient.Builder().build();

        HttpUrl.Builder urlBuilder = HttpUrl.parse(Constants.CURRENT_ACTIVE_PLAYER_URL).newBuilder();
        urlBuilder.addQueryParameter(Constants.PLAYER_QUERY_PARAMETER, name);
        String url = urlBuilder.build().toString();

        Request request = new Request.Builder()
                .url(url)
                .header("Authorization", Constants.SPORTSFEEDS_TOKEN)
                .build();

        Call call = client.newCall(request);
        call.enqueue(callback);
    }

    public ArrayList<Player> processFindPlayerResults(Response response){
        ArrayList<Player> listOfPlayers = new ArrayList<>();

        try{
            String jsonData = response.body().string();
            JSONObject resultJSON = new JSONObject(jsonData);
            JSONObject activePlayersJSON = resultJSON.getJSONObject("activeplayers");
            JSONArray playerEntryJSON = activePlayersJSON.getJSONArray("playerentry");
            for (int i = 0; i < playerEntryJSON.length(); i++){
                JSONObject playerContainerJSON = playerEntryJSON.getJSONObject(i);
                JSONObject playerJSON = playerContainerJSON.getJSONObject("player");
                String firstName = playerJSON.getString("FirstName");
                String lastName = playerJSON.getString("LastName");
                String jerseyNumber = playerJSON.optString("JerseyNumber", "Jersey not available");
                String position = playerJSON.getString("Position");
                String age = playerJSON.getString("Age");
                String birthDay = playerJSON.getString("BirthDate");
                String birthCity = playerJSON.getString("BirthCity");
                String birthCountry = playerJSON.getString("BirthCountry");
                String twitter = playerJSON.getString("Twitter");
                String playerImage = playerJSON.getString("officialImageSrc");
                Player player = new Player(firstName,lastName,jerseyNumber,position,age,birthDay,birthCity,birthCountry,twitter,playerImage);
                listOfPlayers.add(player);
                Log.d("Array", listOfPlayers.toString());
            }
        } catch (IOException e){
            e.printStackTrace();
        } catch (JSONException e){
            e.printStackTrace();
        }
        return listOfPlayers;
    }
}
