package Aula06;
import java.util.Scanner;

public class Livro {
    String titulo;
    int nPag;
    int nExemplares;
    Editora editora;
    Autor autor;
        public void ler(){
            Scanner tc = new Scanner(System.in);
            System.out.println("Digite Titulo");
            this.titulo=tc.next();
            System.out.println("Digite nPag");
            this.nPag=tc.nextInt();
            System.out.println("Digite nº Exemplare");
            this.nExemplares=tc.nextInt();

            this.autor = new Autor();
            autor.ler();
            this.editora = new Editora();
            this.editora.ler();
        }
        public void mostrar(){
            System.out.println("Informe Titulo:"+this.titulo);
            System.out.println("Numeros de Paginas:"+nPag);
            System.out.println("Numeros de Exemplares:"+nExemplares);

            this.autor.mostrar();
            this.editora.mostrar();

        }
}
