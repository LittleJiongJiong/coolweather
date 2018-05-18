package com.example.lenovo.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * 和风天气省份
 * Created by Lenovo on 2018-5-18 018.
 */

public class Province extends DataSupport {
    private int id;
    /**
     * 省份名称
     */
    private String provinceName;
    /**
     * 省份代码
     */
    private int provinceCode;

    public int getId() {
        return id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

}
