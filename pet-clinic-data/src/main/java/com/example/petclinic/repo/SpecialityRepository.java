package com.example.petclinic.repo;

import com.example.petclinic.model.Specialty;
import org.springframework.data.repository.CrudRepository;

public interface SpecialityRepository extends CrudRepository<Specialty, Long> {
}
