package com.latihan.spring.md.validation;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import com.latihan.spring.md.config.Enum.ErrorConstant;
import com.latihan.spring.md.config.Enum.InqueryConstant;
import com.latihan.spring.md.pojo.response.ErrorCodeResponse;
import com.latihan.spring.md.pojo.response.PersegiPanjangRes;


@Component
public class ValidationData {

    public PersegiPanjangRes convertMessage(ErrorCodeResponse value){
        PersegiPanjangRes persegiPanjangRes = new PersegiPanjangRes();

        persegiPanjangRes.setCode(HttpStatus.BAD_REQUEST);
        persegiPanjangRes.setMessage(value.getResponMessage());
        persegiPanjangRes.setRetrunCode(false);
        persegiPanjangRes.setResponseCode(value.getResponseCode());
        return persegiPanjangRes;
    } 

    
    public ErrorCodeResponse checkEmptyInteger(List<String> role , int value , int length){
        if(value == 0 ){
            ErrorCodeResponse errorCodeResponse = new ErrorCodeResponse();
            errorCodeResponse.setResponseCode(ErrorConstant.BERC);
            errorCodeResponse.setResponseMessage(InqueryConstant.MESSAGE_INVALID_REQUEST + role.get(0));
            
            return errorCodeResponse;
        }
        return this.checkLength(role ,value ,length);
    }
    public ErrorCodeResponse checkLength(List<String> role , int value , int length){
        ErrorCodeResponse errorCodeResponse = new ErrorCodeResponse();
        switch(role.get(1)) {
            case ">":
                if(value > length) {
                    errorCodeResponse.setResponseCode(ErrorConstant.BERC);
                    errorCodeResponse.setResponseMessage(InqueryConstant.MESSAGE_INVALID_REQUEST + role.get(0));
                    return errorCodeResponse;
                }
                break;
            case "!=":
                if(value != length) {
                    errorCodeResponse.setResponseCode(ErrorConstant.BERC);
                    errorCodeResponse.setResponseMessage(InqueryConstant.MESSAGE_INVALID_REQUEST + role.get(0));
            
                    return errorCodeResponse;
                }
              break;
          }

        return null;
    }

    // public ValidationHeaderResponse errorCodeResponse(String code, String message){
    //     ErrorCodeResponse errorCodeResponse = new ErrorCodeResponse();
    //     errorCodeResponse.setResponCode(code);
    //     errorCodeResponse.setResponMessage(message);
        
    //     return this.convertMessage(errorCodeResponse);
    // }

    // public ErrorCodeResponse checkLength(List<String> role, String value, int length){
    //     ErrorCodeResponse errorCodeResponse = new ErrorCodeResponse();
    //     switch(role.get(1)){
    //         case ">":
    //             if(value.length() > length){
    //                 errorCodeResponse.setResponCode(ErrorConstant.BERC + ServiceConstant.INQUIRY + CaseConstant.INVALID_FIELD_FORMAT);
    //                 errorCodeResponse.setResponMessage(InqueryConstant.MESSAGE_INVALID_FORMAT + role.get(0));
    //                 return errorCodeResponse;
    //             } break;
    //         case "!=":
    //             if(value.length() != length){
    //                 errorCodeResponse.setResponCode(ErrorConstant.BERC + ServiceConstant.INQUIRY + CaseConstant.INVALID_FIELD_FORMAT);
    //                 errorCodeResponse.setResponMessage(InqueryConstant.MESSAGE_INVALID_FORMAT + role.get(0));
    //                 return errorCodeResponse;
    //             } break;
    //     }
    //     return null;
    // }
}
