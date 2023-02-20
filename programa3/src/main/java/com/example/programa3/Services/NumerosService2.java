package com.example.programa3.Services;

import com.example.programa3.Model.Numeros;
import com.example.programa3.Repository.Numeros2Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class NumerosService2 {
    @Autowired
    private Numeros2Repository numerosRepository2;

    public Map<String, List<Integer>> separarNumeros(Numeros numeros) {
        numerosRepository2.save(numeros);
        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();

        for (Integer numero : numeros.getNumeros()) {
            if (numero % 2 == 0) {
                pares.add(numero);

            } else {
                impares.add(numero);
            }
        }

        Map<String, List<Integer>> resultado = new HashMap<>();
        resultado.put("pares", pares);
        resultado.put("impares", impares);

        return resultado;
    }
}
