package com.latihan.spring.md.service.impl;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.latihan.spring.md.config.Enum.ErrorConstant;
import com.latihan.spring.md.config.Enum.InqueryConstant;
import com.latihan.spring.md.config.Enum.MessageErrorConstanta;
import com.latihan.spring.md.pojo.request.PersegiPanjangReq;
import com.latihan.spring.md.pojo.response.ErrorCodeResponse;
import com.latihan.spring.md.pojo.response.PersegiPanjangRes;
import com.latihan.spring.md.service.ValidasiPersegiPanjangService;
import com.latihan.spring.md.validation.ValidationData;

@Service
public class ValidasiPersegiPanjangServiceImpl implements ValidasiPersegiPanjangService{

    @Override
    public PersegiPanjangRes isValid (PersegiPanjangReq request) {
    ValidationData validationData = new ValidationData();

    ErrorCodeResponse pjg = validationData.checkEmptyInteger(InqueryConstant.ROLE_PANJANG, request.getPanjang() , 8 );
		if(pjg != null) {
            return validationData.convertMessage(pjg);
        }	
    ErrorCodeResponse lbr = validationData.checkEmptyInteger(InqueryConstant.ROLE_LEBAR, request.getLebar() , 8 );
		if(lbr != null) {
            return validationData.convertMessage(lbr);
        }	
    ErrorCodeResponse tgi = validationData.checkEmptyInteger(InqueryConstant.ROLE_TINGGI, request.getTinggi() , 8 );
		if(tgi != null) {
            return validationData.convertMessage(tgi);
        }	

        PersegiPanjangRes persegiPanjangRes = new PersegiPanjangRes();
        persegiPanjangRes.setCode(HttpStatus.OK);
        persegiPanjangRes.setMessage(MessageErrorConstanta.SUCCES);
        persegiPanjangRes.setRetrunCode(true);
        persegiPanjangRes.setResponseCode(ErrorConstant.SUCCESSCFUL);
        return persegiPanjangRes;
    }

}