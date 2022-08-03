package br.com.mobitbrasil.ped.q4;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AnagramaTest {
    
    @Test
    public void test(){
        assertTrue(Anagrama.checarAnagramas("pato", "topa"));
        assertTrue(Anagrama.checarAnagramas("muro", "rumo"));
        assertTrue(Anagrama.checarAnagramas("carro", "corar"));
        assertTrue(Anagrama.checarAnagramas("players", "parsley"));
        assertTrue(Anagrama.checarAnagramas("elbow", "below"));
        assertFalse(Anagrama.checarAnagramas("lama", "rama"));
        assertFalse(Anagrama.checarAnagramas("gorila", "argila"));
    }
}
