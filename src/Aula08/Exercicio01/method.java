package Aula08.Exercicio01;
public class method {

    public static boolean comparaString(String string1, String string2)
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
}
