package com.example.p089_extract_method;

public class ExtractMethod {
    public static void main( String[] args )
    {
        new ExtractMethod().printOwning("Seedtech", 250);
    }    

    void printOwning(String name, double amount) {
        printBanner();

        // print details
        System.out.println("name:" + name);
        System.out.println("amount" + amount);
    }

    private void printBanner() {
        System.out.println("--- Banner ---");
    }
}
