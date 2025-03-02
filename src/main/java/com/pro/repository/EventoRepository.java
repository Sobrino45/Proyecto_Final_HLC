package com.pro.repository;

import com.pro.model.Evento;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventoRepository extends JpaRepository<Evento, Long> {
    List<Evento> findByNombreContaining(String nombre);
}
