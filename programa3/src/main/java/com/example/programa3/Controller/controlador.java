package com.example.programa3.Controller;

import com.example.programa3.Model.Numeros;
import com.example.programa3.Model.NumerosAleatorios;
import com.example.programa3.Model.Persona;
import com.example.programa3.Services.NumeroService;
import com.example.programa3.Services.NumerosService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.FileWriter;
import java.io.IOException;
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

    @PostMapping("/personas")
    public ResponseEntity<String> guardarPersonas(@RequestBody Persona[] personas) {
        try {
            // Crear el archivo personas.txt y escribir las líneas
            FileWriter archivo = new FileWriter("personas.txt");
            for (Persona persona : personas) {
                archivo.write(persona.toString() + "|");
            }
            archivo.close();
            return ResponseEntity.ok("Archivo personas.txt creado exitosamente.");
        } catch (IOException e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al crear el archivo personas.txt.");
        }
    }
}
