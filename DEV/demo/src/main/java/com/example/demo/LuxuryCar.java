package com.example.demo;

import org.springframework.stereotype.Component;

@Component("LuxuryCar") // Đặt tên cho Beans là LurxuryCar
public class LuxuryCar extends Car{
    @Override // Ghi đè thuộc tính của class Car
    public String getCarType(){
        return "Luxury Car";
    }

}
