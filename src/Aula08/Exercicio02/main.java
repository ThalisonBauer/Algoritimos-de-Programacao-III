package Aula08.Exercicio02;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        canil meuCanil = new canil();
    int rps =0;
        System.out.println("1:ADD |2:REM |3:LIST |4:EXEBIR |5:SAIR");
        rps = meuCanil.opc();
        switch (rps)
        {
            case 1:{
                meuCanil.cadastrarCao();
            }
            case 2:{
                int opc = 0;
                do {
                    System.out.println("1:SEMELHANTE |2: NOME IGUAL |3:PEDIGREE |4:SAIR");
                    opc = meuCanil.opc();
                    switch (opc) {
                        case 1:
                            meuCanil.removerCaoSemelhante();
                            break;
                        case 2:
                            meuCanil.removerCaoIgual();
                            break;
                        case 3:
                            meuCanil.removerPedigree();
                            break;
                        case 4:
                            break;
                    }
                } while (opc == 4);
                break;
            }
            case 3: {
                int opc = 0;
                do {
                    System.out.println("1:LIST POR RAÇA | 2: POR NOME SEMELHANTE | 3: LIST PEDIGREE");
                    opc = meuCanil.opc();
                    switch (opc)
                    {
                        case 1:
                        {
                            meuCanil.listRaca();
                            break;
                        }
                        case 2:
                        {
                            meuCanil.listRacaSemelhante();
                            break;
                        }
                        case 3:
                        {
                            meuCanil.listcaoPedigree();
                            break;
                        }
                        case 4:
                            break;
                    }
                }while(opc==4);
            }
            case 4:
            {
                int opc = 0 ;
                do{
                    System.out.println("1:NºCAES | 2: Nº FEMEAS | 3: Nº MACHOS | 4: TOTAL PREMIAÇÕES | 5: SAIR");
                    opc = meuCanil.opc();
                    switch (opc)
                    {
                        case 1:
                        {
                            meuCanil.nCadastrados();
                            break;
                        }
                        case 2:
                        {
                            meuCanil.nFemeas();
                            break;
                        }
                        case 3:
                        {
                            meuCanil.nMachos();
                            break;
                        }
                        case 4:
                        {
                            meuCanil.nPremiacoes();
                            break;
                        }
                        case 5:
                            break;
                    }
                }while(opc ==5);
            }
        }
    }
}
