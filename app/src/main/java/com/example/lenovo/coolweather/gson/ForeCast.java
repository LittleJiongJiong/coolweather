package com.example.lenovo.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 天气预报
 * Created by Lenovo on 2018-5-21 021.
 */

public class ForeCast {

    public String date;

    /**
     * 温度
     */
    @SerializedName("tmp")
    public Temperature temperature;

    /**
     * 天气状况
     */
    @SerializedName("cond")
    public More more;

    public class Temperature {

        /**
         *  最高温度(摄氏度)
         */
        public String max;

        /**
         *  最低温度(摄氏度)
         */
        public String min;
    }

    public class More {
        /**
         * 白天天气描述
         */
        @SerializedName("txt_d")
        public String info;
    }
}
