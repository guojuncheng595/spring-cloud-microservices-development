package cn.gjc.weather.gjcweatherbase.controller;

import cn.gjc.weather.gjcweatherbase.Service.DataClient;
import cn.gjc.weather.gjcweatherbase.Service.WeatherReportService;
import cn.gjc.weather.gjcweatherbase.vo.City;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @Author: GuoJunCheng
 * @Description: Weather Repost Controller
 * @Date: 21:37 2018/8/7
 */
@Controller
@RequestMapping("/report")
public class WeatherRepostController {

    private final static Logger logger = LoggerFactory.getLogger(WeatherRepostController.class);

    @Autowired
    private WeatherReportService weatherReportService;

    @Autowired
    private DataClient dataClient;

    @GetMapping("/cityId/{cityId}")
//    @HystrixCommand(fallbackMethod = "defaultCities")
    public ModelAndView getReportByCityId(@PathVariable("cityId") String cityId, Model model) throws Exception {
        //由城市数据api微服务来提供数据
        List<City> cityList = null;

        try {
            cityList = dataClient.listCity();
        } catch (Exception e) {
            logger.info("城市列表异常！");
        }
        model.addAttribute("title", "老郭的天气！");
        model.addAttribute("cityId", cityId);
        model.addAttribute("cityList", cityList);
        model.addAttribute("report", weatherReportService.getDataByCityId(cityId));
        return new ModelAndView("weather/report", "reportModel", model);
    }

    /**
     * 服务过载，返回提示
     * @return
     */
    public String defaultCities(){
        return "City Data Server is down!";
    }
}
