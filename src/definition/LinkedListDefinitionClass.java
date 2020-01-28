/*
 *   Created by IntelliJ IDEA Ultimate, 2020
 *   User: dbc2201
 *   Date: 29/01/20
 *   Time: 12:48 AM
 */

package definition;

import adt.LinkedListADTInterface;

public class LinkedListDefinitionClass<E> implements LinkedListADTInterface<E> {

    // This reference variable will store the reference to the first node of the linked list.
    private Node<E> head = null;

    // This variable will store the current size of the linked list.
    private int size = 0;

    /**
     * This method will add an {@param item} to the beginning of the linked list.
     * Since the programmer is only giving us the {@param item}(the data value) and NOT
     * the node itself, we would have to create a node. Since, the linked list can only
     * operate on nodes.
     *
     * @param item This is the data value of the node to be created and added to the linked list.
     */
    private void addFirst(E item) {

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

        private E getData() {
            return data;
        }

        private Node<E> getNext() {
            return next;
        }
    }
}
