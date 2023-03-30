package Modul2_Kegiatan;

import java.util.ArrayList;

class Kegiatan1 {
    public static void main (String[] args){

        ArrayList<String> hewan = new ArrayList<String>();
        hewan.add("Angsa");
        hewan.add("Bebek");
        hewan.add("Cicak");
        hewan.add("Domba");
        hewan.add("Elang");
        hewan.add("Gajah");

        // menambahkan elemen "Badak" dan "Bebek"
        hewan.add("Badak");
        hewan.add("Bebek");
        System.out.println("Hewan : " + hewan);

        /**
         * @for menghitung jumlah elemen "Bebek" dan menampilkan posisi indexnya
         */
        int jumlahBebek = 0;
        for (int i = 0; i < hewan.size(); i++) {
            if (hewan.get(i).equals("Bebek")) {
                jumlahBebek++;
                System.out.println("Index Bebek: " + i);
            }
        }
        System.out.println("Jumlah elemen Bebek: " + jumlahBebek);

        // menghapus posisi "Bebek" yang pertama
        System.out.println("\nHapus posisi 'bebek' yang pertama :");
        hewan.remove(1);
        System.out.println(hewan);

        // menghapus elemen pada index ke-0
        System.out.println("\nIndex ke-0 :" +hewan.get(0));
        System.out.println("Index ke-2 :" +hewan.get(2));
        System.out.println("Hapus Index ke-0 :" +hewan.remove(0));
        System.out.println(hewan);

        System.out.println("\nIndex ke-0 dari 'Cicak' Menjadi 'Ular' :");
        hewan.set(0, "Ular");
        System.out.println(hewan);
        System.out.println("Menambahkan index ke-2 'Itik' :");
        hewan.add(2, "Itik");
        System.out.println(hewan);

        System.out.println("\nMenghapus elemen di antara index ke-1 dan ke-5 :");
        hewan.subList(2, 5).clear();
        System.out.println(hewan);

        System.out.println("\nElemen pertama :" +hewan.get(0));
        System.out.println("Elemen terakhir:" +hewan.get(hewan.size()-1));
        System.out.println("Jumlah elemen: " + hewan.size());
        int indexBadak = hewan.indexOf("Badak");
        System.out.println("Index Badak: " + indexBadak);

    }

}
