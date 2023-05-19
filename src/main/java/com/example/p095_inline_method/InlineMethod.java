package com.example.p095_inline_method;

public class InlineMethod {
    private int numberOfLateDeliveries;

    public static void main( String[] args )
    {
        InlineMethod inlineMethod1 = new InlineMethod(4);
        System.out.println("-- With 4 late deliveries --");
        System.out.println(inlineMethod1.getRating());

        InlineMethod inlineMethod2 = new InlineMethod(6);
        System.out.println("-- With 6 late deliveries --");
        System.out.println(inlineMethod2.getRating());
    }

    public InlineMethod(int numberOfLateDeliveries) {
        this.numberOfLateDeliveries = numberOfLateDeliveries;
    }

    int getRating() {
        return (moreThanFivelateDeliveries()) ? 2 : 1;
    }

    boolean moreThanFivelateDeliveries() {
        return numberOfLateDeliveries > 5;
    }
}
