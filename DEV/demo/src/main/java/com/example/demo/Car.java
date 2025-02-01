package com.example.demo;

import org.springframework.stereotype.Component;

@Component // Đánh dấu class là 1 Beans
public class Car {
    // Khai báo phương thức Getter
        public  String getCarType(){
            return "Cyber Car";
        }
}
