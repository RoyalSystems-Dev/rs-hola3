package net.royalsystems.hola;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class HolaController {
	
    @GetMapping("/hola")
    public String hola() {
        return "Hola";
    }

    @GetMapping("/mono")
    public Mono<String> getMono() {
        return Mono.just("Hola desde Mono");
    }

    @GetMapping("/flux")
    public Flux<String> getFlux() {
        return Flux.just("Elemento 1", "Elemento 2", "Elemento 3");
    }
}