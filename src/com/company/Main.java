package com.company;

public class Main {

    public static void main(String[] args) {

   /*     int value = 3;
        if (value == 1) {
            System.out.println("Value is 1");
        } else if (value == 2) {
            System.out.println("The value is 2");
        } else {
            System.out.println("The value is not one or two");
        }
    */

        int switchValue = 4;

        switch (switchValue) {
            case 1:
                System.out.println("Value is 1");
                break;
            case 2:
                    System.out.println("Value is 2");
                    break;
            case 3:case 4:case 5:
                System.out.println("The value is 3, 4 or 5");
                System.out.println("It was actually a " + switchValue);
                break;

            default:
                System.out.println("The value is not 1 or 2");
                break;
        }

        char myLetter = 'J';
        switch (myLetter) {
            case 'A':
                System.out.println("The letter is A");
                break;
            case 'B':
                System.out.println("The letter is B");
                break;
            case 'C':
                System.out.println("The letter is C");
                break;
            case 'D':
                System.out.println("The letter is D");
                break;
            case 'E':
                System.out.println("The letter is E");
                break;
            default:
                System.out.println("You didn't type A, B, C, D or E, what you actually type was " + myLetter);
                break;
        }
    }
}
