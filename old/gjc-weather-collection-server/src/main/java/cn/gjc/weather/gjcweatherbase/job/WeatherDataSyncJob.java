package cn.gjc.weather.gjcweatherbase.job;

import cn.gjc.weather.gjcweatherbase.Service.WeatherDataCollectionService;
import cn.gjc.weather.gjcweatherbase.vo.City;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: GuoJunCheng
 * @Description: Weather Data Sync Job
 * @Date: 16:35 2018/8/5
 */
public class WeatherDataSyncJob extends QuartzJobBean {
    private final static Logger logger = LoggerFactory.getLogger(WeatherDataCollectionService.class);

    @Autowired
    private WeatherDataCollectionService weatherDataCollectionService;


    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        logger.info("Weather Data Sync Job Start");
        //获取城市列表

        //TODO 改为由城市数据API微服务来提供数据
        List<City> cityList = null;
        try {

            //TODO 改为由城市数据API微服务来提供数据
            cityList = new ArrayList<>();
            City city = new City();
            city.setCityId("101280601");
            cityList.add(city);
        } catch (Exception e) {
            logger.info("Exception!", e);
        }
        // 遍历城市id获取天气
        for (City city : cityList) {
            String cityId = city.getCityId();
            logger.info("Weather Data Sync job ,cityId: " + cityId);
            weatherDataCollectionService.sysncDataByCityId(cityId);
        }

        logger.info("Weather Data Sync job End");


    }
}
