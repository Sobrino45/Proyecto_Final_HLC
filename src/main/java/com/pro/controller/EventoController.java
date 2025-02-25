package com.pro.controller;

import com.pro.model.Evento;
import com.pro.service.EventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/eventos")
public class EventoController {
    @Autowired
    private EventoService eventoService;

    @PostMapping("/crear")
    public Evento crearEvento(@RequestBody Evento evento) {
        return eventoService.crearEvento(evento);
    }

    @GetMapping("/buscar")
    public List<Evento> buscarPorNombre(@RequestParam String nombre) {
        return eventoService.buscarPorNombre(nombre);
    }
}

