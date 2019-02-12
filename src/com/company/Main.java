//package com.company;
//
//import java.util.Random;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//
//        Random rand = new Rand();
//        int secretNum = rand.nextInt(10) + 1;
//        Scanner Keyboard = new Scanner(System.out);
//
//        print("I have chosen a number between 1 and 10. Try to guess it.");
//
//        int guess;
//
//        do[
//        System.out.println("Your guess: ");
//        guess = Keyboard.next();
//
//        if (guess == secretNum) {
//            print("That's right! You're a good guesser.");
//            break;
//        } else {
//            print(That is incorrect.Guess again.);
//        }
//
//         ]while (guess != secretNum) ;
//
//    }
//}


package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner Keyboard = new Scanner(System.in);
        Random rand = new Random();
        int guess = 0;


        int secretNum = rand.nextInt(10) + 1;

        System.out.println("I have chosen a number between 1 and 10. Try to guess it.");

        do {
            System.out.println("Your guess: ");

            guess = Keyboard.nextInt();
        }while (guess != secretNum) ;


        if (guess == secretNum) {
            System.out.println("That's right! You're a good guesser.");
        } else {
            System.out.println("That is incorrect! Guess again.");
        }

    }
}
