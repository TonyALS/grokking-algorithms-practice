package br.com.tony.datastructure.dynamicstack;

public class DynamicStackMain {
    public static void main(String[] args) {
        DynamicStack dynamicStack = new DynamicStack();
        dynamicStack.add("Primeiro elemento");
        dynamicStack.add("Segundo elemento");
        dynamicStack.add("Terceiro elemento");
        System.out.println(dynamicStack);

        dynamicStack.remove();
        dynamicStack.remove();
        System.out.println(dynamicStack);
    }
}
