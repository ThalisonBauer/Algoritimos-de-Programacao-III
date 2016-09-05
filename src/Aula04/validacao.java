package Aula04;
import java.util.Scanner;
    public class validacao {
        public static String exer_1()
        {
            Scanner tc = new Scanner(System.in);
            String opcao;
            int cont=1;
            do {
                System.out.println("S-Sim | N-Não");
                opcao = tc.next();
                opcao = opcao.toLowerCase();
                if(opcao.equals("s") || opcao.equals("n"))
                    cont=2;
            }while(cont==1);
            return opcao;
        }
        public static int exer_2 ()
        {
            Scanner tc = new Scanner(System.in);
            String num;
            int conv;
            do{
                System.out.println("Informe um numero");
                num = tc.next();
                if(!num.matches("^[0-9]*$")){
                    num = "a";
                }
            }while(num=="a");
            conv = Integer.parseInt(num);
            return conv;
        }
        public static double exer_3 ()
        {
            Scanner tc = new Scanner(System.in);
            String num;
            double conv;
            do{
                System.out.println("Informe um Double");
                num = tc.next();
                if(!num.matches("^[0-9]*$")){
                    num = "a";
                }
            }while(num=="a");
            conv = Double.parseDouble(num);
            return conv;
        }
        public static float exer_4 ()
        {
            Scanner tc = new Scanner(System.in);
            String num;
            float conv;
            do{
                System.out.println("Informe um Float");
                num = tc.next();
                if(!num.matches("^[0-9]*$")){
                    num = "a";
                }
            }while(num=="a");
            conv = Float.parseFloat(num);
            return conv;
        }
        public static String exer_5()
        {
            Scanner tc = new Scanner(System.in);
            String letra="1";
            do {
                System.out.println("Informe uma palavra");
                letra = tc.next();
                if (!letra.matches("^[A-Za-z]*$"))
                {
                    letra="1";
                }
                else
                    break;
            }while(letra=="1");
            return letra;
        }
        public static String exer_6()
        {
            Scanner tc = new Scanner(System.in);
            String letra;
            int o=0;
            do {
                System.out.println("Palavra acima de 3 Caracter");
                letra = tc.next();
                if (!letra.matches("^[A-Za-z]*$")&& letra.length() <3)
                {
                    o=1;
                }
            }while(o==1);
            return letra;
        }
        public static String exer_7()
        {
            Scanner tc = new Scanner(System.in);
            String letra = "1";
            char  c,d;
            int i =0,j=0, cont=0;
            do {
                System.out.println("Paravra Repetida");
                letra = tc.next();
                if (!letra.matches("^[A-Za-z]*$"))
                {
                    letra = "1";
                }
                else
                {
                    for( i=0;i<letra.length();i++)
                    {
                        c = letra.charAt(i);
                        for(j=0;j<letra.length();j++)
                        {
                            d = letra.charAt(j);
                            if(c==d){
                                cont++;
                            }
                        }
                    }
                    if (cont>1)
                        break;
                }
                System.out.println(cont);
            }while(letra=="1");
            return letra;
        }

    }
