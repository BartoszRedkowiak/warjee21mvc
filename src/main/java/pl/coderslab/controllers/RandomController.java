package pl.coderslab.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

@Controller
public class RandomController {

    @GetMapping(value = "/random", produces = "text/html; charset=UTF-8")
    @ResponseBody
    public String showRandom(){
        Random random = new Random();
        Integer randomNumber = random.nextInt(101);
        return "Wylosowano liczbę: " + randomNumber;
    }

}
