package net.royalsystems.hola;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    // public Mono<Persona> savePersona(Persona person) {
    //     return personaRepository.save(person);
    // }

    public Flux<Persona> getFirst10Personas() {
        return personaRepository.findAllByOrderByNombreCompletoAsc().limitRequest(10);
    }
}
