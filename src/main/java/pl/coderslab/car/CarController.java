package pl.coderslab.car;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.stream.Collector;
import java.util.stream.Collectors;

@Controller
public class CarController {

    private final CarDao carDao;

    public CarController(CarDao carDao) {
        this.carDao = carDao;
    }

    @RequestMapping(value = "/car-home" , method = RequestMethod.GET)
    @ResponseBody
    public String homeAction(){
        return carDao.getCars().stream()
                .map(c -> c.getBrand())
                .collect(Collectors.joining("-"));
    }



}
