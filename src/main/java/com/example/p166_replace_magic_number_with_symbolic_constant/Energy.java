package com.example.p166_replace_magic_number_with_symbolic_constant;

public class Energy {

    public static void main(String[] args) {
        System.out.println("---- Potential Energy ---");
        System.out.println("result: " +
            new Energy().potentialEnergy(100, 100));
    }

    double potentialEnergy(double mass, double height) {
        return mass * 9.81 * height;
    }
}
