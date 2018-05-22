package com.example.lenovo.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Lenovo on 2018-5-21 021.
 */

public class Weather {
    /**
     * 请求天气数据返回状态
     */
    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    /**
     * 封装未来若干天的天气预报
     */
    @SerializedName("daily_forecast")
    public List<ForeCast> foreCastList;
}
