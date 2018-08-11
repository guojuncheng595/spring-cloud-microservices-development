package cn.gjc.weather.gjcweatherbase.vo;

import lombok.Data;

import javax.xml.bind.annotation.*;

/**
 *@Author: GuoJunCheng
 *@Description: City
 *@Date: 16:52 2018/8/5
 */
@Data
public class City {

    private String cityId;

    private String cityName;

    private String cityCode;

    private String province;
}
