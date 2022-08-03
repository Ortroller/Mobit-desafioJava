package br.com.mobitbrasil.ped.q4;

public class Anagrama {

    /**
     * Checar se dois textos são anagramas
     *
     * @param a - Primeiro texto
     * @param b - Segundo texto
     *
     * @return
     */
    public static boolean checarAnagramas(String a, String b){
        // throw new UnsupportedOperationException();

        a = a.toLowerCase();
        b = b.toLowerCase();

        if(a.length() != b.length()) return false; // Não é anagrama se nao tiver o mesmo tamanho
       
        for(int i=0; i < a.length(); i++){
            if(b.indexOf(a.charAt(i)) < 0 ) return false;
        }

        return true;

    }
}
