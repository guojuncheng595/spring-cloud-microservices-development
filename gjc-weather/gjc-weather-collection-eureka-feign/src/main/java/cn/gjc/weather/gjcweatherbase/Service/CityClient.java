package cn.gjc.weather.gjcweatherbase.Service;

import cn.gjc.weather.gjcweatherbase.vo.City;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @Author: GuoJunCheng
 * @Description: City Client
 * @Date: 14:13 2018/8/11
 */
@FeignClient("gjc-weather-city-eureka")
public interface CityClient {

    @GetMapping("cities")
    List<City> listCity() throws Exception;
}
