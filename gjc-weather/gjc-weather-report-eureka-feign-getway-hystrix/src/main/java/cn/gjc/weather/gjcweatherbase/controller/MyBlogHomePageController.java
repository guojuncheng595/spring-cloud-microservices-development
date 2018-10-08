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

    @GetMapping("/my/picture")
    public ModelAndView getMyPicture(Model model) throws Exception{
        return new ModelAndView("myblog/infopic","", model);
    }

    @GetMapping("/blog/articles")
    public ModelAndView getBlogArticles(Model model) throws Exception{
        return new ModelAndView("myblog/infopic","", model);
    }
    @GetMapping("/my/tools")
    public ModelAndView getTools(Model model) throws Exception{
        return new ModelAndView("myblog/", "", model);
    }

    @GetMapping("/my/travel")
    public ModelAndView getTravel(Model model) throws Exception{
        return new ModelAndView("myblog/", "", model);
    }


    @GetMapping("/leave/message")
    public ModelAndView getLeaveMessage(Model model) throws Exception{
        return new ModelAndView("myblog/", "", model);
    }


    @GetMapping("/about/me")
    public ModelAndView getAboutMe(Model model) throws Exception{
        return new ModelAndView("myblog/", "", model);
    }


}
