package br.com.mobitbrasil.ped.q3;

public class Primo {

    /**
     * Retornar o proximo numero primo após um valor numerico.
     *
     * @param numero - Valor numerico
     *
     * @return
     */
    public static long proximoPrimo(long numero){
    
        if(numero <= 1){
            return 2;
        }

        long nextNumber = numero;
        boolean notFound = true;

        while(notFound){
            nextNumber ++;
            notFound = !isPrime(nextNumber);
        }
        return nextNumber;
    }


    public static boolean isPrime(long nb){
        for(int i = 2; i < nb; i++){
            if (nb%i == 0) return false;
        }
        return true;
    }
}
