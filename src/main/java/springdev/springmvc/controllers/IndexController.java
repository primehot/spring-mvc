package springdev.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by oleht on 20.12.2017
 */
@Controller
public class IndexController {

    @RequestMapping({"","/","/index"})
    public String getIndexPage() {

        return "index";
    }
}
