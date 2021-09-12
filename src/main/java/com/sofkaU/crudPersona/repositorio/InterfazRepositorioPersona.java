package com.sofkaU.crudPersona.repositorio;

import com.sofkaU.crudPersona.entidades.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InterfazRepositorioPersona extends CrudRepository <Persona,Integer> {

}
