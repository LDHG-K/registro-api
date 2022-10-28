package com.registerapi.Registro.infraestructure.entryPoints;

import com.registerapi.Registro.domain.model.Comprador;
import com.registerapi.Registro.domain.model.Respuesta;
import com.registerapi.Registro.domain.useCase.gateways.ICompradorCrudService;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.awt.*;
import java.sql.Date;
import java.time.LocalDate;
import java.util.Map;

@RestController
@RequestMapping("/comprador")
@AllArgsConstructor
public class CompradorController {

    private final static Logger log = org.slf4j.LoggerFactory.getLogger(CompradorController.class);
    //Servicio
    private final ICompradorCrudService cs;

    @PostMapping("crear")
    public ResponseEntity<Mono<Respuesta>> crearComprador(@RequestBody Comprador comprador) throws InterruptedException {

        return new ResponseEntity<>(cs.crearComprador(Mono.just(comprador)).map(e -> Respuesta.builder()
                        .mensaje("Comprador creado")
                        .codigo("200")
                        .fecha(Date.valueOf(LocalDate.now()).toString())
                        .data(e)
                        .estado("OK")
                        .build())
                .onErrorReturn(
                        Respuesta.builder()
                                .mensaje("Error al crear ")
                                .codigo("500")
                                .fecha(Date.valueOf(LocalDate.now()).toString())
                                .data(null)
                                .estado("ERROR")
                                .build()
                ), HttpStatus.OK);
    }

    @GetMapping("obtener/{id}")
    public ResponseEntity<Mono<Respuesta>> obtenerComprador(@PathVariable("id") String id) throws InterruptedException {

        return new ResponseEntity<>(cs.buscarPorPalabraClave(id).map(e -> Respuesta.builder()
                .mensaje("Comprador encontrado")
                .codigo("200")
                .fecha(Date.valueOf(LocalDate.now()).toString())
                .data(e)
                .estado("OK")
                .build()), HttpStatus.OK);
    }

    @GetMapping("obtener/clave/{i}")
    public void obtenerCompradorPorPalabra() {

    }

    @PutMapping("editar")
    public void editarComprador(@RequestBody Comprador comprador) {


    }

}
