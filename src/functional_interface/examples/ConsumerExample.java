package functional_interface.examples;


import java.util.Arrays;
import java.util.List;

/**
 * Representa uma operação que aceita um argumento do tipo T e não retorna nenhum resultado.
 * É utilizada principalmente para realizar ações, ou efeitos colaterais nos elementos do Stream sem modificar, ou
 * retornar um valor.
 */

public class ConsumerExample{
    public static void main(String[] args) {
        //Criar uma lista de números inteiros
    List<Integer> numeros=Arrays.asList(1,2,3,4,5);

     // Usar o Consumer com expressão lambda para imprimir números pares
        numeros.stream()
        .filter(n-> n % 2 == 0)
        .forEach(n -> System.out.println(n));
    }


 }