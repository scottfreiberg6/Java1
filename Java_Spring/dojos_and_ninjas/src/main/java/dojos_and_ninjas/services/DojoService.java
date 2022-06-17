package dojos_and_ninjas.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dojos_and_ninjas.models.Dojo;
import dojos_and_ninjas.repos.DojoRepository;

@Service
public class DojoService {
	@Autowired
	private DojoRepository dojoRepository;
	
	public void create(Dojo dojo)
	{
dojoRepository.save(dojo);
}
public Dojo findById(Long id)
{
	return dojoRepository.findById(id).orElse(null);
}
public ArrayList<Dojo> findAll()
{
	return dojoRepository.findAll();
	
}
public void update(Dojo dojo)
{
	dojoRepository.save(dojo);
}
public void deleteById(Long id)
{
	dojoRepository.deleteById(id);
}
}

