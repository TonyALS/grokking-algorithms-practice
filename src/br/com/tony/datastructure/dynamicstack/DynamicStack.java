package br.com.tony.datastructure.dynamicstack;

/**
 * Lista encadeada ou lista ligada é uma lista linear dispersa, isto é, os elementos
 * não estão necessariamente armazenados sequencialmente na memória, porém a ordem lógica
 * entre os elementos que compõem a lista é mantida.
 *
 * */
public class DynamicStack {
    private static final String REMOVE_ITEM_ERROR = "Você não pode remover itens de uma lista vazia.";
    private Element head;
    private Integer size;

    public DynamicStack() {
        this.head = null;
        this.size = 0;
    }

    /*
    * Na primeira instância de LinkedList o this.head é null
    * Quando executamos o método add, o this.head recebe um novo elemento com o valor
    * a ser adicionado, sendo assim, ele passa a ser o topo da lista.
    * O Element recebe como parâmetro o valor e também o próximo elemento, sendo que
    * toda vez que adicionamos um elemento o próximo é o this.head atual.
    * */
    public void add(String value) {
        this.head = new Element(value, this.head);
        this.size++;
    }

    /*
    * Na remoção retira-se o item que está no topo da fila (this.head), para isso:
    * 1º Criamos uma variável temp que recebe o topo atual;
    * 2º O topo atual passa a ser o seu próximo elemento;
    * 3º Setamos como null o próximo elemento da variável temporária para que
    * ela perca a referência ao objeto já que a removemos da lista.
    * 4º Decrementamos o size em -1
    * */
    public void remove() {
        if (this.head == null) {
            throw new IllegalArgumentException(REMOVE_ITEM_ERROR);
        }
        Element temp = this.head;
        this.head = this.head.getNext();
        temp.setNext(null);
        this.size--;
    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "element=" + head +
                ", size=" + size +
                '}';
    }
}
