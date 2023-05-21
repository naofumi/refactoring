package com.example.p167_encapsulate_field;

public class EncapsulateField {
    public String name;

    public static void main(String[] args) {
        EncapsulateField instance = new EncapsulateField();
        System.out.println("name: " + instance.name);
    }

    public EncapsulateField() {
        this.name = "Pikachu";
    }
}
