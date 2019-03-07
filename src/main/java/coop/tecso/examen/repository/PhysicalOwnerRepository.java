package coop.tecso.examen.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import coop.tecso.examen.model.PhysicalOwner;

public interface PhysicalOwnerRepository extends JpaRepository<PhysicalOwner, Long> {

}
