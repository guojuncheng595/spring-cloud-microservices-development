package cn.gjc.weather.gjcweatherbase.Service;

import cn.gjc.weather.gjcweatherbase.vo.Forecast;
import cn.gjc.weather.gjcweatherbase.vo.Weather;
import cn.gjc.weather.gjcweatherbase.vo.WeatherResponse;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 *@Author: GuoJunCheng
 *@Description: Weather Report ServiceImpl
 *@Date: 21:34 2018/8/7
 */
@Service
public class WeatherReportServiceImpl implements WeatherReportService{
//
//    @Autowired
//    private WeatherDataService weatherDataService;


    @Override
    public Weather getDataByCityId(String cityId) {

        //TODO 改为由天气数据api微服务提供
        Weather weather = new Weather();
        weather.setAqi("81");
        weather.setGanmao("容易感冒");
        weather.setWendu("22");
        List<Forecast> forecastsList = new ArrayList<>();

        Forecast forecast = new Forecast();
        forecast.setDate("25日");
        forecast.setFengli("23");
        forecast.setFengxiang("小风");
        forecast.setType("晴");
        forecast.setHigh("gw400");
        forecast.setLow("dw-100");
        forecastsList.add(forecast);

        Forecast forecast0 = new Forecast();
        forecast0.setDate("26日");
        forecast0.setFengli("23");
        forecast0.setFengxiang("小风");
        forecast0.setType("晴");
        forecast0.setHigh("gw400");
        forecast0.setLow("dw-100");
        forecastsList.add(forecast0);


        Forecast forecast1 = new Forecast();
        forecast1.setDate("27日");
        forecast1.setFengli("23");
        forecast1.setFengxiang("小风");
        forecast1.setType("晴");
        forecast1.setHigh("gw400");
        forecast1.setLow("dw-100");
        forecastsList.add(forecast1);


        Forecast forecast2 = new Forecast();
        forecast2.setDate("28日");
        forecast2.setFengli("23");
        forecast2.setFengxiang("小风");
        forecast2.setType("晴");
        forecast2.setHigh("gw400");
        forecast2.setLow("dw-100");
        forecastsList.add(forecast2);

        Forecast forecast3 = new Forecast();
        forecast3.setDate("29日");
        forecast3.setFengli("23");
        forecast3.setFengxiang("小风");
        forecast3.setType("晴");
        forecast3.setHigh("gw400");
        forecast3.setLow("dw-100");
        forecastsList.add(forecast3);

        weather.setForecast(forecastsList);

//        WeatherResponse resp = weatherDataService.getDataByCityId(cityId);
        return weather;
    }
}
