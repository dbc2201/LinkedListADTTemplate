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
        Node<E> response = head;

        /*
         * using a loop to traverse the whole linked list,
         * the loop will run until i is less than the size of the linked list,
         * AND
         * the current node traversed is not equal to null.
         * */
        for (int i = 0; i < index && response != null; i++) {

            // change the reference value of the response variable to the next node
            response = response.getNext();
        }
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

        /*
         * The code following these comments is the summation of the two lines of code
         * written inside the comments.
         * Node<E> n1 = new Node<E>(item, null);
         * head = n1;
         * */
        head = new Node<>(item, head);

        // increase the size of the linked list
        size++;
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

        /*
         * The code following these comments is the summation of the two lines of code
         * written inside the comments.
         * Node<E> n1 = new Node<E>(item, node.next);
         * node.next = n1;
         * */
        node.next = new Node<>(item, node.next);

        // increase the size of the linked list
        size++;
    }

    /**
     * This method will add an {@param item} node in the linked list at the given {@param index}.
     *
     * @param index The index of the linked list at which the node is to be added.
     * @param item  The data value of the node to be created and added to the linked list.
     * @throws IndexOutOfBoundsException If the index is negative or greater than the size.
     */
    public void add(int index, E item) {
        if (index < 0 || index > size) {
            // throw the IndexOutOfBoundsException if the index given is incorrect.
            throw new IndexOutOfBoundsException(Integer.toString(index));
        } else if (index == 0) {
            // the node is to be added at the first index, call the addFirst() method
            addFirst(item);
        } else {
            // the node is to be added somewhere after a given node
            // firstly, get the node after which we have to add a new node.
            Node<E> temp = getNode(index - 1);

            // call the addAfter() method to add the node after 'temp'.
            addAfter(temp, item);
        }
    }

    @Override
    public void add(E item) {
        // add the new node at the size (nth index) of the linked list
        add(size, item);
    }

    /**
     * This method will remove the first node from the linked list.
     *
     * @return The removed node's data or null if the list was empty.
     */
    private E removeFirst() {
        E response = head.getData();
        return response;
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

    /**
     * This method will print the contents of the nodes of the linked list.
     */
    @Override
    public void print() {
        System.out.print("[");
        for (int i = 0; i < size; i++) {
            System.out.println(this.getNode(i).data);
        }
        System.out.println("]");
    }

    /**
     * This is the Node class that implements the methods as per the requriements of the linked list.
     */
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
