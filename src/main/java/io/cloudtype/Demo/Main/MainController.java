package io.cloudtype.Demo.Main;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

@Controller
@AllArgsConstructor
public class MainController {
    @GetMapping("/home")
    @ResponseStatus(HttpStatus.OK)
    public ModelAndView getHome(Model model) {
        ModelAndView mav = new ModelAndView("mainPage");
        return mav;
    }
    @GetMapping("/profile")
    @ResponseStatus(HttpStatus.OK)
    public ModelAndView getProfile(Model model) {
        return new ModelAndView("profilePage");
    }
    @GetMapping("/menu")
    @ResponseStatus(HttpStatus.OK)
    public ModelAndView getMenu(Model model) {
        return new ModelAndView("menuPage");
    }
    @GetMapping("/roulette")
    @ResponseStatus(HttpStatus.OK)
    public ModelAndView getRoulette(Model model) {
        return new ModelAndView("roulettePage");
    }


}
