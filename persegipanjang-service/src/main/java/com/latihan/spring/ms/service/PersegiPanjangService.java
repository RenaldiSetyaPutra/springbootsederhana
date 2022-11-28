package com.latihan.spring.ms.service;


import com.latihan.spring.ms.pojo.request.PersegiPanjangReq;
import com.latihan.spring.ms.pojo.respon.PersegiPanjangRes;

public interface PersegiPanjangService {
    public PersegiPanjangRes persegiPanjangRes(PersegiPanjangReq request);
}
