package org.example.petmanagement.repository;

import org.example.petmanagement.entity.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository    //spring bean
public interface PetRepository extends JpaRepository<Pet,Integer> {
}
