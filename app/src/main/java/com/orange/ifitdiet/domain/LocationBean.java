package com.orange.ifitdiet.domain;

import com.orange.ifitdiet.common.Bean;

import java.io.Serializable;

/**
 * Created by 廖俊瑶 on 2016/9/8.
 */
public class LocationBean extends Bean implements Serializable{

    private String province;//省
    private String city;//市
    private String district;//区
    private String street;//街道

    public LocationBean() {
    }

    public LocationBean(String province, String city, String district, String street) {
        this.province = province;
        this.city = city;
        this.district = district;
        this.street = street;
    }

    public String getProvince() {
        return province;
    }

    public String getCity() {
        return city;
    }

    public String getDistrict() {
        return district;
    }

    public String getStreet() {
        return street;
    }

}
