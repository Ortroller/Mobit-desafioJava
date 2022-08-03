package br.com.mobitbrasil.ped.q5;

public class SomaRecursiva {

    /**
     * Realizar a soma de forma recursiva de todos valores numericos entre 1 e o valor informado.
     *
     * @param valor
     *
     * @return
     */
    public static long somar(int valor){
        // throw new UnsupportedOperationException();

        if(valor == 1){
            return 1;
        }

        return valor + somar(valor-1);
    }

}
