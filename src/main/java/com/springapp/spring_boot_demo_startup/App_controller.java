package com.springapp.spring_boot_demo_startup;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class App_controller {

    private List<App_Modal> obj = new ArrayList<>();

    @GetMapping("/userdetaiils")
    public List<App_Modal> Login() {
       for(App_Modal a : obj)
       {

       }
       return obj;
    }

    public App_controller(){
        obj.add(new App_Modal(1,"RAnjith","ECE"));
        obj.add(new App_Modal(2,"Barath","ECE"));
    }

    @PostMapping("/insert")
    public void Inserted() {

         obj.add(new App_Modal(1,"ranjith","ECE"));
    }
}



