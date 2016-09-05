package Aula03;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int numero=1;
        int resposta=0;
        Scanner tc = new Scanner(System.in);
        Funcionario referencia = new Funcionario();
        do {
            System.out.println("[1:ADD][2:LIST][2:DEL][3:PRINT]");
            resposta = tc.nextInt();
            switch (resposta) {
                case 1:
                    numero = method.cadastrarFunc(numero);
                    break;
                case 2:
                    method.listFunc();
                    break;
            }
        }while (resposta!=0);

    }
}
