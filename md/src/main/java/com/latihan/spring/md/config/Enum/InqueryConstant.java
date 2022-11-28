package com.latihan.spring.md.config.Enum;

import java.util.Arrays;
import java.util.List;

public class InqueryConstant {
    public static final String MESSAGE_INVALID_REQUEST = "Invalid Request";
    public static final String MESSAGE_SUCCESS = "Success";
    
    public static final String PANJANG = "nilai-panjang";
    public static final String LEBAR = "nilai-lebar";
    public static final String TINGGI = "nilai-tinggi";


    public static final List<String> ROLE_PANJANG       = Arrays.asList(PANJANG  ,"=>");
    public static final List<String> ROLE_LEBAR         = Arrays.asList(LEBAR  ,"=>");
    public static final List<String> ROLE_TINGGI        = Arrays.asList(TINGGI  ,"=>");
    
  
    
}
