package com.example.lenovo.coolweather.gson;

/**
 * AQI:空气质量指数
 * Created by Lenovo on 2018-5-21 021.
 */
public class AQI {

    public AQICity city;

    public class AQICity {

        public String aqi;

        /**
         *PM2.5 1小时平均值(ug/m³)
         */
        public String pm25;
    }
}
