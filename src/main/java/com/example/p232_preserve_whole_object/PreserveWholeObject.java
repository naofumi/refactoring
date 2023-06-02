package com.example.p232_preserve_whole_object;


public class PreserveWholeObject {

    public static void main(String[] args) {
        TempRange daysTempRange = new TempRange();
        Plan plan = new Plan();

        int low = daysTempRange.getLow();
        int high = daysTempRange.getHigh();
    
        boolean withinPlan = plan.withinRange(low, high);

        System.out.println("Within Plan?: " + withinPlan);


            
    }
}
