package com.latihan.spring.md.service.impl;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.latihan.spring.md.pojo.request.PersegiPanjangReq;
import com.latihan.spring.md.pojo.response.ErrorCodeResponse;
import com.latihan.spring.md.pojo.response.PersegiPanjangRes;
import com.latihan.spring.md.service.CorePersegiPanjangService;
import com.latihan.spring.md.service.PersegiPanjangService;
import com.latihan.spring.md.service.ValidasiPersegiPanjangService;


@Service
public class CorePersegiPanjangImpl implements CorePersegiPanjangService{
    
    @Autowired
    HttpServletResponse httpServletResponse;
    @Autowired
    ValidasiPersegiPanjangService validasiPersegiPanjangService;
    @Autowired
    PersegiPanjangService persegiPanjangService;
    @Override
    public ResponseEntity<?> inquiry (PersegiPanjangReq request) {
        // TODO Auto-generated method
        PersegiPanjangRes persegiPanjangRes = validasiPersegiPanjangService.isValid(request);
        if(persegiPanjangRes.getRetrunCode() == false) {
            ErrorCodeResponse errorCodeResponse = new ErrorCodeResponse();
            errorCodeResponse.setResponseMessage(persegiPanjangRes.getMessage());
            errorCodeResponse.setResponseCode(persegiPanjangRes.getResponseCode());
            return new ResponseEntity<>(errorCodeResponse,persegiPanjangRes.getCode());
        }

        PersegiPanjangRes response = persegiPanjangService.persegiPanjangRes(request);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }        
    
}
