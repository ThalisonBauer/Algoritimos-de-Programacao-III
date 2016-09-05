package Aula03;

import jdk.internal.dynalink.beans.StaticClass;

import java.util.Scanner;

public class method {
 public static int cadastrarFunc(int num)
    {
        Scanner tc = new Scanner(System.in);
        Funcionario referencia = new Funcionario();
        int k=0;
        for(int j=0; j<5;j++)
        {
            k++;
            System.out.println("Nome do Funcionario: ");
            referencia.nome[j] = tc.next();
            System.out.println("Informe o Departamento:");
            referencia.departamento[j] = tc.next();
            System.out.println("Informe o Salario:");
            referencia.salario[j] = tc.nextDouble();
            System.out.println("Informe Idade:");
            referencia.idade[j] = tc.nextInt();
            break;
        }
        return k;
    }
    public static void listFunc()
    {
       Funcionario referencia = new Funcionario();
        for(int j=0;j<10;j++)
        {
            System.out.println(referencia.nome[j]);
        }
    }




}
