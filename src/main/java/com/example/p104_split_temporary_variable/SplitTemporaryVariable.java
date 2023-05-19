package com.example.p104_split_temporary_variable;

public class SplitTemporaryVariable {
    double height;
    double width;
    public static void main(String[] args) {
        new SplitTemporaryVariable(10.0, 50.0).printTwoAreas();
    }

    public SplitTemporaryVariable(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public void printTwoAreas() {
        double temp = 2 * (height + width);
        System.out.println (temp);
        temp = height * width;
        System.out.println (temp);
    }
}
