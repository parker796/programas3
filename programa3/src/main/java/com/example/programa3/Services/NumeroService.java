package com.example.programa3.Services;

import com.example.programa3.Model.NumerosAleatorios;
import com.example.programa3.Repository.NumerosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NumeroService {
    @Autowired
    private NumerosRepository numerosRepository;

    public NumerosAleatorios getNumerosAleatorios() {
        List<NumerosAleatorios> numerosList = numerosRepository.findAll();
        if (numerosList.isEmpty()) {
            NumerosAleatorios numeros = new NumerosAleatorios();
            return numerosRepository.save(numeros);
        } else {
            return numerosList.get(0);
        }
    }
}
