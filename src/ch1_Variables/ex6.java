package ch1_Variables;

import java.util.Scanner;

public class ex6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj 1 liczbę:");
        int first = scanner.nextInt();
        System.out.println("Podaj 2 liczbę:");
        int second = scanner.nextInt();


        if (first > second) {
            System.out.println("1 liczba jest większa niz 2");
        } else if (first < second) {
            System.out.println("1 liczba jest mniejsza niz 2");
        } else {
            System.out.println("liczby są równe");
        }


    }
}
