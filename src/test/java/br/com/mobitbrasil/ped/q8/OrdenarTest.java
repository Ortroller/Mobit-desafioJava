package br.com.mobitbrasil.ped.q8;

import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class OrdenarTest {

    @Test
    public void test(){

        List<Pessoa> listaComp = new ArrayList<Pessoa>(); // lista ordenada
        List<Pessoa> listaToComp = new ArrayList<Pessoa>(); // Lista nao ordenada

        Pessoa p0 = new Pessoa(4);
        Pessoa p1 = new Pessoa(13);
        Pessoa p2 = new Pessoa(23);
        Pessoa p3 = new Pessoa(35);
        Pessoa p4 = new Pessoa(48);
        Pessoa p5 = new Pessoa(59);

        listaComp.add(p0);
        listaComp.add(p1);
        listaComp.add(p2);
        listaComp.add(p3);
        listaComp.add(p4);
        listaComp.add(p5);
        
        listaToComp.add(p1);
        listaToComp.add(p3);
        listaToComp.add(p0);
        listaToComp.add(p5);
        listaToComp.add(p4);
        listaToComp.add(p2);

        List<Pessoa> ordenated = Ordenar.ordenar(listaComp); // Ordenando

        assertArrayEquals(listaComp.toArray(), ordenated.toArray());

    }

}
