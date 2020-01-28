/*
 *   Created by IntelliJ IDEA Ultimate, 2020
 *   User: dbc2201
 *   Date: 29/01/20
 *   Time: 12:48 AM
 */

package definition;

import adt.LinkedListADTInterface;

public class LinkedListDefinitionClass<E> implements LinkedListADTInterface<E> {

    private static class Node<E> {
        private E data;
        private Node<E> next;

        private Node(E data) {
            this.data = data;
        }

        private Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }
    }

    @Override
    public void add(E item) {

    }

    @Override
    public void remove(E item) {

    }

    @Override
    public int search(E item) {
        return 0;
    }

    @Override
    public void sort() {

    }

    @Override
    public void print() {

    }
}
