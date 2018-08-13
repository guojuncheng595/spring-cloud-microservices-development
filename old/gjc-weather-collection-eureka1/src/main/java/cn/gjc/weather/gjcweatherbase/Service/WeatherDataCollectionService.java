package cn.gjc.weather.gjcweatherbase.Service;

/**
 * Weather Data Collection Service
 */
public interface WeatherDataCollectionService {
    /**
     * 根据城市ID同步天气
     * @param cityId
     */
    void sysncDataByCityId(String cityId);
}
