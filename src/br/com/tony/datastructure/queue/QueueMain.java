package br.com.tony.datastructure.queue;

public class QueueMain {
    public static void main(String[] args) {
        Queue<String> queue = new Queue<>(String.class);
        queue.push("PRIMEIRO A ENTRAR");
        queue.push("SEGUNDO A ENTRAR");
        queue.push("TERCEIRO A ENTRAR");
        queue.push("QUARTO A ENTRAR");
        queue.push("QUINTO A ENTRAR");
        System.out.println(queue);
        System.out.println("Removi: " + queue.pop());
        System.out.println("Removi: " + queue.pop());
        System.out.println("Removi: " + queue.pop());
        System.out.println(queue);
        queue.push("SEXTO A ENTRAR");
        queue.push("SÉTIMO A ENTRAR");
        System.out.println(queue);
        System.out.println("Removi: " + queue.pop());
        System.out.println("Removi: " + queue.pop());
        System.out.println("Removi: " + queue.pop());
        System.out.println("Removi: " + queue.pop());
        System.out.println(queue);
    }
}
