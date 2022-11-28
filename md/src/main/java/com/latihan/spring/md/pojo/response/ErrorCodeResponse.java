package com.latihan.spring.md.pojo.response;

public class ErrorCodeResponse {
    private int responseCode;
    private String responseMessage;

    public int getResponseCode() {
        return responseCode;
    }
    public void setResponseCode(int responCode) {
        this.responseCode = responCode;
    }
    public String getResponMessage() {
        return responseMessage;
    }
    public void setResponseMessage(String responMessage) {
        this.responseMessage = responMessage;
    }

}