package com.latihan.spring.md.pojo.response;

public class HeaderValidationResponse {
    private String category;
    private int httpCode;
    private String serviceCode;
    private String caseCode;
    private String responMessage;
    
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public int getHttpCode() {
        return httpCode;
    }
    public void setHttpCode(int httpCode) {
        this.httpCode = httpCode;
    }
    public String getServiceCode() {
        return serviceCode;
    }
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }
    public String getCaseCode() {
        return caseCode;
    }
    public void setCaseCode(String caseCode) {
        this.caseCode = caseCode;
    }
    public String getResponMessage() {
        return responMessage;
    }
    public void setResponMessage(String responMessage) {
        this.responMessage = responMessage;
    }

}
