package com.epicodus.nba_matchup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import butterknife.BindView;

public class ActivePlayerActivity extends AppCompatActivity {

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
        sportsFeedsService.findActivePlayer;
    }
}
