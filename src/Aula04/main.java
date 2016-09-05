package Aula04;

/**
 * Created by Thalison Bauer on 04/09/2016.
 */
public class main {
    public static void main(String[] args) {
        //1 -   Um método que leia, valide e retorne um char “s” ou “n” ;
        String Resposta = validacao.exer_1();
        System.out.println(Resposta);

        //2-	Um método que leia, valide e retorne um inteiro
        int num = validacao.exer_2();
        System.out.println(num);

        //3-	Um método que leia, valide e retorne um double
        double num2 = validacao.exer_3();
        System.out.println(num2);
        //4-	Um método que leia, valide e retorne um float
        float num3 = validacao.exer_4();
        System.out.println(num3);
        //5-	Um método que leia, valide e retorne uma string
        String num4 = validacao.exer_5();
        System.out.println(num4);
        //6-	Um método que leia, valide e retorne uma String que possuam mais de 3 caracteres
        String num5 = validacao.exer_6();
        System.out.println(num5);
        //7-	Um método que leia, valide e retorne uma String que possuam mais de um número especificado de caracteres
        String num6 = validacao.exer_7();
        System.out.println(num6);

    }
}
