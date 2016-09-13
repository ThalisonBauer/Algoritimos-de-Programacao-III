package Aula03;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        Funcionario[] vetor = new Funcionario[10];
        int numero=0;
        int resposta=0;

        do {
            System.out.println("[1:ADD][2:LIST][2:DEL][3:PRINT]");
            resposta = tc.nextInt();
            switch (resposta) {
                case 1:
                {
                    Funcionario funcionario = new Funcionario();
                    numero = funcionario.cadastrarFunc(vetor,numero);
                    break;
                }

                case 2:
                {
                    Funcionario funcionario = new Funcionario();
                    funcionario.listFunc(vetor,numero);
                    break;
                }
                case 3:
                {
                    Funcionario funcionario = new Funcionario();
                    funcionario.remover(vetor,numero);
                }
            }
        }while (resposta!=0);

    }
}
