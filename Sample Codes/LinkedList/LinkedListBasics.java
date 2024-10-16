package LinkedList;

import com.sun.security.jgss.GSSUtil;

class Node{
    int value;
    Node next;

    Node(int value){
        this.value=value;
    }
}

public class LinkedListBasics {
    /*
        linked list is like "one-sided love"
        It is an idea of linking two non-contiguous memory locations(nodes)
        node : value + add. of next node
        first node : "head node"
        last node : value + null
    */

    public static void print(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.value);
            temp = temp.next;
        }

    }

    public static void printRecursively(Node head){
        if(head==null) return; // base case
        System.out.println(head.value); // work
        printRecursively(head.next); // recursive call

    }


    public static void main(String[] args) {
        Node a = new Node(10);
//        System.out.println(a); // 5f184fc6 - add. of node 'a'
//        System.out.println(a.value); // 10
//        System.out.println(a.next); // null
        Node b = new Node(20);
//        System.out.println(b); // 3feba861 - add. of node 'b'
//        System.out.println(b.value); // 20
//        System.out.println(b.next); // null

        // Now we have to link the nodes i.e., 'a' & 'b'
        a.next=b; // linking : a -> b
//        System.out.println(a); // 5f184fc6 - add. of node 'a'
//        System.out.println(a.value); // 10
//        System.out.println(a.next); // 3feba861 - add. of node 'b'

        // if 'n' nodes then 'n-1' links

//        System.out.println(a.value); //10
//        System.out.println(b.value); //20
//        System.out.println(a.next.value);//20 since a.next=b

        // displaying a linked list
        /*
            shallow copy of a node (temp node)  -> used to traverse the linked list
            Node temp = a; // shallow copy
            Node temp = new Node(10); // deep copy
        */

        // printing all elements of linked list using temporary node
//        Node temp = a; // temp node pointing to head node i.e., 'a'
//        while(temp!=null){
//            System.out.println(temp.value);
//            temp = temp.next;
//        }

//        print(a);

        // printing all elements of linked list recursively
        printRecursively(a);

    }
}
