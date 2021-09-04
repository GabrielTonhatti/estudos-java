package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        // Offer e Add -> adicionam elementos na fila
        // A diferença é o comportamento ocorre quando a fila está cheia
        fila.add("Ana");    // Retorna false
        fila.offer("Bia"); // Lança uma exceção
        fila.add("Carlos");
        fila.offer("Daniel");
        fila.add("Rafaela");
        fila.offer("Gui");

        // Peek e element -> Obter o próximo elementos da fila (sem remover)
        // A diferença é o comportamento ocorre quando a fila está vazia
        System.out.println(fila.peek()); // Retorna null
        System.out.println(fila.peek());
        System.out.println(fila.element()); // Lança uma exceção
        System.out.println(fila.element());

        // Poll e Remove -> Obter o próximo elemento da fila (e remove!)
        // A diferença é o comportamento ocorre quando a fila está vazia
        System.out.println(fila.poll()); // retorna false
        System.out.println(fila.remove()); // Lança uma exceção
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.remove());

        //  fila.size();
        // fila.clear();
        // fila.isEmpty(
        // fila.contains(...);

    }
}
