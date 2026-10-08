package main;

import controller.CrudUmmi;
import java.util.Scanner;
import view.Menu;

public class MiniProject3 {

    public static void main(String[] args) {
                try (Scanner scanner = new Scanner(System.in)) {
            Menu menu = new Menu(scanner);
            CrudUmmi crudUmmi = new CrudUmmi(scanner,menu);

            boolean berjalan = true;

            while (berjalan) {
                menu.tampilkanMenuUtama();

                int pilihan = menu.bacaPilihan("Pilih menu: ");

                switch (pilihan) {
                    case 1 -> crudUmmi.kelolaSantri();
                    case 2 -> crudUmmi.kelolaKelasMengaji();
                    case 3 -> crudUmmi.kelolaPengajar();
                    case 4 -> crudUmmi.cariPengguna();
                    case 5 -> {
                        menu.tampilkanPesan("Syukron Katsiron, Jazakumullah Khair");
                        
                        berjalan = false;
                    }

                    default -> menu.tampilkanPesan("Pilihan tidak valid!!!!");
                }
            }
        }
    }
}
