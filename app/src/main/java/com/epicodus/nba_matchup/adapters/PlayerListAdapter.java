package com.epicodus.nba_matchup.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.epicodus.nba_matchup.R;
import com.epicodus.nba_matchup.models.Player;

import java.util.ArrayList;

import javax.xml.transform.Templates;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Edgar on 4/12/2018.
 */

public class PlayerListAdapter extends RecyclerView.Adapter<PlayerListAdapter.PlayerViewHolder> {
    private ArrayList<Player> mPlayers = new ArrayList<>();
    private Context mContext;

    public PlayerListAdapter(Context context, ArrayList<Player> players){
        mContext = context;
        mPlayers = players;
    }

    @Override
    public PlayerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.player_list_item, parent, false);
        PlayerViewHolder viewHolder = new PlayerViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(PlayerViewHolder holder, int position) {
        holder.bindPlayer(mPlayers.get(position));

    }

    @Override
    public int getItemCount() {
        return mPlayers.size();
    }

    public class PlayerViewHolder extends RecyclerView.ViewHolder{
        @BindView(R.id.playerFirstName)TextView mPlayerFirstName;
        @BindView(R.id.playerPosition) TextView mPlayerPosition;
        private Context mContext;

        public PlayerViewHolder(View itemView){
            super(itemView);
            ButterKnife.bind(this, itemView);
            mContext = itemView.getContext();
        }

        public void bindPlayer(Player player){
            mPlayerFirstName.setText(player.getFirstName());
            mPlayerPosition.setText(player.getPosition());
        }
    }
}
