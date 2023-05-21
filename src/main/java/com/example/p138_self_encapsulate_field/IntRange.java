package com.example.p138_self_encapsulate_field;

public class IntRange {
    private int low;
    private int high;

    public static void main(String[] args) {
        System.out.println("Check if 3 is included between 2 and 4");
        IntRange range = new IntRange(3, 4);

        System.out.println("result: " + range.includes(3));
    }

    public IntRange(int low, int high) {
        this.low = low;
        this.high = high;
    }

    private boolean includes(int arg) {
        return low <= arg && arg <= high;
    }

    void grow(int factor) {
        this.high = high * factor;
    }
}
