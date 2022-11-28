package com.latihan.spring.ms.controller;


import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.latihan.spring.ms.pojo.request.PersegiPanjangReq;
import com.latihan.spring.ms.pojo.respon.PersegiPanjangRes;
import com.latihan.spring.ms.service.PersegiPanjangService;

@RestController
public class PersegiPanjangController {
	@Autowired
    private PersegiPanjangService persegiPanjangService;

    @PostMapping("/process-luas")
    public PersegiPanjangRes persegiPanjang(@RequestBody PersegiPanjangReq request){
        return persegiPanjangService.persegiPanjangRes(request);
    }


    // @GetMapping("/luaspersegi")
	// public String getLuas(){
	// 	return "Ini Rumus Luas Persegi Panjang = Panjang * Lebar";
	// }

	// @GetMapping("/kelilingpersegi")
	// public String getKeliling(){
	// 	return "Ini Rumus Keliling Persegi Panjang = 2 * (Panjang + Lebar)!";
	// }
}
