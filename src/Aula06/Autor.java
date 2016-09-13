package Aula06;
import java.util.Scanner;
public class Autor {
    String nomeAutor;
    String emailAutor;
    String enderecoAutor;

    public void ler(){
        Scanner tc = new Scanner(System.in);
        System.out.println("Digite Nome");
        this.nomeAutor=tc.next();
        System.out.println("Digite Email");
        this.emailAutor=tc.next();
        System.out.println("Endereço");
        this.enderecoAutor=tc.next();
    }
    public void mostrar(){
        System.out.println("Nome Autor"+this.nomeAutor);
        System.out.println("Nome Autor"+this.emailAutor);
        System.out.println("Nome Autor"+this.enderecoAutor);
    }
}
