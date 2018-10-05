package cn.gjc.weather.gjcweatherbase.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/company")
public class CompanyHomePageController {

    private final static Logger logger = LoggerFactory.getLogger(CompanyHomePageController.class);

    @GetMapping("/home/page")
    public ModelAndView getHomePage(Model model) throws Exception{

        return new ModelAndView("company/index", "", model);
    }

}
