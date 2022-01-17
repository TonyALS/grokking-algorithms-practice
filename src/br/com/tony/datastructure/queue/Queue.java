package br.com.tony.datastructure.queue;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * FILAS
 * FIFO (First In First Out) -> Primeiro a entrar é o primeiro a sair. Tbem pode ser conhecida como
 * LILO (Last In Last Out) -> último a entrar, último a sair.
 * @author tony
 * */
public class Queue<E> {
    private static final String REMOVE_ITEM_ERROR = "Você não pode remover itens de uma fila vazia.";
    private static final String FULL_STACK_ERROR = "A fila atingiu seu limite de capacidade";
    private static final String PRIMITIVE_NOT_ALLOWED = "Não é possível criar a fila com tipos primitivos";
    private static final int MAXIMUM_LENGTH = 5;
    private static final int INITIAL_LENGTH = 0;
    private int countPush = INITIAL_LENGTH;
    private int countPop = INITIAL_LENGTH;
    private final E[] QUEUE;

    @SuppressWarnings("unchecked")
    public Queue(Class<E> tClass) {
        if (tClass.isPrimitive()) {
            throw new IllegalArgumentException(PRIMITIVE_NOT_ALLOWED);
        }
        QUEUE = (E[]) Array.newInstance(tClass, MAXIMUM_LENGTH);
    }

    /**
     * Lógica de adição:
     * O índice da adição é o resto da divisão do countPush por MAXIMUM_LENGTH.
     * Exemplo:
     * Dado que countPush é 0 e o MAXIMUM_LENGTH é 5, o resto da divisão de 0 por 5 é 0,
     * portanto, adiciona o conteúdo no índice 0 e incremente countPush em 1.
     * Depois, Dado que countPush é 1 e o MAXIMUM_LENGTH é 5, o resto da divisão de 1 por 5 é 1,
     * portanto, adiciona o conteúdo no índice 1 e incremente countPush em 1 e assim por diante.
     * */
    public void push(E element) {
        if (isFull()) {
            throw new IllegalArgumentException(FULL_STACK_ERROR);
        }
        int lastElement = countPush % MAXIMUM_LENGTH;
        QUEUE[lastElement] = element;
        countPush++;
    }

    /**
     * Lógica de remoção:
     * O índice da remoção é o resto da divisão do countPop por MAXIMUM_LENGTH.
     * Exemplo:
     * Dado que countPop é 0 e o MAXIMUM_LENGTH é 5, o resto da divisão de 0 por 5 é 0,
     * portanto, remove o conteúdo do índice 0 e incremente countPop em 1.
     * Em seguida, dado que countPop é 1 e o MAXIMUM_LENGTH é 5, o resto da divisão de 1 por 5 é 1,
     * portanto, remove o conteúdo do índice 1 e incrementa countPop em 1.
     * */
    public E pop() {
        if (isEmpty()) {
            throw new IllegalArgumentException(REMOVE_ITEM_ERROR);
        }
        int firstElement = countPop % MAXIMUM_LENGTH;
        E removed = QUEUE[firstElement];
        QUEUE[firstElement] = null;
        countPop++;
        return removed;
    }

    @Override
    public String toString() {
        return "Queue{" + Arrays.toString(QUEUE) + "}";
    }

    /**
     * Se o contador do countPop e do countPush forem iguais, quer dizer que a fila está
     * vazia.
     * Exemplo:
     * countPop == 0
     * countPush == 0
     * Ou ainda:
     * countPop == 5
     * countPush == 5
     * Motivo: toda vez que adiciono um elemento o countPush incrementa em 1 e toda vez que
     * removo um elemento o countPop incrementa em 1, logo, se os dois valores forem iguais
     * quer dizer que removi a mesma quantidade de elementos que adicionei.
     * */
    private boolean isEmpty() {
        return countPop == countPush;
    }

    /**
     * Se (countPush - countPop) for igual MAXIMUM_LENGTH quer dizer que a fila
     * está cheia.
     * Exemplo:
     * countPush == 5
     * countPop == 0
     * Motivo:
     * O contador do countPop só é incrementado caso eu remova algum item da fila, ao passo que
     * o contador countPush é incrementado sempre que adiciono um novo item à fila. Logo,
     * se a relação entre adicionados e removidos for igual ao tamanho máximo, quer dizer que
     * tenho que remover um item para conseguir adicionar outro.
     * */
    private boolean isFull() {
        return (countPush - countPop) == MAXIMUM_LENGTH;
    }
}
