package com.company;

public class Main {

    public static void main(String[] args) {
	   float earthWeight;
       float marsWeight;
       double marsWeightInDouble;
       int marsWeightInInt;

       earthWeight = 53;
       marsWeight = (earthWeight + 0.38F);
       System.out.println(earthWeight + "kg on Earth is " + marsWeight + "kg on Mars");

       marsWeightInDouble = marsWeight;
       System.out.println("kg on mars converted to double" + marsWeightInDouble);

       System.out.printf("Kg on Mars displayed to four decimal places: %.4f %n", marsWeightInDouble);

       marsWeightInInt = (int)marsWeightInDouble;
       System.out.println("kg on mars when changed to integer" + marsWeightInInt);

       char c = (char)marsWeightInInt;
       System.out.println("The ASCII table equivalent of marsWeightInInt: " + c);
       int exampleOfMathOnChar = c * c;
       System.out.println("An example of a mathematical operation on the char type: "+ exampleOfMathOnChar);

    }
}
