package net.royalsystems.hola;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
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

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/querytest")
    public List<Map<String, Object>> ejecutarConsulta() {
        // Ejecutar la consulta personalizada
        String consulta = "SELECT TOP 10 * FROM PersonaMast";
        List<Map<String, Object>> resultados = jdbcTemplate.queryForList(consulta);

        // Puedes agregar lógica adicional aquí si es necesario

        return resultados;
    }
}