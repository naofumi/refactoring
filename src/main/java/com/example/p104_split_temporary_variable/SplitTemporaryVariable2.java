package com.example.p104_split_temporary_variable;

public class SplitTemporaryVariable2 {
    private double primaryForce = 10.0;
    private double secondaryForce = 20.0;
    private double mass = 10.0;
    private int delay = 2;

    public static void main(String[] args) {
        System.out.println(new SplitTemporaryVariable2()
                                .getDistanceTravelled(30));
    }

    public SplitTemporaryVariable2() {
    }

    public double getDistanceTravelled (int time) {
        double result;
        double acc = primaryForce / mass;
        int primaryTime = Math.min(time, delay);
        result = 0.5 * acc * primaryTime * primaryTime;
        int secondaryTime = time - delay;

        if (secondaryTime > 0) {
            double primaryVel = acc * delay;
            acc = (primaryForce + secondaryForce) / mass;
            result += primaryVel * secondaryTime + 0.5 * acc *
            secondaryTime * secondaryTime;
        }
        return result;
    }
}
