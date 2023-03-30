package Kegiatan2;
public class LinkedList {
    Node head;
    Node sorted;

    void add(int data){
        Node newnode = new Node(data);
        newnode.next = head;
        head = newnode;
    }

    void Sort(Node head2){

        sorted = null;
        Node current = head2;

        while (current != null){
            Node next = current.next;
            sortedInsert(current);
            current = next;
        }
        head = sorted;
    }

    void sortedInsert(Node newnode){
        if (sorted == null || sorted.data >= newnode.data){
            newnode.next = sorted;
            sorted = newnode;
        }else{
            Node current = sorted;
            while (current.next != null && current.next.data < newnode.data){
                current = current.next;
            }
            newnode.next = current.next;
            current.next = newnode;
        }
    }

    void showData(Node head){
        while (head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}

