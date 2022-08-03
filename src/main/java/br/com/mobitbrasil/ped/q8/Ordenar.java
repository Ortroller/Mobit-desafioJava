package br.com.mobitbrasil.ped.q8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Ordenar {

    /**
     * Realizar a ordenação da listagem de pessoas utilizando o atributo idade de @Pessoa
     *
     * @param pessoas - Lista de pessoas
     *
     * @return
     */
    public static List<Pessoa> ordenar(List<Pessoa> pessoas){
        List<Pessoa> ordenated = new ArrayList<Pessoa>();

        ordenated.addAll(pessoas); // Nao modifica a lista de entrada

        ordenated.sort(Comparator.comparing(Pessoa::getIdade));

        return ordenated;
    }

}
