package io.cloudtype.Demo.Main;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
@AllArgsConstructor
public class MainController {
    @GetMapping("/home")
    @ResponseStatus(HttpStatus.OK)
    public String getHome(Model model) {
        return "/mainPage";
    }
    @GetMapping("/profile")
    @ResponseStatus(HttpStatus.OK)
    public String getProfile(Model model) {
        return "/profilePage";
    }
    @GetMapping("/menu")
    @ResponseStatus(HttpStatus.OK)
    public String getMenu(Model model) {
        return "/menuPage";
    }
    @GetMapping("/roulette")
    @ResponseStatus(HttpStatus.OK)
    public String getRoulette(Model model) {
        return "/roulettePage";
    }


}
