package dojos_and_ninjas.repos;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import dojos_and_ninjas.models.Dojo;

public interface DojoRepository extends CrudRepository<Dojo,Long> {
ArrayList<Dojo> findAll();
}
