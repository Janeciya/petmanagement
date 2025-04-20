package org.example.petmanagement.controller;

import org.example.petmanagement.dto.PetDto;
import org.example.petmanagement.dto.ResponseMessage;
import org.example.petmanagement.repository.PetRepository;
import org.example.petmanagement.entity.Pet;
import org.example.petmanagement.service.IPetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController             //controller方法回傳值 轉為JSON格式
@RequestMapping ("/pet")    //URL: localhost:8080/pet/*
public class PetController {

    @Autowired            //注入bean
    IPetService petService;

    //RESTful API
    //新增
    @PostMapping         // method: post URL: localhost:8080/pet
    public ResponseMessage<Pet> add(@RequestBody PetDto pet){
        Pet petNew = petService.add(pet);
        return ResponseMessage.success(petNew);
    }


    @GetMapping("/name")
    public String getName(){
        System.out.println("Hi!");
        return "Hello World";
    }

    //查詢
    //@GetMapping

    //修改
    //@PutMapping

    //刪除

}
