package br.com.mobitbrasil.ped.q3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;


public class PrimoTest {

    @Test
    public void test(){
        assertEquals(7, Primo.proximoPrimo(5));
        assertEquals(499, Primo.proximoPrimo(492));
        assertEquals(2309, Primo.proximoPrimo(2304));
        assertEquals(967, Primo.proximoPrimo(958));
        assertNotEquals(1002, Primo.proximoPrimo(1000));
        assertNotEquals(1055, Primo.proximoPrimo(1060));
    }
    
}
