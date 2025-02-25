package com.pro.service;

import com.pro.model.Evento;
import com.pro.repository.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventoService {
    @Autowired
    private EventoRepository eventoRepository;

    public Evento crearEvento(Evento evento) {
        return eventoRepository.save(evento);
    }

    public List<Evento> buscarPorNombre(String nombre) {
        return eventoRepository.findByNombreContaining(nombre);
    }
}
