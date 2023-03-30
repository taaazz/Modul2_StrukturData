package Kegiatan2;

class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(8);
        list.add(7);
        list.add(1);
        list.add(4);
        list.add(6);
        list.add(2);
        list.add(3);
        System.out.print("Before : ");
        list.showData(list.head);

        System.out.println(" ");

        list.Sort(list.head);
        System.out.print("After  : ");
        list.showData(list.head);
    }

}
