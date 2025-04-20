package org.example.petmanagement.service;

import org.example.petmanagement.dto.PetDto;
import org.example.petmanagement.dto.PetUpdateDto;
import org.example.petmanagement.entity.Pet;

public interface IPetService {

    //新增寵物 @pet 寵物參數
    Pet add(PetDto pet);
    //查詢寵物 @petID 寵物id
    Pet get(int petID);
    //修改寵物 @@pet 修改寵物參數
    Pet update(PetUpdateDto pet);
}
