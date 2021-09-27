package com.company;

import java.util.Scanner;

public class GallonsToLitres {
    public static void main(String[] args) {
        final float GAL2LT = 4.0f;
        Scanner input = new Scanner(System.in);
        float inputGallons = 0.0f;
        float resultLiters = 0.0f;
        System.out.println("Gallons to liter converter: ");
        System.out.println("How many Gallons??");
        inputGallons = input.nextFloat();
        resultLiters = inputGallons * GAL2LT;
        System.out.print("Converted: " + inputGallons + " Gal" + " = ");
        System.out.println(resultLiters + " Litre");
    }
}
