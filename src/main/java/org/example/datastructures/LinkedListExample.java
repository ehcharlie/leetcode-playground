package org.example.datastructures;

import java.util.*;


/*
* A Linkedlist is made up of a long chain of nodes; each node containing 2 parts
* Some data that you need to store, and an address to the next node (I.E a pointer)
* The nodes themselves are non-contiguous
* LinkedLists are bad at searching, but better for adding/removing elements, as only the pointer
* Needs to be updated to point to the next node - I.E no shifting of elements
*
* There are two types of LinkedLists - Singly linked and Doubly linked lists
*
* A singly linked list stores only one address to the next pointer
*       Node                 Node                Node
*   [data | address] -> [data | address] -> [data | address]
*
* A doubly linked list stores two address in each node, one address for the next node and one for the previous node
* The benefit is that it can be traversed from head to tail, or tail to head
*
*              Node                          Node                          Node
*   [address | data | address] -> [address | data | address] -> [address | data | address]
*
*
* Advantages?
* 1. Dynamic data structure (only allocates needed memory while running)
* 2. Insertion and deletion of nodes is easy. (O1)
* 3. No/Low memory waste
*
* Disadvantages?
* 1. Greater memory usage (additional pointer)
* 2. No random access of elements (no index[i])
* 3. Accessing/searching elements is more time consuming. O(n)
*
* uses?
* 1. Implement Stacks/Queues
* 2. GPS Navigation
* 3. Music playlist
* */
public class LinkedListExample {

    public static void example() {
        LinkedList<String> linkedList = new LinkedList<String>();

        //LinkedList can act as a stack
//        linkedList.push("A");
//        linkedList.push("B");
//        linkedList.push("C");
//        linkedList.push("D");
//        linkedList.push("F");
//        linkedList.pop();

        //LinkedList can act as a queue
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");
//        linkedList.poll();

        Collections.reverseOrder();
        linkedList.add(4, "E");

        linkedList.addFirst("0");
        linkedList.addLast("G");

        String first = linkedList.removeFirst();
        String last = linkedList.remove();

        System.out.println(linkedList);
    }
}