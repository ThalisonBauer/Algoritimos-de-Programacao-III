package Aula03;

import java.util.Scanner;

class Funcionario {
    String nome;
    String departamento;
    double salario;
    int idade;
    double total;
    public  int cadastrarFunc(Funcionario vetor[],int num)
    {
        Scanner tc = new Scanner(System.in);

            System.out.println("Nome do Funcionario: ");
            this.nome= tc.next();
            System.out.println("Informe o Departamento:");
            this.departamento = tc.next();
            System.out.println("Informe o Salario:");
            this.salario = tc.nextDouble();
            System.out.println("Informe Idade:");
            this.idade = tc.nextInt();
        vetor[num]=this;
        num++;
        return num;
    }
    public void listFunc(Funcionario vetor[],int num)
    {
        for(int j=0;j<num;j++)
        {
            mostrar(vetor[j]);
        }
    }
    public void mostrar(Funcionario funcionario)
    {
        System.out.println(funcionario.nome);
        System.out.println(funcionario.departamento);
        System.out.println(funcionario.salario);
        System.out.println(funcionario.idade);
    }
    public int remover(Funcionario vetor[],int num)
    {
        Scanner tc = new Scanner(System.in);
        String busca = tc.next();
        int remov=-1;
            for(int i=0;i<num;i++)
            {
                if(busca.equalsIgnoreCase(vetor[i].nome))
                {
                    remov=i;
                }
            }
            if(remov==-1)
            {
                System.out.println("Não Encontrado");
            }else{
                for (int i=remov;remov<num;remov++)
                {
                    vetor[remov] = vetor[remov+1];
                }
                num--;
            }
            return num;
    }
}

