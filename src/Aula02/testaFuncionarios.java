package Aula02;

/**
 * Created by Thalison Bauer on 04/09/2016.
 */
public class testaFuncionarios {
    public static void main(String[] args) {
        funcionarios_c referencia = new funcionarios_c();

        referencia.nomeFunc = "Luis";
        referencia.sobrenomeFunc = "Pedro";
        referencia.Salario = 400022;

        System.out.println(referencia.nomeFunc);
        System.out.println(referencia.sobrenomeFunc);
        System.out.println(referencia.Salario);
    }
}
