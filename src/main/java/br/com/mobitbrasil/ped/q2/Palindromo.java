package br.com.mobitbrasil.ped.q2;

public class Palindromo {

    /**
     * Checar palindromo
     *
     * @param texto - Texto palindromo
     *
     * @return
     */
    public static boolean checarPalindromo(String texto){
        // throw new UnsupportedOperationException();
        
        if(texto.isEmpty()){ // Texto vazio é palíndromo
            return true;
        }

        // Formatando o texto
        texto = texto.replace(" ", "");
        texto = texto.toLowerCase();

        int textSize = texto.length()-1; 

        for(int i=0; i < (textSize/2)+1; i++){

            if(texto.charAt(i) != texto.charAt((textSize)-i)){ 

                return false;
                
            }
        }

        return true;
    }

}
