package com.registerapi.Registro.infraestructure.entryPoints;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/factura")
public class FacturaController {

    @PostMapping("registrar")
    public void registrarFactura(){

    }

    @GetMapping("buscar/{id}")
    public void buscarFactura(){

    }

    @GetMapping("buscar/Ventas")
    public void buscarTodasLasFacturas(){

    }

    @GetMapping("buscar/Ventas/{fecha}")
    public void buscarFacturasPorFecha(){

    }

    @PutMapping("editar")
    public void editarFactura(){

    }
}
