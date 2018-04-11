package com.epicodus.nba_matchup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    @BindView(R.id.playerName) EditText mPlayerName;
    @BindView(R.id.findPlayers) Button mFindPlayers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mFindPlayers.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String playerName = mPlayerName.getText().toString();
        Intent intent = new Intent(MainActivity.this, ActivePlayer.class);
        intent.putExtra("player", playerName);
        StartActivity(intent);
    }
}
