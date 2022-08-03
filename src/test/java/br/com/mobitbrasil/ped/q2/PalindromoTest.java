package br.com.mobitbrasil.ped.q2;

import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PalindromoTest {

    @Test
    public void test(){
        assertTrue(Palindromo.checarPalindromo("amor e roma"));
        assertTrue(Palindromo.checarPalindromo("ovo"));
        assertTrue(Palindromo.checarPalindromo("Anotaram a data da maratona"));
        assertTrue(Palindromo.checarPalindromo("O lobo ama o bolo"));
        assertFalse(Palindromo.checarPalindromo("O cachorro forte"));
        assertFalse(Palindromo.checarPalindromo("Amora"));
        assertFalse(Palindromo.checarPalindromo("De todos eu so vi um"));
        assertFalse(Palindromo.checarPalindromo("ov"));
        assertFalse(Palindromo.checarPalindromo("So sei que nada sei"));

    }
}
