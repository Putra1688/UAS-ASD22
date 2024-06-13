public class TransaksiPajak22 {
    int kode;
    long nominalBayar, denda;
    int bulanBayar;
    Kendaraan22 kendaraan;

    TransaksiPajak22 ( int kode, long nominalBayar, long denda, int bulanBayar, Kendaraan22 kendaraan) {
        this.kode = kode;
        this.nominalBayar = nominalBayar;
        this.denda = denda;
        this.bulanBayar = bulanBayar;
        this.kendaraan = kendaraan;

    }

    public long hitungNominal(Kendaraan22 kendaraan) {
        long nominal = 0;
        if (kendaraan.jenis.equalsIgnoreCase("Motor")) {
            if (kendaraan.cc < 100) {
                nominal = 100000;
            } else if (kendaraan.cc <= 250) {
                nominal = 250000;
            } else {
                nominal = 500000;
            }
        } else if (kendaraan.jenis.equalsIgnoreCase("Mobil")) {
            if (kendaraan.cc < 1000) {
                nominal = 750000;
            } else if (kendaraan.cc <= 2500) {
                nominal = 1000000;
            } else {
                nominal = 1500000;
            }
        }
        return nominal;
    }

    public long hitungDenda(Kendaraan22 kendaraan, int bulanBayar) {
        int selisihBulan = bulanBayar - kendaraan.bulanHarusBayar;
        if (selisihBulan <= 0) {
            return 0;
        } else if (selisihBulan <= 3) {
            return 50000;
        } else {
            return 50000 * selisihBulan;
        }
    }
}

