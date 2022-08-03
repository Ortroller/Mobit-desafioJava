package br.com.mobitbrasil.ped.q7;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class ClassificadorTest {

    @Test
    public void test(){

        assertEquals(33, Classificador.contarPalavras("agrega"));
        assertEquals(101, Classificador.contarPalavras("necessidade"));
        assertEquals(34, Classificador.contarPalavras("modos"));
        assertNotEquals(0, Classificador.contarPalavras("preferenciais"));
        
    }
}
