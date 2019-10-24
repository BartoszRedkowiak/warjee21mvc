package pl.coderslab.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/first")
public class FormController {

    @GetMapping(path = "/form")
    public String showForm(){
        return "form";
    }

    @PostMapping(path = "/form")
    @ResponseBody
    public String performForm(@RequestParam String paramName){
        return  "paramName: " + paramName;
    }

}
