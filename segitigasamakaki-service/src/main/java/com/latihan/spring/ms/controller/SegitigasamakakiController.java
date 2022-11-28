package com.latihan.spring.ms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SegitigasamakakiController {
    @GetMapping("/luassegitiga")
    public String luas(){
        return "Ini Rumus Luas Segitiga = 1/2 * Alas * Tinggi";
    }
    
    @GetMapping("/kelilingsegitiga")
    public String keliling(){
        return "Ini Rumus Keliling Segitiga = Sisi A + Sisi B + Sisi C";
    }
}