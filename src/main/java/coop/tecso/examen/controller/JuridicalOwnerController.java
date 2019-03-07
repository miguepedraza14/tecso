package coop.tecso.examen.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import coop.tecso.examen.dto.JuridicalOwnerDto;
import coop.tecso.examen.dto.PhysicalOwnerDto;
import coop.tecso.examen.model.JuridicalOwner;
import coop.tecso.examen.repository.JuridicalOwnerRepository;

@RestController
@RequestMapping("/JuridicalOwner")
public class JuridicalOwnerController {
	
	@Autowired
	private JuridicalOwnerRepository juridicalOwnerRepository;
	
	@GetMapping("/findAll")
	public List<JuridicalOwnerDto> findAll() {
		List<JuridicalOwnerDto> result = new ArrayList<>();
		for (JuridicalOwner owner : juridicalOwnerRepository.findAll()) {
			JuridicalOwnerDto dto = new JuridicalOwnerDto();
			dto.setId(owner.getId());
			dto.setAnioFundacion(owner.getAnio_fundacion());
			dto.setRazonSocial(owner.getRazon_social());
			dto.setCuit(owner.getCuit());
			dto.setVersionNumber(owner.getVersionNumber());
			result.add(dto);
		}
	    return result;
	}

	@GetMapping("/save")
	public JuridicalOwner save(@PathVariable("id") Long id) {
		System.out.println("ID: " + id);
//		JuridicalOwner entity = new JuridicalOwner();
//		entity.setId(id);
		return null;
	}
	
	@RequestMapping(value="/delete/{id}/{version}", method = RequestMethod.GET)
	@ResponseBody
	public void delete(@PathVariable("id") Long id, @PathVariable("version") Long version) {
		JuridicalOwner entity = new JuridicalOwner();
		entity.setId(id);
		entity.setVersionNumber(version);
		juridicalOwnerRepository.delete(entity);
	}
}