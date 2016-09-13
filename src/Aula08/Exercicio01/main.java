package Aula08.Exercicio01;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String palavra1,palavra2;
        Scanner tc = new Scanner(System.in);

        System.out.println("1ª PALAVRA");
        palavra1 = tc.next();
        System.out.println("2ª PALAVRA");
        palavra2 = tc.next();

        System.out.println(method.comparaString(palavra1, palavra2));


    }
}
