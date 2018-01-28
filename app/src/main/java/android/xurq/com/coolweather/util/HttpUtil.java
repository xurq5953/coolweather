package android.xurq.com.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Request.Builder;

/**
 * Created by xu on 2018/1/25.
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);

    }
}
