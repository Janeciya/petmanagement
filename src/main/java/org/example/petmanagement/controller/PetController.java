package org.example.petmanagement.controller;

import org.example.petmanagement.dto.PetDto;
import org.example.petmanagement.dto.PetUpdateDto;
import org.example.petmanagement.dto.ResponseMessage;
import org.example.petmanagement.repository.PetRepository;
import org.example.petmanagement.entity.Pet;
import org.example.petmanagement.service.IPetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
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
    public ResponseMessage<Pet> addPet(@Validated @RequestBody PetDto pet){ //@Validated要驗證的參數 @RequestBody 接RequestBody裡的資料
        Pet petNew = petService.add(pet);
        return ResponseMessage.success(petNew);
    }

    //查詢
    @GetMapping("/{petId}") // method: get URL: localhost:8080/pet/{id}
    public ResponseMessage<Pet> getPet(@PathVariable int petId){ //接 url 的變數 / @PathVariable: RESTful 查詢 / @RequestParam :查詢條件
        Pet petGet = petService.get(petId);
        return ResponseMessage.success(petGet);
    }

    //修改
    @PutMapping         // method: put URL: localhost:8080/pet
    public ResponseMessage<Pet> updatePet(@Validated @RequestBody PetUpdateDto pet){
        Pet petNew = petService.update(pet);
        return ResponseMessage.success(petNew);
    }

    //刪除
    @DeleteMapping("/{petId}") // method: delete URL: localhost:8080/pet/{id}
    public ResponseMessage<Pet> deletePet(@PathVariable int petId){
        petService.delete(petId);
        return ResponseMessage.success();
    }
}
