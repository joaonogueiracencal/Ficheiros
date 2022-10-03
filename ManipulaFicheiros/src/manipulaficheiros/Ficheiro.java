package manipulaficheiros;

import java.io.File;

class Ficheiro {

    static void criaFicheiro() {

    }

    static void verificaSeExiste() {

    }

    static void escreNoFinalFicheiro() {

    }

    static void escreveFicheiroNovo() {

    }

    static void mostraConteudo() {

    }

    static void mostraListaFicheiros() {
        File ficheiro = new File("C:\\Users\\jnogueira\\Desktop\\0816 - Java\\Ficheiros");
        File [] lista = ficheiro.listFiles();
        System.out.println("\n\n>>> Lista de Ficheiros <<<");
        for(int x=0;x<lista.length;x++){
            System.out.println(lista[x].getName());
        }
        System.out.println("\n");
       
    }
    
}
