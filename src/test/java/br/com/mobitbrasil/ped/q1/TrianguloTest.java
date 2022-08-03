package br.com.mobitbrasil.ped.q1;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.*;

public class TrianguloTest {

    @Test
    public void test(){
        assertTrue(Triangulo.checarTriangulo(5, 9, 10));
        assertTrue(Triangulo.checarTriangulo(4, 3, 6));
        assertTrue(Triangulo.checarTriangulo(9, 5, 5));
        assertFalse(Triangulo.checarTriangulo(2, 7, 15));
        assertFalse(Triangulo.checarTriangulo(20, 5, 15));
    }
}
