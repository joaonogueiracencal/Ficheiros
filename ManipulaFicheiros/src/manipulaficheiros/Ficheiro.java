package manipulaficheiros;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

class Ficheiro {

    static void criaFicheiro() {
        String nome;
        System.out.println("\n\nInsira o nome do ficheiro a criar");        
        nome = ManipulaFicheiros.ler.nextLine();
        nome = ManipulaFicheiros.ler.next();
        File ficheiro = new File(nome);
        if(!ficheiro.exists()){
            try {
                ficheiro.createNewFile();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        System.out.println("\n");
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
