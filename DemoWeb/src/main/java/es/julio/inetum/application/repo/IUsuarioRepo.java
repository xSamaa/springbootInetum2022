package es.julio.inetum.application.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import es.julio.inetum.application.model.Usuario;

public interface IUsuarioRepo extends JpaRepository<Usuario, Integer>{

	Usuario findByNombre(String username);

}
