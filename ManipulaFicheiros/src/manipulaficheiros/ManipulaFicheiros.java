package manipulaficheiros;

import java.util.Scanner;


public class ManipulaFicheiros {
    public static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        int op;
        do{
            System.out.println("1 - Criar ficheiro");
            System.out.println("2 - Verifica se ficheiro existe");
            System.out.println("3 - Escrever em ficheiro mantendo dados caso exista");
            System.out.println("4 - Escrever um novo ficheiro");
            System.out.println("5 - Ler um ficheiro");
            System.out.println("6 - Mostrar lista de ficheiros");
            System.out.println("0 - Sair");
            System.out.println("Selecione a opção pretendida");
            op=ler.nextInt();
            switch(op){
                case 1: Ficheiro.criaFicheiro();break;
                case 2: Ficheiro.verificaSeExiste(); break;
                case 3: Ficheiro.escreNoFinalFicheiro(); break;
                case 4: Ficheiro.escreveFicheiroNovo(); break;
                case 5: Ficheiro.mostraConteudo(); break;
                case 6: Ficheiro.mostraListaFicheiros(); break;
                case 0: break;
            }
        }while(op!=0);
    }
    
}
