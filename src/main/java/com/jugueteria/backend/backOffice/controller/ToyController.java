package com.jugueteria.backend.backOffice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ToyController {
    
    @GetMapping("/")
    public String index() {
        return "¡Servidor de la juguetería funcionando chido!";
}
}