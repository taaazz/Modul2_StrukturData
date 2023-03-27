package Latihan;

import java.util.ArrayList;
import java.util.List;

public class Latihan{
    static ArrayList<String> namaHewan = new ArrayList<>(List.of("Sapi","Kelinci", "Kambing", "Unta", "Domba"));
    static ArrayList<String> deleteHewan = new ArrayList<>(List.of("Kelinci", "Kambing", "Unta"));

//    public void hapusHewan(){
//        for (String hewan : namaHewan){
//            System.out.println(hewan);
//        }
//    }

    public static void main(String[] args) {
//        namaHewan.remove(0);
//        namaHewan.remove(3);
        System.out.println("Hewan : " + namaHewan);
        System.out.println("Hewan yang dihapus : ");
        System.out.println(deleteHewan);

        for (String hapusHewan : deleteHewan){
            namaHewan.remove(hapusHewan);
        }

        System.out.println("Output Hewan :");
        System.out.println(namaHewan);
    }
}