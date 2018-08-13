package cn.gjc.weather.gjcweatherbase.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.TimeUnit;

/***
 *@ClassName WeatherDataCollectionServiceImpl
 *@Description Weather Data Collection Service impl
 *@Auther gjc
 *@Date 2018/8/9 13:03
 *
 **/
@Service
public class WeatherDataCollectionServiceImpl implements WeatherDataCollectionService {

    private final static Logger logger = LoggerFactory.getLogger(WeatherDataCollectionServiceImpl.class);
    private static final String WEATHER_URL = "http://wthrcdn.etouch.cn/weather_mini?";
    private static final long TIME_OUT = 1800L; //1800s


    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Override
    public void sysncDataByCityId(String cityId) {
        String uri = WEATHER_URL + "citykey=" + cityId;
        this.saveWeatherData(uri);
    }

    /**
     * @Author: GuoJunCheng
     * @Description: 把天气数据放到缓存中
     * @Date: 17:22 2018/8/5
     */
    private void saveWeatherData(String uri) {

        String key = uri;
        ObjectMapper mapper = new ObjectMapper();
        String body = null;
        ValueOperations<String, String> ops = stringRedisTemplate.opsForValue();
        ResponseEntity<String> respString = restTemplate.getForEntity(uri, String.class);
        if (respString.getStatusCodeValue() == 200) {
            body = respString.getBody();
        }
        //数据写入缓存中
        ops.set(key, body, TIME_OUT, TimeUnit.SECONDS);
    }
}
