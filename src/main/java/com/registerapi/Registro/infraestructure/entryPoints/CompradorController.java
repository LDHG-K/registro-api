package com.registerapi.Registro.infraestructure.entryPoints;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/comprador")
public class CompradorController {

    //Servicio

    @PostMapping("crear")
    public void crearComprador(){

    }

    @GetMapping("obtener/{id}")
    public void obtenerComprador(){

    }

    @GetMapping("obtener/clave/{i}")
    public void obtenerCompradorPorPalabra(){

    }

    @PutMapping("editar")
    public void editarComprador(){

    }

}
