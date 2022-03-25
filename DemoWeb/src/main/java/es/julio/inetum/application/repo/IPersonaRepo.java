package es.julio.inetum.application.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import es.julio.inetum.application.model.Persona;

public interface IPersonaRepo extends JpaRepository<Persona, Integer>{

}
