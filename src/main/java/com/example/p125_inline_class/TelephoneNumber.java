package com.example.p125_inline_class;

public class TelephoneNumber {
    private String number;
    private String areaCode;

    public TelephoneNumber(String areaCode, String number) {
        this.areaCode = areaCode;
        this.number = number;
    }

    public String getTelephoneNumber() {
        return ("(" + areaCode + ") " + number);
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String arg) {
        this.areaCode = arg;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String arg) {
        this.number = arg;
    }
}
