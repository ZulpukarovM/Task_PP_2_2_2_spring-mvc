package web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
@RequiredArgsConstructor
public class CarsController {

    private final CarService carService;


    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(defaultValue = "10000") int count, ModelMap model) {

        model.addAttribute("cars", carService.getCars(count));
        return "cars";
    }
}
