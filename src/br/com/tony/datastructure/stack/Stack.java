package br.com.tony.datastructure.stack;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * PILHA
 * LIFO (Last In First Out): O ultimo item a entrar na pilha é o primeiro a sair.
 * Pode ser conhecida tbem como FILO (First In Last Out): Primeiro a entrar é
 * o último a sair.
 * @author tony
 */
public class Stack<E> {
    private static final String REMOVE_ITEM_ERROR = "Você não pode remover itens de uma pilha vazia.";
    private static final String FULL_STACK_ERROR = "A pilha atingiu seu limite de capacidade";
    private static final String PRIMITIVE_NOT_ALLOWED = "Não é possível criar a pilha com tipos primitivos";
    private static final int MAXIMUM_LENGTH = 10;
    private static final int INITIAL_LENGTH = 0;
    private int length = INITIAL_LENGTH;
    private final E[] VECTOR;

    @SuppressWarnings("unchecked")
    public Stack(Class<E> type) {
        if (type.isPrimitive()) {
            throw new IllegalArgumentException(PRIMITIVE_NOT_ALLOWED);
        }
        VECTOR = (E[]) Array.newInstance(type, MAXIMUM_LENGTH);
    }

    public boolean isFull() {
        return length == MAXIMUM_LENGTH;
    }

    public boolean isEmpty() {
        return length == INITIAL_LENGTH;
    }

    public void push(E element) {
        if (isFull()) {
            throw new IllegalArgumentException(FULL_STACK_ERROR);
        }
        VECTOR[length] = element;
        length++;
    }

    public E pop() {
        if (isEmpty()) {
            throw new IllegalArgumentException(REMOVE_ITEM_ERROR);
        }
        E removed = VECTOR[length - 1];
        VECTOR[length - 1] = null;
        length--;
        return removed;
    }

    @Override
    public String toString() {
        return "Stack{" +
                "length=" + length +
                ", stack=" + Arrays.toString(VECTOR) +
                '}';
    }
}
