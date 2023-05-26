package com.example.p197_remove_control_flag;

public class RemoveControlFlag {
    
    public static void main(String[] args) {
        String[] people = {"Peter", "Jules", "Don", "Pat", "Mary"};
        new RemoveControlFlag().checkSecurity(people);
    }

    void checkSecurity(String[] people) {
        boolean found = false;
        for (int i = 0; i < people.length; i++) {
            if (! found) {
                if (people[i].equals ("Don")){
                    sendAlert();
                    found = true;
                }
                if (people[i].equals ("John")){
                    sendAlert();
                    found = true;
                }
            }
        }
    }

    void sendAlert() {
        System.out.println("-- Either Don or John was detected");
    }
}
