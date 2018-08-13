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

    @Autowired
    private DataClient dataClient;


    @Override
    public Weather getDataByCityId(String cityId) {
        //由天气数据api微服务提供
        WeatherResponse resp = dataClient.getDataByCityId(cityId);
        return resp.getData();
    }
}
