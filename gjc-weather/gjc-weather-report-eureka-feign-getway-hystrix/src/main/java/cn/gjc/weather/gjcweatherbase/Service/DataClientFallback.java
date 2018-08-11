package cn.gjc.weather.gjcweatherbase.Service;

import cn.gjc.weather.gjcweatherbase.vo.City;
import cn.gjc.weather.gjcweatherbase.vo.WeatherResponse;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 *@Author: GuoJunCheng
 *@Description: Data Client Fallback
 *@Date: 21:43 2018/8/11
 */
@Component
public class DataClientFallback implements DataClient{
    @Override
    public List<City> listCity() throws Exception {
        List<City> cityList = null;
        cityList = new ArrayList<>();
        City city = new City();
        city.setCityId("101280601");
        city.setCityName("深圳");
        cityList.add(city);

        city = new City();
        city.setCityId("101280301");
        city.setCityName("惠州");
        cityList.add(city);

        return null;
    }

    @Override
    public WeatherResponse getDataByCityId(String cityId) {
        return null;
    }
}
