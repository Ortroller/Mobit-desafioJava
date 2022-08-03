package br.com.mobitbrasil.ped.q5;

import static org.junit.Assert.*;

import org.junit.Test;

public class SomaRecursivaTest {
    
    @Test
    public void test(){
        assertEquals(55, SomaRecursiva.somar(10));
        assertEquals(5050, SomaRecursiva.somar(100));
        assertEquals(7260, SomaRecursiva.somar(120));
        assertEquals(299151, SomaRecursiva.somar(773));
        assertEquals(218130, SomaRecursiva.somar(660));
        assertEquals(24531, SomaRecursiva.somar(221));
        assertNotEquals(23, SomaRecursiva.somar(4));
        assertNotEquals(77, SomaRecursiva.somar(80));
    }
}
