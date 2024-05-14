package utsdevi;

import java.util.Scanner;

/**
 *
 * @author devijulianti 2201010700
 * TGL: 2024-05-07
 */
class RentalApp {
    private static final int MAX_RECORDS = 100;
        private RentalRecord[] records;
        private int numOfRecords;
        private Scanner scanner;

        public RentalApp() {
            records = new RentalRecord[MAX_RECORDS];
            numOfRecords = 0;
            scanner = new Scanner(System.in);
        }

        public void tambahRecord() {
            if (numOfRecords < MAX_RECORDS) {
                System.out.println("Masukkan data penyewa:");
                System.out.print("Nama: ");
                String nama = scanner.nextLine();
                System.out.print("Nomor Telepon: ");
                String telepon = scanner.nextLine();
                System.out.print("Jenis Mobil: ");
                String mobil = scanner.nextLine();
                System.out.print("Durasi Sewa (hari): ");
                int durasi = scanner.nextInt();
                scanner.nextLine(); // Membuang newline

                records[numOfRecords++] = new RentalRecord(nama, telepon, mobil, durasi);
                System.out.println("Data berhasil ditambahkan.");
            } else {
                System.out.println("Batas maksimal data sudah tercapai.");
            }
        }

        public void tampilkanRecord() {
            System.out.println("Daftar Data Penyewa Mobil:");
            for (int i = 0; i < numOfRecords; i++) {
                System.out.println("Data " + (i + 1) + ":");
                System.out.println(records[i].toString());
                System.out.println();
            }
        }

        public void ubahRecord() {
            System.out.print("Masukkan nomor data yang ingin diubah: ");
            int nomor = scanner.nextInt();
            scanner.nextLine(); // Membuang newline

            if (nomor >= 1 && nomor <= numOfRecords) {
                System.out.println("Masukkan data baru:");
                System.out.print("Nama: ");
                String nama = scanner.nextLine();
                System.out.print("Nomor Telepon: ");
                String telepon = scanner.nextLine();
                System.out.print("Jenis Mobil: ");
                String mobil = scanner.nextLine();
                System.out.print("Durasi Sewa (hari): ");
                int durasi = scanner.nextInt();
                scanner.nextLine(); // Membuang newline

                records[nomor - 1].setNamaPenyewa(nama);
                records[nomor - 1].setNomorTelepon(telepon);
                records[nomor - 1].setJenisMobil(mobil);
                records[nomor - 1].setDurasiSewa(durasi);

                System.out.println("Data berhasil diubah.");
            } else {
                System.out.println("Nomor data tidak valid.");
            }
        }

        public void hapusRecord() {
            System.out.print("Masukkan nomor data yang ingin dihapus: ");
            int nomor = scanner.nextInt();
            scanner.nextLine(); // Membuang newline

            if (nomor >= 1 && nomor <= numOfRecords) {
                for (int i = nomor - 1; i < numOfRecords - 1; i++) {
                    records[i] = records[i + 1];
                }
                numOfRecords--;
                System.out.println("Data berhasil dihapus.");
            } else {
                System.out.println("Nomor data tidak valid.");
            }
        }

        public void jalankan() {
            int pilihan;

            do {
                System.out.println("Menu Aplikasi:");
                System.out.println("1. Tambah Data Penyewa");
                System.out.println("2. Tampilkan Data Penyewa");
                System.out.println("3. Ubah Data Penyewa");
                System.out.println("4. Hapus Data Penyewa");
                System.out.println("5. Keluar");
                System.out.print("Pilihan Anda: ");
                pilihan = scanner.nextInt();
                scanner.nextLine(); // Membuang newline

                switch (pilihan) {
                    case 1:
                        tambahRecord();
                        break;
                    case 2:
                        tampilkanRecord();
                        break;
                    case 3:
                        ubahRecord();
                        break;
                    case 4:
                        hapusRecord();
                        break;
                    case 5:
                        System.out.println("Terima kasih telah menggunakan aplikasi.");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                }
            } while (pilihan != 5);
        }

        public static void main(String[] args) {
            RentalApp rentalApp = new RentalApp();
            rentalApp.jalankan();
        }
}
