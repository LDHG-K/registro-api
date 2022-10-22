package com.registerapi.Registro.infraestructure.entryPoints;

import com.registerapi.Registro.domain.model.Comprador;
import com.registerapi.Registro.domain.useCase.gateways.ICompradorCrudService;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/comprador")
@AllArgsConstructor
public class CompradorController {

    private final static Logger log = org.slf4j.LoggerFactory.getLogger(CompradorController.class);
    //Servicio
    private final ICompradorCrudService cs;

    @PostMapping("/crear")
    public ResponseEntity<HttpStatus> crearComprador(@RequestBody Comprador comprador) throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("--------------");
        Mono.just(comprador).flatMap(e->cs.crearComprador(Mono.just(e))).subscribe();
        System.out.println("--------------");
        Mono.just(comprador).subscribe(sol->log.info("Comprador creado: "+sol));
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("obtener/{id}")
    public void obtenerComprador() {

    }

    @GetMapping("obtener/clave/{i}")
    public void obtenerCompradorPorPalabra() {

    }

    @PutMapping("editar")
    public void editarComprador() {

    }

}
