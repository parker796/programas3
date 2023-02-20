package com.example.programa3.Model;

import jakarta.persistence.*;

import java.util.Random;

@Entity
public class NumerosAleatorios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private int[] numerosAleatorios;

    public NumerosAleatorios() {
        numerosAleatorios = new int[10];
        Random rand = new Random();
        for (int i = 0; i < numerosAleatorios.length; i++) {
            numerosAleatorios[i] = rand.nextInt(100);
        }
    }

    public int[] getNumerosAleatorios() {
        return numerosAleatorios;
    }
}
