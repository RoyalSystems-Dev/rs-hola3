package net.royalsystems.hola;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import reactor.core.publisher.Flux;

public interface PersonaRepository extends ReactiveCrudRepository<Persona, Long> {

  Flux<Persona> findAllByOrderByNombreCompletoAsc();
  
}
