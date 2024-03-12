package frikis.rol.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import frikis.rol.api.domain.NPC;
import frikis.rol.api.repository.NPCRepository;

@Service
public class NPCService {

	@Autowired
	private NPCRepository repository;
	
	public List<NPC> getAll(){
		List<NPC> result = (List<NPC>) repository.findAll();
		
		return result;
	}
	
	public List<NPC> getByLocation(Long locationId){
		List<NPC> result = (List<NPC>) repository.findByLocationId(locationId);
		
		return result;
	}
	
	public List<NPC> getByRace(Long raceId){
		List<NPC> result = (List<NPC>) repository.findByRaceId(raceId);
		
		return result;
	}
	
	public List<NPC> getByTitle(Long titleId){
		List<NPC> result = (List<NPC>) repository.findByTitleId(titleId);
		
		return result;
	}
}
