package android.xurq.com.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by xu on 2018/1/28.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
