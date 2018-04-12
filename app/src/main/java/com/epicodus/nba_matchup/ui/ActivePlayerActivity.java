package com.epicodus.nba_matchup.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.epicodus.nba_matchup.adapters.PlayerListAdapter;
import com.epicodus.nba_matchup.models.Player;
import com.epicodus.nba_matchup.R;
import com.epicodus.nba_matchup.services.SportsFeedsService;

import java.io.IOException;
import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

public class ActivePlayerActivity extends AppCompatActivity {
    public ArrayList<Player> mPlayers = new ArrayList<>();
    private PlayerListAdapter mAdapter;

    @BindView(R.id.recyclerView) RecyclerView mRecyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_active_player);
        ButterKnife.bind(this);

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
                        mAdapter = new PlayerListAdapter(getApplicationContext(), mPlayers);
                        mRecyclerView.setAdapter(mAdapter);
                        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(ActivePlayerActivity.this);
                        mRecyclerView.setLayoutManager(layoutManager);
                        mRecyclerView.setHasFixedSize(true);

                    }
                });

            }
        });
    }
}
