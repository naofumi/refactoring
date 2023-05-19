package com.example.p110_replace_method_with_method_object;

public class ReplaceMethodWithMethodObject {
    public static void main(String[] args) {
        ReplaceMethodWithMethodObject instance = new ReplaceMethodWithMethodObject();
        System.out.println(instance.gamma(60, 100, 1000));
    }


    public int gamma(int inputVal, int quantity, int yearToDate) {
        int importantValue1 = (inputVal * quantity) + delta();
        int importantValue2 = (inputVal * yearToDate) + 100;
        if ((yearToDate - importantValue1) > 100) {
            importantValue2 -= 20;
        }
        int importantValue3 = importantValue2 * 7;
        // ...
        return importantValue3 - 2 * importantValue1;
    }

    private int delta() {
        return 3;
    }
}
