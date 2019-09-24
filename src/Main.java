import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("min lommeregner");
        Lommeregner lommeregner = new Lommeregner();
        System.out.println("hvad er 1 + 1 ?");
        System.out.println(lommeregner.sum(1, 1));
        System.out.println("hvad er 2 + 2 ");
        System.out.println(lommeregner.sum(2, 2));
        System.out.println("Hvad er 2 - 1");
        System.out.println(lommeregner.minus(2, 1));
        System.out.println("hvad er 2 * 2 ");
        System.out.println(lommeregner.multiplicere(2, 2 ));
        System.out.println("Hvad er 10 / 2 ?");
        System.out.println(lommeregner.division(10, 2 ));
        System.out.println("Her er en random metode, samt  tal :) ");
        System.out.println(lommeregner.secret(5, 3));

    }
}
