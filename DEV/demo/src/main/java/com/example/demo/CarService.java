package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CarService {
    private Car car;
    @Autowired // Tiêm thuộc tính của class khác vào
        // Dùng Qualifer để chỉ định Beans "LuxuryCar" có nhiều Beans Car
            public CarService(@Qualifier("LuxuryCar")Car car){
                this.car = car;
            }
                public void printCarType(){
                    System.out.println(car.getCarType());
                }
}
