package org.example.petmanagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.*;


@Table(name = "PET")                 //映射為資料庫中的table
@Entity                                 //此類別對應資料庫的資料表
public class Pet {

    @Id                                 //資料表主鍵
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //主鍵為自動生成
    @Column(name = "pet_id")            //資料庫欄位名稱
    private int petId;                  //寵物id

    @Column(name = "pet_name")
    private String petName;             //寵物名字
    @Column(name = "pet_type")
    private String petType;             //寵物品種
    @Column(name = "pet_age")
    private double petAge;              //寵物年齡
    @Column(name = "pet_weight")
    private double petWeight;           //寵物體重

    public int getPetId() {             //取得寵物id
        return petId;
    }

    public void setPetId(int petId) {   //設定寵物id
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

    @Override                           //複寫方法
    public String toString() {
        return "Pet{" +
                "petId=" + petId +
                ", petName='" + petName + '\'' +
                ", petType='" + petType + '\'' +
                ", petAge=" + petAge +
                ", petWeight=" + petWeight +
                '}';
    }
}