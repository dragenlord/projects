package com.example.projec.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.projec.repositoriy.Food;

import java.util.List;

@RestController
public class FoodControler {

    @GetMapping
    public List<Food> Food(){
        return List.of(

                new Food(0,"Chiсken and potato"),
                new Food(1,"sandwich"),
                new Food(2,"cola"),
                new Food(3,"cola zero"),
                new Food(4,"bef"),
                new Food(5,"pasta"),
                new Food(6,"ise"),
                new Food(7,"Chiсken and potato"),
                new Food(8,"Chiсken and potato")
                );





    }

}
