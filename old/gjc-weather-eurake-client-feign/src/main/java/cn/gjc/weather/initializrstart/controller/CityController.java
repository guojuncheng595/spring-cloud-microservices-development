package cn.gjc.weather.initializrstart.controller;

import cn.gjc.weather.initializrstart.service.CityClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: GuoJunCheng
 * @Description: City Controller
 * @Date: 12:59 2018/8/11
 */
@RestController
public class CityController {

    @Autowired
    private CityClient cityClient;

    @GetMapping("/cities")
    public String listCity(){
        //通过Feign客户端来查找
        String body = cityClient.listCity();
        return body;
    }
}
