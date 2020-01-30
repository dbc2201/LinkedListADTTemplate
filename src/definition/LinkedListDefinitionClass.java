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
 * It implements the {@link LinkedListADTInterface} and overrides all the methods.
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
     * @return The node at the specified index.
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
     * This method will add an item node to the beginning of the linked list.
     * Since the programmer is only giving us the item(the data value) and NOT
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
     * This method will add an item node after a given node in the linked list.
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
     * This method will add an item node in the linked list at the given item.
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
        E response = null;

        // store the head node's reference in a temp variable.
        Node<E> temp = head;

        // check to see if the head isn't null.
        if (head != null) {

            // move the head node's reference to the immediate next node.
            head = head.getNext();
        }

        // return the old head node's data.
        // check to see if the temp variable isn't null.
        if (temp != null) {

            // decrease the size of the linked list
            size--;

            // set the response to the data of the temp node
            response = temp.getData();
        }

        return response;
    }

    /**
     * This method will remove a node after the given node in the linked list.
     *
     * @param node The node after which the node is to be deleted.
     * @return the node's data that was deleted or null if there was no node.
     */
    private E removeAfter(Node<E> node) {
        E response = null;

        // store the node to be deleted in a temp variable
        Node<E> temp = node.next;

        // check if the temp variable is not null
        if (temp != null) {
            // change the next reference of the previous node
            node.next = temp.getNext();

            // decrease the size of the linked list
            size--;

            // set the data of the temp node (deleted node) to the response
            response = temp.getData();
        }
        return response;
    }

    /**
     * This method will remove a node in the linked list at a particular index.
     *
     * @param index the index at which the value is to be deleted.
     * @return the data of the deleted node.
     */
    public E remove(int index) {
        E response = null;
        // check for valid index
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        } else if (index == 0) { /* check if the index is zero*/
            response = removeFirst();
        } else {
            Node<E> previousNode = getNode(index - 1);
        }
        return response;
    }

    @Override
    public E remove() {
        return null;
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
            // fetch the data for the current node
            E data = this.getNode(i).getData();
            System.out.print(data + (i < size - 1 ? ", " : ""));
        }
        System.out.println("]");
    }

    /**
     * This is the Node class that implements the methods as per the requirements of the linked list.
     */
    private static class Node<E> {
        // these are the fields for the singly-linked list
        private E data;
        private Node<E> next;

        // constructor to initialize the data field of the node
        private Node(E data) {
            this.data = data;
        }

        // constructor to initialize both the fields of the node
        private Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }

        // getter method for the node's data field
        private E getData() {
            return data;
        }

        // getter method for the node's next field
        private Node<E> getNext() {
            return next;
        }
    }
}
