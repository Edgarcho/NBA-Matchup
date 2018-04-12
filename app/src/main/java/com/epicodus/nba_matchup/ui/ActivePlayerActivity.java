package com.epicodus.nba_matchup.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.epicodus.nba_matchup.models.Player;
import com.epicodus.nba_matchup.R;
import com.epicodus.nba_matchup.services.SportsFeedsService;

import java.io.IOException;
import java.util.ArrayList;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

public class ActivePlayerActivity extends AppCompatActivity {
    public ArrayList<Player> mPlayers = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_active_player);
        Intent intent = getIntent();
        String name = intent.getStringExtra("player");
        getPlayers(name);
    }
    public void getPlayers(String name){
        final SportsFeedsService sportsFeedsService = new SportsFeedsService();
        sportsFeedsService.findPlayer(name, new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                e.printStackTrace();
            }

            @Override
            public void onResponse(Call call, Response response) {
                mPlayers = sportsFeedsService.processFindPlayerResults(response);
                ActivePlayerActivity.this.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {

                    }
                });

            }
        });
    }
}
