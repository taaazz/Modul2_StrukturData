package Modul2_Kegiatan;

//kegiatan2
public class Linked {
    class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;
    Node tail;

    /**
     * @param data digunakan untuk menambah data yang akan disimpan
     */
    public void addNode(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    /**
     * @method sortList digunakan untuk mengurutkan
     * menggunakan methode buble sort untuk mengurutkannya
     */
    public void sortList() {

        Node current = head, index = null;
        int temp;

        if (head == null) {
            System.out.println("Data Masih Kosong!");
        } else {
            while (current != null) {
                index = current.next;
                while (index != null) {
                    if (current.data < index.data) {
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }
                    index = index.next;
                }
                current = current.next;
            }
        }
    }

    public void display() {

        Node current = head;

        if (head == null) {
            System.out.println("Data masih kosong!");
            return;
        }
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Linked sList = new Linked();

        sList.addNode(9);
        sList.addNode(6);
        sList.addNode(1);
        sList.addNode(7);
        sList.addNode(5);
        sList.addNode(2);
        sList.addNode(4);

        System.out.println("Before list: ");
        sList.display();

        sList.sortList();
        System.out.println("After sorted list: ");
        sList.display();
    }
}