package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final List<Car> cars = List.of(new Car("Lada", "white", 2000),
            new Car("Priora", "neon violet", 2000),
            new Car("Matiz", "pink", 1000),
            new Car("R8", "carbon black", 1500),
            new Car("Camry", "white", 2500));


//    @Override
//    public List<Car> getCars(Integer count) {
//        List<Car> carsCount = new ArrayList<>();
//        if (count != null) {
//            for (int i = 0; i < count && i < cars.size(); i++) {
//                carsCount.add(cars.get(i));
//            }
//            return carsCount;
//        } else {
//            return cars;
//        }
//    }

    @Override
    public List<Car> getCars(Integer count) {
        try {
            return cars.stream().limit(count).toList();
        } catch (IllegalArgumentException e) {
            return new ArrayList<>();
        }

    }
}

