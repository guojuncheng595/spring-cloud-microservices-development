package cn.gjc.weather.gjcweatherbase.Service;

import cn.gjc.weather.gjcweatherbase.vo.City;
import cn.gjc.weather.gjcweatherbase.vo.WeatherResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @Author: GuoJunCheng
 * @Description: Data Client
 * @Date: 14:13 2018/8/11
 */
@FeignClient("gjc-weather-eureka-client-zuul")
public interface DataClient {

    /**
     * 获取城市列表
     *
     * @return
     * @throws Exception
     */
    @GetMapping("cities")
    List<City> listCity() throws Exception;

    /**
     * 根据城市id查询天气数据
     * @param cityId
     * @return
     */
    @GetMapping("/data/weather/cityId/{cityId}")
    WeatherResponse getDataByCityId(@PathVariable("cityId") String cityId);
}
