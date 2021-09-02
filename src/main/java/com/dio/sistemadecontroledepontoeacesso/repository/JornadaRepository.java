package com.dio.sistemadecontroledepontoeacesso.repository;

import com.dio.sistemadecontroledepontoeacesso.model.JornadaTrabalho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JornadaRepository extends JpaRepository<JornadaTrabalho, Long> {
}
