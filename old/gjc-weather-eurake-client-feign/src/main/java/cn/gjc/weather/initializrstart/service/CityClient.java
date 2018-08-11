package cn.gjc.weather.initializrstart.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/***
 *@ClassName CityClient
 *@Description City Client
 *@Auther gjc
 *@Date 2018/8/10 17:07
 *
 **/

@FeignClient("gjc-weather-city-eureka")
public interface CityClient {

    @GetMapping("cities")
    String listCity();
}
