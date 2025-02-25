package com.pro.controller;

import com.pro.model.Usuario;
import com.pro.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/registrar")
    public Usuario registrarUsuario(@RequestBody Usuario usuario) {
        return usuarioService.registrarUsuario(usuario);
    }

    @GetMapping("/buscar")
    public Optional<Usuario> buscarPorEmail(@RequestParam String email) {
        return usuarioService.buscarPorEmail(email);
    }
}