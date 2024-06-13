public class Kendaraan22 {

    // atribut
    String noTNKB, nama, jenis;
    int cc, tahun, bulanHarusBayar;
    Kendaraan22 prev, next;
    
    Kendaraan22 head;
    int size;

    Kendaraan22 (Kendaraan22 prev, String noTNKB, String nama, String jenis, int cc, int tahun, int bulanHarusBayar, Kendaraan22 next) {
        this.prev = prev;
        this.noTNKB = noTNKB;
        this.nama = nama;
        this.jenis = jenis;
        this.cc = cc;
        this.tahun = tahun;
        this.bulanHarusBayar = bulanHarusBayar;
        this.next = next;
    }

    // konstruktor default
    Kendaraan22 (){

    }

    // Metode untuk menambahkan elemen baru ke dalam linked list
    public void add(String noTNKB, String nama, String jenis, int cc, int tahun, int bulanHarusBayar) {
        if (head == null) {
            // Jika linked list kosong, buat elemen pertama
            head = new Kendaraan22 (null, noTNKB, nama, jenis, cc, tahun, bulanHarusBayar, null);
        } else {
            // Tambahkan elemen baru di akhir linked list
            Kendaraan22 current = head;
            while (current.next != null) {
                current = current.next;
            }
            Kendaraan22 newNode = new Kendaraan22(current, noTNKB, nama, jenis, cc, tahun, bulanHarusBayar, null);
            current.next = newNode;
        }
        size++;
    }

    // Metode untuk mencetak elemen-elemen dari linked list
    public void printList() {
        Kendaraan22 current = head;
        System.out.printf("| %-20s | %-15s | %-14s | %-16s | %-7s | %-7s \n", "   Nomor TNKB   ", "Nama Pemilik ", "   Jenis   ", "CC Kendaraaan   ", "Tahun  ", "Bulan Harus bayar");
        while (current != null) {
            System.out.printf("| %-20s | %-15s | %-14s | %-16s | %-7s | %-7s " + //
                                "\n", current.noTNKB, current.nama, current.jenis, current.cc, current.tahun, current.bulanHarusBayar);
            current = current.next;
        }
    }

    public Kendaraan22 cariKendaraan(String noTNKB) {
        Kendaraan22 current = head;
        while (current != null) {
            if (current.noTNKB.equalsIgnoreCase(noTNKB)) {
                return current;
            }
            current = current.next;
        }
        return null; // jika tidak ditemukan
    }    
}

/*
    public void add( String noTNKB, String nama, String jenis, int cc, int tahun, int bulanHarusBayar ){
        Kendaraan22 newNode = new Kendaraan22(prev, noTNKB, nama, jenis, cc, tahun, bulanHarusBayar, next);
            next.prev = newNode;
            next = newNode;
            size++;
    }
*/

