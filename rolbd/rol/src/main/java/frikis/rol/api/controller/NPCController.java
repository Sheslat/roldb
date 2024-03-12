package frikis.rol.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import frikis.rol.api.domain.NPC;
import frikis.rol.api.service.NPCService;

@RestController
@RequestMapping("/npc")
public class NPCController {
	
	@Autowired
	private NPCService service;

	@GetMapping("/get-all")
	public List<NPC> getAll() {
		
		return service.getAll();
	}
	
	@GetMapping("/get-by-location/{id}")
	public List<NPC> getByLocation(@PathVariable Long id) {
		
		return service.getByLocation(id);
	}
	
	@GetMapping("/get-by-race/{id}")
	public List<NPC> getByRace(@PathVariable Long id) {
		
		return service.getByRace(id);
	}
	
	@GetMapping("/get-by-title/{id}")
	public List<NPC> getByTitle(@PathVariable Long id) {
		
		return service.getByTitle(id);
	}
	
	
}
