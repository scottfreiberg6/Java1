package dojos_and_ninjas.repos;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import dojos_and_ninjas.models.Ninja;

public interface NinjaRepository extends CrudRepository<Ninja, Long> {
	ArrayList<Ninja> findAll();
}
