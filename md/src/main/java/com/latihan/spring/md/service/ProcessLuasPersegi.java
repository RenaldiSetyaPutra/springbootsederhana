// package com.latihan.spring.md.service;

// import org.springframework.cloud.openfeign.FeignClient;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMethod;

// import com.latihan.spring.md.config.OpenFeignConfig;
// import com.latihan.spring.md.pojo.request.PersegiPanjangReq;

// @FeignClient(name = "${app.persegipanjang-service.name}", url ="${app.persegipanjang-service.url}", 
// configuration = OpenFeignConfig.class)
// public interface ProcessLuasPersegi {
//     @RequestMapping(method = RequestMethod.POST, value = "/process-luas")
//     String persegiPanjang(PersegiPanjangReq req);
// }
