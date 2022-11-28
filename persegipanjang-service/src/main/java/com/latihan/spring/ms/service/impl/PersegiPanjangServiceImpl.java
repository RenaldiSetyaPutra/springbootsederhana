package com.latihan.spring.ms.service.impl;

import org.springframework.stereotype.Service;

import com.latihan.spring.ms.pojo.request.PersegiPanjangReq;
import com.latihan.spring.ms.pojo.respon.PersegiPanjangRes;
import com.latihan.spring.ms.service.PersegiPanjangService;

@Service
public class PersegiPanjangServiceImpl implements PersegiPanjangService {

    @Override
    public PersegiPanjangRes persegiPanjangRes(PersegiPanjangReq request) {
        // TODO Auto-generated method stub
        PersegiPanjangRes persegiPanjangRes = new PersegiPanjangRes();
        int panjang = request.getPanjang();
        int lebar = request.getLebar();
        int tinggi =  request.getTinggi();
        int luas = panjang*lebar;
        int keliling = 2*(panjang+lebar);

        persegiPanjangRes.setPanjang(panjang);
        persegiPanjangRes.setLebar(lebar);
        persegiPanjangRes.setTinggi(tinggi);
        persegiPanjangRes.setLuas(luas); 
        persegiPanjangRes.setKeliling(keliling); 

        return persegiPanjangRes;
    }



        
}
