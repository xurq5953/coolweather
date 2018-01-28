package android.xurq.com.coolweather.db;

import org.json.JSONObject;
import org.litepal.crud.DataSupport;

/**
 * Created by xu on 2018/1/25.
 */

public class Province extends DataSupport {
    private int id;
    private String proviceName;
    private int privinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProviceName() {
        return proviceName;
    }

    public void setProviceName(String proviceName) {
        this.proviceName = proviceName;
    }

    public int getPrivinceCode() {
        return privinceCode;
    }

    public void setPrivinceCode(int privinceCode) {
        this.privinceCode = privinceCode;
    }
}
