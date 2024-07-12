package functional_interface.examples;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Representa uma função que aceita um argumento do tipo T e retorna um valor booleano (verdadeiro oufalso).
 * É comumente usada para filtrar os elementos do Stream com base em alguma condição.
 */

public class PredicateExample {
    public static void main(String[] args) {
    // Criar uma lista de palavras
    List<String> palavras = Arrays.asList("Java", "Python", "C++", "C#","go","javascript","ruby");

    // Criar um Predicate que verifica se a palavra tem mais de 5 caracteres
    Predicate<String> predicate = (s) -> s.length() > 5;
        
    
     // Usar o Stream para filtrar as palavras com mais de 5 caracteres e, em seguida,
    // imprimir cada palavra que passou no filtro
    palavras.stream() 
    .filter(predicate)
    .forEach(System.out::println);
  
    }
}
