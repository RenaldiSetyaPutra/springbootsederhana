package com.latihan.spring.md.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.latihan.spring.md.config.OpenFeignConfig;
import com.latihan.spring.md.pojo.request.PersegiPanjangReq;
import com.latihan.spring.md.pojo.response.PersegiPanjangRes;

@FeignClient(value = "${app.persegipanjang-service.name}", url = "${app.persegipanjang-service.url}", configuration = OpenFeignConfig.class)
public interface PersegiPanjangService {
    @RequestMapping(method = RequestMethod.POST, value = "/process-luas")
    PersegiPanjangRes persegiPanjangRes (PersegiPanjangReq request);
}
