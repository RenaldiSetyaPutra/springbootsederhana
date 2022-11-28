package com.latihan.spring.md.pojo.request;

public class PersegiPanjangReq {
    private int panjang;
    private int lebar;
    private int tinggi;
    private int keliling;
    private int luas;

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
}
