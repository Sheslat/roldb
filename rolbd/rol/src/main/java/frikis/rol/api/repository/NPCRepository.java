package frikis.rol.api.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import frikis.rol.api.domain.NPC;

@Repository
public interface NPCRepository extends CrudRepository<NPC,Long>{
	
	public List<NPC> findByLocationId(Long locationId);
	
	public List<NPC> findByRaceId(Long raceId);
	
	public List<NPC> findByTitleId(Long titleId);
}
