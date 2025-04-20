package org.example.petmanagement.dto;

import jakarta.validation.constraints.NotEmpty;

public class PetDto {

    @NotEmpty(message = "寵物名稱不可為空") //驗證參數不可為空
    private String petName;             //寵物名字
    private String petType;             //寵物品種
    private double petAge;              //寵物年齡
    private double petWeight;

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
