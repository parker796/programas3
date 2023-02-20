package com.example.programa3.Controller;

import com.example.programa3.Model.Numeros;
import com.example.programa3.Model.NumerosAleatorios;
import com.example.programa3.Services.NumeroService;
import com.example.programa3.Services.NumerosService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@RestController
public class controlador {
    @Autowired
    private NumeroService numerosService;

    @GetMapping("/numeros")
    public NumerosAleatorios getNumerosAleatorios() {
        return numerosService.getNumerosAleatorios();
    }
    @Autowired
    private NumerosService2 numerosService2;

    @PostMapping("/separar")
    public Map<String, List<Integer>> separarNumeros(@RequestBody Numeros numeros) {
        return numerosService2.separarNumeros(numeros);
    }


}
