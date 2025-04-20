package org.example.petmanagement.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class PetUpdateDto {

    @NotNull(message = "寵物id不可為空") //id不能為null
    @Min(1)
    private int petId;
    private String petName;             //寵物名字
    private String petType;             //寵物品種
    private double petAge;              //寵物年齡
    private double petWeight;

    public int getPetId() {
        return petId;
    }

    public void setPetId(int petId) {
        this.petId = petId;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }

    public double getPetAge() {
        return petAge;
    }

    public void setPetAge(double petAge) {
        this.petAge = petAge;
    }

    public double getPetWeight() {
        return petWeight;
    }

    public void setPetWeight(double petWeight) {
        this.petWeight = petWeight;
    }

    @Override
    public String toString() {
        return "PetDto{" +
                "petName='" + petName + '\'' +
                ", petType='" + petType + '\'' +
                ", petAge=" + petAge +
                ", petWeight=" + petWeight +
                '}';
    }
}
