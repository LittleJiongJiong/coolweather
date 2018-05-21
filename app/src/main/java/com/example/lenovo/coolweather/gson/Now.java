package com.example.lenovo.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 实况天气
 * Created by Lenovo on 2018-5-21 021.
 */

public class Now {
    /**
     * 当前温度(摄氏度)
     */
    @SerializedName("tmp")
    public String temperature;

    /**
     *天气状况
     */
    @SerializedName("cond")
    public More more;

    private class More {
        /**
         * 天气描述
         */
        @SerializedName("txt")
        public String info;
    }
}
