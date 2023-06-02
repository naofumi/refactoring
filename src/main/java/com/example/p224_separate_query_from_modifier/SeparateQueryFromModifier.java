package com.example.p224_separate_query_from_modifier;

/*
 * Also take a look at CQRS pattern
 * https://martinfowler.com/bliki/CQRS.html
 */
public class SeparateQueryFromModifier {    
    public static void main(String[] args) {
        String[] people = {"Peter", "Jules", "Don", "Pat", "Mary"};
        new SeparateQueryFromModifier().checkSecurity(people);
    }

    /*
     * Issue is that in addition to "finding",
     * this also sends an "alert" (a side effect)
     */
    private String getFoundMiscreantAndSendAllAlerts(String[] people) {
        boolean found = false;
        for (int i = 0; i < people.length; i++) {
            if (! found) {
                if (people[i].equals ("Don")){
                    sendAlert("Don");
                    return "Don";
                }
                if (people[i].equals ("John")){
                    sendAlert("John");
                    return "John";
                }
            }
        }
        return "";
    }

    public void checkSecurity(String[] people) {
        String found = getFoundMiscreantAndSendAllAlerts(people);
        sendMail(found);
    }

    private void sendAlert(String name) {
        System.out.println("--------- Alert -------");
        System.out.println(name + " : was detected");
    }

    private void sendMail(String found) {
        System.out.println("--------- MAIL -------");
        System.out.println("Send mail to: " + found);
    }
}
