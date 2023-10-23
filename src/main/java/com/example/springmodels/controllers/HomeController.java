package com.example.springmodels.controllers;

import com.example.springmodels.models.OrderList;
import com.example.springmodels.repos.OrderListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.net.http.HttpRequest;

@Controller
public class HomeController {

    @GetMapping("/")
    String index(){
        return "index";
    }
}
