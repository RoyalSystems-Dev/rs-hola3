package net.royalsystems.hola;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/personas")
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    // @PostMapping
    // public Mono<Persona> savePersona(@RequestBody Persona person) {
    //     return personaService.savePersona(person);
    // }

    @GetMapping
    public Flux<Persona> getFirst10Personas() throws Exception {
        return personaService.getFirst10Personas();
    }
}
