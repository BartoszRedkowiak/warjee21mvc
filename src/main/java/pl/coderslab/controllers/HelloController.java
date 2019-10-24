package pl.coderslab.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;
import java.util.Random;

@Controller
public class HelloController {

    @GetMapping("/hello")
    @ResponseBody
    public String HelloWorld(){
        return  "Hello world";
    }

    //Zadanie 1 i 2 (Przekazywanie parametru)
    @GetMapping(path = "/random/{min}/{max}", produces = "text/html; charset=UTF-8" )
    @ResponseBody
    public String random(@PathVariable int max,
                         @PathVariable int min){
        Random random = new Random();
        int i = random.nextInt(max - min) + min + 1;

        return "Użytkownik podał wartości " + min + " i " + max + ". Wolosowano liczbę: " + i;
    }
    //Zadanie 3
    @GetMapping(path = "/hello/{firstName}/{lastName}", produces = "text/html; charset=UTF-8" )
    @ResponseBody
    public String helloUser(@PathVariable String firstName,
                            @PathVariable String lastName){
        return "Witaj " + firstName + " " + lastName;
    }


    //Zadanie 1 i 2 (widoki)
    @RequestMapping("/helloView")
    public String home(Model model){
        int hour = LocalDateTime.now().getHour();
        String backgroundColor = "white";
        String color = "black";

        if ( hour > 8  && hour < 20){
            backgroundColor = "black";
            color = "white";
        }
        model.addAttribute("backgroundColor", backgroundColor);
        model.addAttribute("color", color);

        return "home";
    }

}
