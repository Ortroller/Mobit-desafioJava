package br.com.mobitbrasil.ped.q7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Classificador {

    /**
     * Verificar a quantidade de ocorrências de uma palavra em um arquivo texto.
     *
     * Arquivo: palavras.txt em src/main/resources/
     *
     * @param palavra - Palavra para pesquisa
     *
     * @return
     */
    public static long contarPalavras(String palavra){
        // throw new UnsupportedOperationException();
        Scanner reader;
        File words;

        try{
            words = new File("src/main/resources/palavras.txt");
            reader = new Scanner(words);
        }catch(FileNotFoundException ex){
            return -1;
        }

        String nextWord = null;
        long counter = 0;
        
        while(reader.hasNext()){

            nextWord = reader.next();
            nextWord.replace(".", "");
            nextWord.replace(",", "");
            nextWord.toLowerCase(); 
            
            // System.out.println(nextWord);
            // new Scanner(System.in).nextLine();

            if(nextWord.contains(palavra.toLowerCase())){
                counter ++;
            }

        }

        reader.close();
        return counter;

    }

}
