package Aula08.Exercicio02;

import java.util.ArrayList;
import java.util.Scanner;

public class canil {
    ArrayList<Cao> listCaes = new ArrayList<>();
    Scanner tc = new Scanner(System.in);

    public  void cadastrarCao()
    {
        Cao cao = new Cao();
        cao.lerDados();
        if (listCaes.contains(cao)){
            System.out.println("Ja está cadastrado!");
        }else
        {
            listCaes.add(cao);
        }
    }
    public void removerCaoIgual()
    {
        Cao cao = new Cao();

        System.out.println("Informe Cao que deseja remover");
        cao.nome = tc.next().toLowerCase();
        if (listCaes.contains(cao)){
            listCaes.remove(cao);
            System.out.println("Cao removido com SUCESSO!!!!");
        }
    }
    public void removerCaoSemelhante()
    {
        Cao cao = new Cao();

        System.out.println("Informe Cao que deseja remover");
        cao.nome = tc.next().toLowerCase();
        for (int i =0;i<listCaes.size();i++)
        {
            if(cao.comparaCao(cao.nome,listCaes.get(i).nome))
            {
             listCaes.remove(i);
            }
        }
    }
    public  void removerPedigree() {
        System.out.println("Listar com ou sem pedigree [s-n]");
        char rps = tc.next().charAt(0);
        for (int i = 0; i < listCaes.size(); i++) {
            if (listCaes.get(i).pedigree == rps) {
                System.out.println(listCaes.get(i).nome);
            }
        }
        removerCaoIgual();
    }
    public void listRaca()
    {
        System.out.println("Informe Raça");
        String aux = tc.next();
        for(int i =0; i<listCaes.size();i++)
        {
            if(listCaes.get(i).raca.equalsIgnoreCase(aux))
            {
                listCaes.get(i).mostrar();
            }
        }
    }
    public void listRacaSemelhante()
    {
        Cao cao = new Cao();
        System.out.println("Informe Nome que deseja Listar");
        cao.nome = tc.next().toLowerCase();
        for (int i =0;i<listCaes.size();i++)
        {
            if(cao.comparaCao(cao.nome,listCaes.get(i).nome))
            {
                listCaes.get(i).mostrar();
            }
        }
    }
    public void listcaoPedigree()
    {
        Cao cao = new Cao();
        System.out.println("Listar com ou sem pedigree[s-n}");
        char aux = tc.next().charAt(0);
        for (int i =0;i<listCaes.size();i++)
        {
            if(listCaes.get(i).pedigree == aux)
            {
                listCaes.get(i).mostrar();
            }
        }
    }
    public void nCadastrados()
    {
        System.out.println(listCaes.size());
    }
    public void nFemeas()
    {
        int f = 0;
        for(int i = 0; i <listCaes.size();i++)
        {
            if(listCaes.get(i).sexo == 'f')
            {
                f++;
            }
        }
        System.out.println("Numeros TOTAL DE FEMEAS"+f);
    }
    public void nMachos(){
        int m =0;
        for(int i =0;i<listCaes.size();i++)
        {
            if(listCaes.get(i).sexo == 'm')
            {
                m++;
            }
        }
        System.out.println("Numeros TOTAL DE MACHOS"+m);
    }
    public void nPremiacoes(){
        int p =0;
        for(int i =0;i<listCaes.size();i++)
        {
            if(listCaes.get(i).sexo == 's')
            {
                p++;
            }
        }
        System.out.println("Numeros TOTAL DE PREMIAÇÕES"+p);
    }
}


