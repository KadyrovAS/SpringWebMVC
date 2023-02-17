package app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class App {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String getIndexPage(Model model){
        model.addAttribute("message", "Hello, my friends!");
        return "index";
    }
}
