package com.example.lenovo.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 *  生活指数
 * Created by Lenovo on 2018-5-21 021.
 */

public class Suggestion {

    /**
     * 舒适度
     */
    @SerializedName("comf")
    public Comfort comfort;

    /**
     *  洗车指数
     */
    @SerializedName("cw")
    public CarWash carWash;

    /**
     * 运动指数
     */
    public Sport sport;

    public class Comfort {
        @SerializedName("txt")
        public String info;
    }

    public class CarWash {
        @SerializedName("txt")
        public String info;
    }

    public class Sport {
        /**
         * 详情
         */
        @SerializedName("txt")
        public String info;
    }
}
