package trial;

import java.util.ArrayList;
import java.util.List;
class Kegiatan1 {
    static ArrayList<String> hewan = new ArrayList<>(List.of("Angsa", "Bebek", "Cicak", "Domba", "Elang", "Gajah", "Badak", "Bebek"));

    public static void main(String[] args) {
        System.out.println("Hewan : " + hewan);

        // menampilkan posisi index dari elemen Bebek
        System.out.println("Index dari elemen Bebek: ");
        for (int i = 0; i < hewan.size(); i++) {
            if (hewan.get(i).equals("Bebek")) {
                System.out.println(i);
            }
        }
        // menghitung jumlah elemen Bebek
        int jumlahBebek = 0;
        for (String h : hewan) {
            if (h.equals("Bebek")) {
                jumlahBebek++;
            }
        }
        System.out.println("Jumlah elemen Bebek: " + jumlahBebek);

        // menghapus posisi indeks pertama yang memiliki nilai "Bebek"
        hewan.remove("Bebek");
        System.out.println("\nmenghapus bebek pada indeks ke-1:");
        System.out.println(hewan);

        // menampilkan elemen pada indeks ke-0 dan ke-2
        System.out.println("\nHewan pada indeks ke-0 dan ke-2:");
        System.out.println("Indeks 0: " + hewan.get(0));
        System.out.println("Indeks 2: " + hewan.get(2));

        // menghapus elemen pada indeks ke-0
        hewan.remove(0);
        System.out.println("\nMenghapus Angsa pada indeks ke-0:");
        System.out.println(hewan);

        // mengubah elemen pada indeks ke-0
        System.out.println("\nMengubah index ke-0 dari \"Cicak\" menjadi \"Ular\": ");
        hewan.set(0, "Ular");
        System.out.println(hewan);

        // menambahkan elemen baru pada index ke-2
        System.out.println("\nMenambahkan elemen baru pada index ke-2 dengan \"Itik\"");
        hewan.add(2, "Itik");
        System.out.println(hewan);

        // menghapus elemen pada indeks ke-0
        hewan.subList(2, 5).clear();
        System.out.println("\nMenghapus elemen antara indeks ke 1-5:");
        System.out.println(hewan);

        // menampilkan elemen pertama dan terakhir
        System.out.println("\nElemen pertama: " + hewan.get(0));
        System.out.println("Elemen terakhir: " + hewan.get(hewan.size() - 1));

        // mennetukan jumlah elemen
        int jumlahHewan = 0;
        for (String h : hewan) {
            jumlahHewan++;
        }
        System.out.println("Jumlah elemen: " + jumlahHewan);

        // menentukan indeks badak
        System.out.print("Index Badak: ");
        for (int i = 0; i < hewan.size(); i++) {
            if (hewan.get(i).equals("Badak")) {
                System.out.println(i);
            }
        }

    }

}