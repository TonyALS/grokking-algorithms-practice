package br.com.tony.datastructure.stack;

public class StackMain {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(Integer.class);
        stack.push(1);
        stack.push(100);
        System.out.println(stack);
        System.out.println("Executando remoção");
        System.out.println("Item removido: " + stack.pop());
        System.out.println(stack);
    }
}
