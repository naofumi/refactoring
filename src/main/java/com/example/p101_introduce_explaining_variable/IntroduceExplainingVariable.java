package com.example.p101_introduce_explaining_variable;

public class IntroduceExplainingVariable {
    public String userAgent;
    public static void main(String[] args) {
        String userAgent1 = "Mozilla/5.0 (Apple Mac OS X v10.9.3; Trident/7.0; rv:11.0) like Gecko";
        IntroduceExplainingVariable instance1 = new IntroduceExplainingVariable(userAgent1);
        System.out.println("-- description for 1 --");
        System.out.println(instance1.description());

        String userAgent2 = "Mozilla/5.0 (Macintosh; Intel Mac OS X 13_4) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/16.4 Safari/605.1.15";
        IntroduceExplainingVariable instance2 = new IntroduceExplainingVariable(userAgent2);
        System.out.println("-- description for 2 --");
        System.out.println(instance2.description());
    }

    public IntroduceExplainingVariable(String userAgent) {
        this.userAgent = userAgent;
    }

    public String description() {
        if ( (userAgent.toUpperCase().indexOf("MAC") > -1) &&
             (userAgent.toUpperCase().indexOf("TRIDENT") > -1)) {
                return "Internet Explorer on the Mac!";
        } else if  ( (userAgent.toUpperCase().indexOf("MAC") > -1) &&
                     (userAgent.toUpperCase().indexOf("SAFARI") > -1)) {
            return "Safari on the Mac!";
        } else {
            return "I don't know what this is";
        }
    }
}
