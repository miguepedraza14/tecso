package coop.tecso.examen.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import coop.tecso.examen.dto.PhysicalOwnerDto;
import coop.tecso.examen.model.JuridicalOwner;
import coop.tecso.examen.model.Owner;
import coop.tecso.examen.model.PhysicalOwner;
import coop.tecso.examen.repository.PhysicalOwnerRepository;

@RestController
@CrossOrigin
@RequestMapping("/PhysicalOwner")
public class PhysicalOwnerController {
	
	@Autowired
	private PhysicalOwnerRepository physicalOwnerRepository;
	
	@PersistenceContext
    private EntityManager em;
	
	@GetMapping("/findAll")
	public List<PhysicalOwnerDto> findAll() {
		List<PhysicalOwnerDto> result = new ArrayList<>();
		for (PhysicalOwner owner : physicalOwnerRepository.findAll()) {
			PhysicalOwnerDto dto = new PhysicalOwnerDto();
			dto.setId(owner.getId());
			dto.setNombre(owner.getNombre());
			dto.setApellido(owner.getApellido());
			dto.setDni(owner.getDni());
			dto.setCuit(owner.getCuit());
			dto.setVersionNumber(owner.getVersionNumber());
			result.add(dto);
		}
	    return result;
	}
	
	@RequestMapping(value="/delete/{id}/{version}", method = RequestMethod.GET)
	@ResponseBody
	public void delete(@PathVariable("id") String id, @PathVariable("version") String version) {
		PhysicalOwner entity = new PhysicalOwner();
		entity.setId(Long.parseLong(id));
		entity.setVersionNumber(Long.parseLong(version));
		physicalOwnerRepository.delete(entity);
	}
	
	@RequestMapping(value="/save/{dni}/{nombre}/{apellido}/{cuit}", method = RequestMethod.POST)
	@ResponseBody
	public void save(@PathVariable("dni") String dni, @PathVariable("nombre") String nombre, @PathVariable("apellido") String apellido, @PathVariable("cuit") String cuit) {
		PhysicalOwner entity = new PhysicalOwner();
		entity.setDni(dni);
		entity.setNombre(nombre);
		entity.setApellido(apellido);
		entity.setCuit(cuit);
		entity.setVersionNumber(1);
		physicalOwnerRepository.save(entity);
	}
}