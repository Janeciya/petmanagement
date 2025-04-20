package org.example.petmanagement.service;

import org.example.petmanagement.dto.PetDto;
import org.example.petmanagement.entity.Pet;

public interface IPetService {

    //新增寵物 @pet參數
    Pet add(PetDto pet);
}
