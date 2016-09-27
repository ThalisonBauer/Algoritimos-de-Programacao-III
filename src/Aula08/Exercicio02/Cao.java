package Aula08.Exercicio02;
import java.util.Scanner;

public class Cao {
    String nome;
    String raca;
    int idade;
    char sexo;
    char pedigree;
    char premiacoes;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cao cao = (Cao) o;

        return nome != null ? nome.equals(cao.nome) : cao.nome == null;

    }

    public void lerDados()
    {
    int rps = 2;
        Scanner tc = new Scanner(System.in);
        do{
            System.out.println("Informe nome");
            this.nome = tc.next();
            if(!this.nome.matches("^[A-Za-z]*$"))
            {
                System.out.println("Informe somente letras!");
            }
            else
                break;
        }while(rps == 2);
        do {
            System.out.println("Informe Raça");
            this.raca = tc.next();
            if(!this.raca.matches("^[A-Za-z]*$"))
            {
                System.out.println("Informe somente letras!");
            }
            else
                break;
        }while(rps == 2);
        do {
            String aux;
            System.out.println("Informe idade");
            aux = tc.next();
            if(!aux.matches("^[0-9]*$"))
            {

                System.out.println("Informe somente numeros" );
            }
            else
                this.idade = Integer.parseInt(aux);
                break;
        }while(rps == 2);
        do {
            System.out.println("Informe sexo! [m-f]");
            this.sexo = tc.next().toLowerCase().charAt(0);
            if(this.sexo == 'm' || this.sexo == 'f')
            {
                break;
            }
        }while(rps ==2);
        do {
            System.out.println("Informe Pedigree! [s-n]");
            this.pedigree = tc.next().toLowerCase().charAt(0);
            if(this.pedigree == 's' || this.pedigree == 'n')
            {
                break;
            }
        }while(rps == 2);
        do {
            System.out.println("Contem Premiações?[s-n]");
            this.premiacoes = tc.next().toLowerCase().charAt(0);
            if(this.premiacoes == 's' || this.premiacoes == 'n')
            {
                break;
            }
        }while(rps==2);
    }
    public  boolean comparaCao(String string1, String string2)
    { int cont=0;
        for(int i=0;i<5;i++)
        {
            char nome = string1.charAt(i);
            char nome1 = string2.charAt(i);
            if(nome == nome1)
            {
                cont++;
            }
        }
        if(cont==5)
        {
            return true;
        }
        else {
            return false;
        }
    }
    public void mostrar(){
        System.out.println(this.nome);
        System.out.println(this.raca);
        System.out.println(this.idade);
        System.out.println(this.sexo);
        System.out.println(this.pedigree);

    }

}

