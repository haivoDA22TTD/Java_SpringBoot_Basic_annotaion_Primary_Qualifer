package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component // Đánh dấu class là 1 Beans
@Primary // Đánh dấu đây là Beans ưu tiên
public class SportCar extends Car  {
    @Override // Class này ghi đè thuộc tính của Class Car
        public String getCarType(){
            return "Super Car";
        }
}
