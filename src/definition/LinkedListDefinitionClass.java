/*
 *   Created by IntelliJ IDEA Ultimate, 2020
 *   User: dbc2201
 *   Date: 29/01/20
 *   Time: 12:48 AM
 */

package definition;

import adt.LinkedListADTInterface;

/**
 * This class will serve as the definition class for the Linked List implementation.
 * It implements the {@link LinkedListADTInterface<E>} and overrides all the methods.
 */
public class LinkedListDefinitionClass<E> implements LinkedListADTInterface<E> {

    // This reference variable will store the reference to the first node of the linked list.
    private Node<E> head = null;

    // This variable will store the current size of the linked list.
    private int size = 0;

    /**
     * This method will return a node at the specified index from the linked list.
     *
     * @param index An non-negative index from the linked list.
     * @return The node at the specified {@param index}
     */
    private Node<E> getNode(int index) {
        Node<E> response = null;
        return response;
    }

    /**
     * This method will add an {@param item} node to the beginning of the linked list.
     * Since the programmer is only giving us the {@param item}(the data value) and NOT
     * the node itself, we would have to create a node. Since, the linked list can only
     * operate on nodes.
     *
     * @param item This is the data value of the node to be created and added to the linked list.
     */
    private void addFirst(E item) {

    }

    /**
     * This method will add an {@param item} node after a given {@param node} in the linked list.
     * Similar to the addFirst() method, this method also receives only the data value, so we
     * would have create a node and then send it to the linked list to be added after the
     * given node.
     *
     * @param node The node after which the new node is to be added.
     * @param item The data value of the node to be created and added to the linked list.
     */
    private void addAfter(Node<E> node, E item) {

    }

    /**
     * This method will add an {@param item} node in the linked list at the given {@param index}.
     *
     * @param index The index of the linked list at which the node is to be added.
     * @param item  The data value of the node to be created and added to the linked list.
     * @throws IndexOutOfBoundsException If the index is negative or greater than the size.
     */
    public void add(int index, E item) {

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
