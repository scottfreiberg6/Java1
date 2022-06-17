package dojos_and_ninjas.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dojos_and_ninjas.models.Ninja;
import dojos_and_ninjas.repos.NinjaRepository;

@Service
public class NinjaService {
@Autowired
private NinjaRepository ninjaRepository;

public void create(Ninja ninja)
{
	ninjaRepository.save(ninja);
}
public Ninja findById(Long id)
{
	return ninjaRepository.findById(id).orElse(null);
}
public ArrayList<Ninja> findAll()
{
	return ninjaRepository.findAll();
	}
public void update(Ninja ninja)
{
	ninjaRepository.save(ninja);
}
public void deleteById(Long id)
{
	ninjaRepository.deleteById(id);
}
}
