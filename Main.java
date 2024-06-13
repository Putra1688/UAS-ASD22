
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Kendaraan22 object = new Kendaraan22();

        while (true) {
            System.out.print("Menu\n"
                            + "1. Daftar Kendaraan\n"
                            + "2. Bayar Pajak\n"
                            + "3. Tampilkan Untuk Seluruh Transaksi\n"
                            + "4. Urutkan Trasaksi Berdasarkan Nama Pemilik\n"
                            + "5. Keluar\n"
                            + "Pilih(1-5) : "
                            );

            int menu = input.nextInt();
            input.nextLine();
            switch (menu) {
                case 1:
                System.out.print("+++++++++++++++++++++++++\n"
                                +" Daftar Kendaraan \n"
                                +"+++++++++++++++++++++++++\n");
                object.add("S 4567 YV" , "Basko" , "Mobil" , 2000, 2012, 4);
                object.add("N 4511 VS", "Arta", "Mobil", 2500, 2015, 3);
                object.add("AB 4321 A", "Wiznu", "Motor", 125, 2010, 2);
                object.add("B 1234 AG", "Sisa", "Motor", 150, 2020, 1);
                object.printList();
                
                    break;

                case 2:
                System.out.println("Mohon maaf pak belum selesai");
                /* System.out.print("Masukkan Nomor TNKB: ");
                    String noTNKB = input.nextLine();
                    Kendaraan22 kendaraan = object.cariKendaraan(noTNKB);
                    if (kendaraan != null) {
                        System.out.print("Bulan Bayar: ");
                        int bulanBayar = input.nextInt();
                        TransaksiPajak22 transaksi = new TransaksiPajak22(object.size + 1, bulanBayar, kendaraan);
                        kendaraan.add(transaksi);
                        System.out.println("Transaksi berhasil ditambahkan.");
                    } else {
                        System.out.println("Kendaraan tidak ditemukan.");
                    }
                    break;
                    
                 */
                    
                break;

                case 3:
                    System.out.println("Mohon maaf pak belum selesai");
                    break;
                    
                case 4:
                    System.out.println("Mohon maaf pak belum selesai");
                break;

                case 5:
                System.exit(0);
                break;

                default:
                    break;
            }
        }

    }
}
