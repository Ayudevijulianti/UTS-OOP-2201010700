package utsdevi;

/**
 *
 * @author devijulianti 2201010700
 * TGL: 2024-05-07
 */
public class RentalRecord {
    private String namaPenyewa;
    private String nomorTelepon;
    private String jenisMobil;
    private int durasiSewa;

    public RentalRecord(String nama, String telepon, String mobil, int durasi) {
        this.namaPenyewa = nama;
        this.nomorTelepon = telepon;
        this.jenisMobil = mobil;
        this.durasiSewa = durasi;
    }

    public String getNamaPenyewa() {
        return namaPenyewa;
    }

    public void setNamaPenyewa(String nama) {
        this.namaPenyewa = nama;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }

    public void setNomorTelepon(String telp) {
        this.nomorTelepon = telp;
    }

    public String getJenisMobil() {
        return jenisMobil;
    }

    public void setJenisMobil(String mobil) {
        this.jenisMobil = mobil;
    }

    public int getDurasiSewa() {
        return durasiSewa;
    }

    public void setDurasiSewa(int durasi) {
        this.durasiSewa = durasi;
    }

    @Override
    public String toString() {
        return "Nama: " + namaPenyewa +
                "\nNomor Telepon: " + nomorTelepon +
                "\nJenis Mobil: " + jenisMobil +
                "\nDurasi Sewa: " + durasiSewa + " hari";
    }
}