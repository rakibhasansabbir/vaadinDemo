package bd.ac.seu.my.vaddindemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MovieController {

    @RequestMapping(value = "/controller")
    public String home(){
        return "index";
    }
}
