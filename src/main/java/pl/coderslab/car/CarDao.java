package pl.coderslab.car;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDao {

    public List<Car> getCars(){
        List<Car> cars = new ArrayList<>();
        cars.add(new Car((long) 1, 200, "Passat"));
        cars.add(new Car((long) 2, 300, "Passat1"));
        cars.add(new Car((long) 3, 400, "Passat2"));
        cars.add(new Car((long) 4, 500, "Passat3"));
        cars.add(new Car((long) 5, 700, "Passat4"));
        return cars;
    }
}
