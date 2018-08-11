package cn.gjc.weather.gjcweatherbase.controller;

import cn.gjc.weather.gjcweatherbase.Service.CityDataService;
import cn.gjc.weather.gjcweatherbase.vo.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/***
 *@ClassName CityController
 *@Description 获取城市列表
 *@Auther gjc
 *@Date 2018/8/9 18:19
 *
 **/

@RestController
@RequestMapping("/cities")
public class CityController {

    @Autowired
    private CityDataService cityDataService;

    @GetMapping
    public List<City> listCity() throws Exception {
        return cityDataService.listCity();
    }
}
