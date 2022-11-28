package com.latihan.spring.md.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.latihan.spring.md.pojo.request.PersegiPanjangReq;
import com.latihan.spring.md.service.CorePersegiPanjangService;

@RestController
public class PersegiPanjangController {
    @Autowired
    CorePersegiPanjangService corePersegiPanjangService;
    @Autowired
    HttpServletRequest httpServletRequest;

    @PostMapping("/hitung-luas")
    public  ResponseEntity<?> inquiry(@RequestBody PersegiPanjangReq request){
        return corePersegiPanjangService.inquiry(request);
    }
    
    // @PostMapping("/hitung-keliling")
    // public String kelilingPersegiPanjang(@RequestBody PersegiPanjangReq req){
    //     return persegiPanjangService.hitungLuas(req, httpServletRequest);
    // }
}
