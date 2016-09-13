package Aula06;
public class main{
    public static void main(String[] args) {
        int opc=0;
            Bliblioteca minhaBliblioteca = new Bliblioteca();

            do {
                switch (opc)
                {
                    case 1:
                    {
                        minhaBliblioteca.add();
                        break;
                    }
                    case 2:
                    {

                        break;
                    }
                }
            }while (opc!=99);

    }
}
