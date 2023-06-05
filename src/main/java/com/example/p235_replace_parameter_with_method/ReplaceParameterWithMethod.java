package com.example.p235_replace_parameter_with_method;

public class ReplaceParameterWithMethod {
    private int _quantity;
    private int _itemPrice;

    public static void main(String[] args) {
        ReplaceParameterWithMethod instance = new ReplaceParameterWithMethod(10, 1_200);
        System.out.println(instance.getPrice());
    }

    public ReplaceParameterWithMethod(int quantity, int itemPrice) {
        this._quantity = quantity;
        this._itemPrice = itemPrice;
    }

    public double getPrice() {
        int basePrice = _quantity * _itemPrice;
        int discountLevel;
        if (_quantity > 100) {
            discountLevel = 2;
        } else {
            discountLevel = 1;
        }
        double finalPrice = discountedPrice (basePrice, discountLevel);
        
        return finalPrice;
    }
    
    private double discountedPrice (int basePrice, int discountLevel) {
        if (discountLevel == 2) {
            return basePrice * 0.1;
        } else {
            return basePrice * 0.05;
        }
    }
        
}
