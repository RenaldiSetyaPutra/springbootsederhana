package com.latihan.spring.md.service;

import org.springframework.http.ResponseEntity;

import com.latihan.spring.md.pojo.request.PersegiPanjangReq;

public interface CorePersegiPanjangService {
    ResponseEntity<?> inquiry(PersegiPanjangReq request);
}
