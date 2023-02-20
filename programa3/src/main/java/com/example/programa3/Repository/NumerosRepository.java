package com.example.programa3.Repository;

import com.example.programa3.Model.NumerosAleatorios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NumerosRepository extends JpaRepository<NumerosAleatorios, Long> {
}
