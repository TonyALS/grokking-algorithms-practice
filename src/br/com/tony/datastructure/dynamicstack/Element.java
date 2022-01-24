package br.com.tony.datastructure.dynamicstack;

public class Element {
    private String value;
    private Element next;

    public Element(String value, Element next) {
        this.value = value;
        this.next = next;
    }

    public String getValue() {
        return value;
    }

    public Element getNext() {
        return next;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setNext(Element next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Element{" +
                "value='" + value + '\'' +
                ", next=" + next +
                '}';
    }
}
