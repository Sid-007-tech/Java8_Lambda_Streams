package LinkedListCode;

import java.util.LinkedList;

public class LL {
    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }

    }



    void addFirst(String data) {
        Node newNode = new Node(data);
        if (head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    void addLast(String data){
        Node newNode= new Node(data);
        if (head==null){
            head=newNode;
            return;
        }
        Node currentNode= head;
        while (currentNode.next!=null){
            currentNode=currentNode.next;
        }
        currentNode.next=newNode;



    }
    void printList()
    {
        Node CurrNode = head;
        while (CurrNode != null) {
            System.out.print(CurrNode.data + "->");
            CurrNode = CurrNode.next;
        }
        System.out.println("Null");
    }

    void removeFirst(){

    }

    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addFirst("this");
        LL list= new LL();
        list.addFirst("this");
        list.addLast("is");
        list.addLast("list");
        list.printList();

    }

}
