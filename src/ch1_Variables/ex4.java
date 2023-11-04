package ch1_Variables;

import java.util.Scanner;

public class ex4 {


    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Witaj jak masz na imie?");

        String name= scanner.nextLine();
        System.out.println("Witaj "+name);
    }
}
