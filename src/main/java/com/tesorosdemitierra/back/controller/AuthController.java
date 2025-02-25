package com.tesorosdemitierra.back.controller;

import com.tesorosdemitierra.back.JwtUtil;
import com.tesorosdemitierra.back.model.Clientes;
import com.tesorosdemitierra.back.service.ClientesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private ClientesService clientesService;

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody Clientes cliente) {
        clientesService.registerCliente(cliente);
        return ResponseEntity.ok("Usuario registrado con éxito");
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody Clientes cliente) {
        UserDetails userDetails = clientesService.loadUserByUsername(cliente.getEmail());
        if (userDetails != null && passwordEncoder.matches(cliente.getContrasena(), userDetails.getPassword())) {
            String token = jwtUtil.generateToken(userDetails.getUsername());
            return ResponseEntity.ok(token);
        }
        return ResponseEntity.status(401).body("Credenciales inválidas");
    }


    @GetMapping("/resource")
    @PreAuthorize("hasRole('USER')")
    public ResponseEntity<String> getProtectedResource() {

        return ResponseEntity.ok("Este es un recurso protegido!");
    }
}

