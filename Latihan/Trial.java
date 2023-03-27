package Latihan;

import java.util.ArrayList;
import java.util.List;

public class Trial {

    // membuat objek ArrayList untuk Hewan
    static ArrayList<String> namaHewan = new ArrayList<>(List.of("Sapi","Kelinci", "Kambing", "Unta", "Domba"));
    // membuat objek ArrayList untuk DeleteHewan
    static ArrayList<String> deleteHewan = new ArrayList<>(List.of("Kelinci", "Kambing", "Unta"));

    public static void main(String[] args) {

        // menampilkan isi objek namaHewan
        System.out.println("Hewan:" + namaHewan);


      /*  System.out.println("\nHewan yang dihapus:");
        for (String hewan : deleteHewan) {
            System.out.print(hewan);
        }
      */

        System.out.print("Hewan yang dihapus : ");
        System.out.println(deleteHewan);

        for (String DeleteHewan : deleteHewan){
            namaHewan.remove(DeleteHewan);
        }

        System.out.print("Output Hewan :");
        System.out.println(namaHewan);
    }
}