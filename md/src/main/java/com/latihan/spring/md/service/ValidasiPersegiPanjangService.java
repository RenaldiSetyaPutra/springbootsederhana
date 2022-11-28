package com.latihan.spring.md.service;

import com.latihan.spring.md.pojo.request.PersegiPanjangReq;
import com.latihan.spring.md.pojo.response.PersegiPanjangRes;

public interface ValidasiPersegiPanjangService {
    public PersegiPanjangRes isValid (PersegiPanjangReq request);
}
