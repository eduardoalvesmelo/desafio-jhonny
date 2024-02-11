package org.example;

import java.util.*;

public class testes {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<DadosEntrada> list = new ArrayList<>();

        String linha = sc.nextLine();
        sc.nextLine();
        String[] stringListaObjetos = linha.split("]");
//         elementos = stringListaObjetos.split(",");

        System.out.println();
        for (String elemento : stringListaObjetos) {
            System.out.println(elemento);
        }


    }
}
