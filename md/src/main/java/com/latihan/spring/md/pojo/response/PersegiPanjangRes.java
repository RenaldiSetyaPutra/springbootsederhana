package com.latihan.spring.md.pojo.response;

import org.springframework.http.HttpStatus;

public class PersegiPanjangRes {
    private int panjang;
    private int lebar;
    private int tinggi;
    private int keliling;
    private int luas;
    private int responseCode;
    private HttpStatus code;
    private String message;
    private Boolean retrunCode;
    
    public int getResponseCode() {
        return responseCode;
    }
    public void setResponseCode(int responCode) {
        this.responseCode = responCode;
    }
    public HttpStatus getCode() {
        return code;
    }
    public void setCode(HttpStatus code) {
        this.code = code;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public Boolean getRetrunCode() {
        return retrunCode;
    }
    public void setRetrunCode(Boolean retrunCode) {
        this.retrunCode = retrunCode;
    }
    public int getPanjang() {
        return panjang;
    }
    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }
    public int getLebar() {
        return lebar;
    }
    public void setLebar(int lebar) {
        this.lebar = lebar;
    }
    public int getTinggi() {
        return tinggi;
    }
    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
    public int getKeliling() {
        return keliling;
    }
    public void setKeliling(int keliling) {
        this.keliling = keliling;
    }
    public int getLuas() {
        return luas;
    }
    public void setLuas(int luas) {
        this.luas = luas;
    }
    
}
