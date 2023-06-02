package com.example.p230_replace_parameter_with_explicit_methods;

public class ReplaceParameterWithExplicitMethods {
    private int _height;
    private int _width;

    public static void main(String[] args) {
        ReplaceParameterWithExplicitMethods instance = new ReplaceParameterWithExplicitMethods();
        instance.setValue("height", 10);
        instance.setValue("width", 20);

        instance.printHeightAndWidth();
    }

    void setValue (String name, int value) { 
        if (name.equals("height"))
            _height = value;
        if (name.equals("width"))
            _width = value; 
    }

    void printHeightAndWidth() {
        System.out.println("Height: " + _height );
        System.out.println("Width: " + _width );
    }
}
