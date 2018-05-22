package com.example.lenovo.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 城市基本信息
 * Created by Lenovo on 2018-5-21 021.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    /**
     * 表示城市对应的天气id
     */
    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        /**
         * 表示天气更新时间
         */
        @SerializedName("loc")
        public String updateTime;
    }
}
