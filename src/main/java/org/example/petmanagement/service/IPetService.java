package org.example.petmanagement.service;

import org.example.petmanagement.dto.PetDto;
import org.example.petmanagement.entity.Pet;

public interface IPetService {

    //新增寵物 @pet 寵物參數
    Pet add(PetDto pet);
    //查詢寵物 @petID 寵物id
    Pet getPet(int petID);
}
