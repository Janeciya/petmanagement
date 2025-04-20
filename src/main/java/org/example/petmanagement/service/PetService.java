package org.example.petmanagement.service;

import org.example.petmanagement.dto.PetDto;
import org.example.petmanagement.entity.Pet;
import org.example.petmanagement.repository.PetRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service        //spring bean  同@Component=>通用 @Service為Service層專用
public class PetService implements IPetService {

    @Autowired    //bean 注入
    PetRepository petRepository;

    @Override
    public Pet add(PetDto pet) {
        //調用資料庫 新增
        Pet petEntity = new Pet();
        BeanUtils.copyProperties(pet, petEntity);  //把前面物件資料複製到後面物件(名稱型別相同)
        return petRepository.save(petEntity);  //.save新增修改可用 此為新增 自動判斷(有id修改 沒id新增)
    }

    @Override
    public Pet getPet(int petID) {
        //調用資料庫 查詢
        return petRepository.findById(petID).orElseThrow(() -> { //查到: 返回pet 查不到: 丟出錯誤
            throw new IllegalArgumentException("該寵物不存在");
        });
    }
}
