import com.epicodus.nba_matchup.Constants;

import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;

/**
 * Created by Edgar on 4/11/2018.
 */

public class SportsFeedsService {

    public static void activePlayers(Callback callback){
        OkHttpClient client = new OkHttpClient.Builder().build();
        HttpUrl.Builder urlBuilder = HttpUrl.parse(Constants.CURRENT_ACTIVE_PLAYER_URL).newBuilder();
        String url = urlBuilder.build().toString();
    }
}
