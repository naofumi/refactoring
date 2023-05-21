package com.example.p148_change_reference_to_value;

import java.util.Dictionary;
import java.util.Hashtable;

public class Currency {
    private String code;
    private static Dictionary<String, Currency> instances = new Hashtable<String, Currency>();

    static void loadCurrencies() {
        new Currency("PHP").store();
        new Currency("JPY").store();
        new Currency("USD").store();
    }

    private void store() {
        instances.put(this.getCode(), this);
    }

    public static Currency get(String code) {
        return instances.get(code);
    }

    public String getCode() {
        return code;
    }

    private Currency(String code) {
        this.code = code;
    }
}
