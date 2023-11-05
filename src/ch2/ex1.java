package ch2;

import java.util.Scanner;

public class ex1 {


    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Jaką masz przeglądarkę?");
        String name= scanner.nextLine();





        switch (name){
            case "chrome":
                System.out.println("wybrana przeglądarka: "+name);
                break;

            case "firefox":
                System.out.println("wybrana przeglądarka: "+name);
                break;

            default:
                System.out.println("przeglądarka nie jest wspierana "+name);
                break;
        }



    }
}
