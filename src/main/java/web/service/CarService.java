package web.service;

import web.models.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService implements Service {

    List<Car> listCars = new ArrayList<>();
    @Override
    public List<Car> listCars() {
        listCars.add(new Car("VAZ", 2107, "white"));
        listCars.add(new Car("GAZ", 3110, "black"));
        listCars.add(new Car("CITROEN", 4, "green"));
        listCars.add(new Car("AUDI", 80, "red"));
        listCars.add(new Car("MAZDA", 6, "blue"));
        return listCars;
    }
    public ArrayList<Car> listCountCars(Integer count) {
        if (count < 5 & count != null) {
            return new ArrayList<>(listCars().subList(0, count));
        } else {
            return new ArrayList<>(listCars());
        }
    }
}
