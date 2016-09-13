package Aula06;

/**
 * Created by Thalison Bauer on 12/09/2016.
 */
public class Bliblioteca {
    public static int cont=0;
    public static Livro[] livros = new Livro[10];

    public void add(){
        Livro meuLivro = new Livro();
        meuLivro.ler();
        livros[cont] = meuLivro;
        cont++;
    }
}
