package com.example.CarService.Controller;

import com.example.CarService.domain.Car;
import com.example.CarService.service.Registration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class RegisterController {

    /**
     * 1. Modify the below function.
     * 2. getRegistrationPage method accepts Model as argument.
     **/


    @Autowired
    private Registration registration;

    @RequestMapping("/register")

    // 🔴🟢🔴 why model -> will use the model to send the Car object to your JSP.
    public String getRegistrationPage(Model model) {
        model.addAttribute("car", registration.getNewCar());
        return "carregister";
    }


    /*
     1. getResponsePage method uses registerCar() method to register the car submitted from carregsiter.jsp.
     2. It should return "success" if registerCar() return true else it should return "carregister".
     3. getResponsePage method uses @ModelAttribute annotation to bind data with reference to car domain.
    */

    // JSP to Controller
    @RequestMapping("/done")
    public String getResponsePage(@ModelAttribute("car") Car car) {
        //Write your logic here
        if (car.getRegisterationNumber() == null
                && car.getCarName() == null
                && car.getCarDetails() == null
                && car.getCarWork() == null) {
            return "carregister";
        }
        Boolean result = registration.registerCar(
                car.getRegisterationNumber(),
                car.getCarName(),
                car.getCarDetails(),
                car.getCarWork()
        );

        if (result) {
            return "success";
        } else {
            return "carregister";
        }

    }
}
