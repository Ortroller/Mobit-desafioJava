package br.com.mobitbrasil.ped.q1;

public class Triangulo {

    /**
     * Validar triangulo
     *
     * @param a - Lado a
     * @param b - Lado b
     * @param c - Lado c
     *
     * @return
     */
    public static boolean checarTriangulo(int a, int b, int c){
        
        if(a < (b + c)){
            if(b < (a + c)){
                if(c < (b + a)){

                    return true; // É um triângulo

                }
            }
        }

        return false; // Não é um triângulo
    }
}
