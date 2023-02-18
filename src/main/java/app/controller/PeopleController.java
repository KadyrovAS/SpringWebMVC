package app.controller;

import app.services.PeopleService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class PeopleController {
    private Map<String, PeopleService.People> store = new HashMap<>();
    private int count = 2;
    {
        store.put("1", new PeopleService.People("Andrey", 52));
        store.put("2", new PeopleService.People("Sergey", 54));
    }
//    @RequestMapping(value = "/getPeople/", method = RequestMethod.GET)
    @GetMapping(value = "/getPeople/{id}")
    public String getIndexPage(Model model, @PathVariable("id") String id){
        String people = store.get(id).getName();
        model.addAttribute("name", people);
        return "index";
    }

    @GetMapping(value = "/getPeopleBy")
    public String getPeopleBy(Model model, @RequestParam("id") String id){
        String people = store.get(id).getName();
        model.addAttribute("name", people);
        return "index";
    }
}
