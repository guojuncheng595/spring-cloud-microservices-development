package cn.gjc.weather.gjcweatherbase.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("blog")
public class MyBlogHomePageController {
    private final static Logger logger = LoggerFactory.getLogger(MyBlogHomePageController.class);

    @GetMapping("/home/page")
    public ModelAndView getHomePage(Model model) throws Exception {
        return new ModelAndView("myblog/index", "", model);
    }

}
