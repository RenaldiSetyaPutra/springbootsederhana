package com.latihan.spring.ms.service.impl;

import org.springframework.stereotype.Service;

import com.latihan.spring.ms.pojo.request.SegitigasamakakiReq;
import com.latihan.spring.ms.pojo.respon.SegitigasamakakiRes;
import com.latihan.spring.ms.service.SegitigasamakakiService;

@Service
public class SegitigasamakakiServiceImpl implements SegitigasamakakiService {

    @Override
    public SegitigasamakakiRes persegiPanjang(SegitigasamakakiReq Req) {
        // TODO Auto-generated method stub
        SegitigasamakakiRes panjangRes = new SegitigasamakakiRes();
        int panjang = Req.getPanjang();
        int lebar = Req.getLebar();
        int tinggi =  Req.getTinggi();
        int luas = panjang*lebar;
        int keliling = 2*(panjang+lebar);

        panjangRes.setPanjang(panjang);
        panjangRes.setLebar(lebar);
        panjangRes.setTinggi(tinggi);

        System.out.println(luas);
        System.out.println(keliling);
        return null;
    }



        
}
