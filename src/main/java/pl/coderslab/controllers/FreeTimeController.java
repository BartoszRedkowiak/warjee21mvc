package pl.coderslab.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

@Controller
public class FreeTimeController {

    @GetMapping(value = "/date", produces = "text/html; charset=UTF-8")
    @ResponseBody
    public String status(){
        LocalDateTime now = LocalDateTime.now();
        DayOfWeek weekDay = now.getDayOfWeek();
        int hour = now.getHour();

        //dokończyć


        return String.valueOf(weekDay.getValue()) ;
    }
}
