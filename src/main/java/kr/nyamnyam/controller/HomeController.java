package kr.nyamnyam.controller;

import ch.qos.logback.core.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("")
public class HomeController {

    @GetMapping("/")
    public String Home(Model model) {
        model.addText("message");
        return "index";
    }
}
