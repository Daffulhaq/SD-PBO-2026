import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        maskapai garuda = new maskapai("Garuda Indonesia");
        garuda.tambahPenerbangan(new penerbangan("GA141", "Jakarta", "10:35"));
        garuda.tambahPenerbangan(new penerbangan("GA147", "Jakarta", "15:10"));

        maskapai pelita = new maskapai("Pelita Air");
        pelita.tambahPenerbangan(new penerbangan("IP343", "Jakarta", "11:30"));

        maskapai batik = new maskapai("Batik Air");
        batik.tambahPenerbangan(new penerbangan("ID6899", "Jakarta", "07.00"));

        ArrayList<maskapai> daftarMaskapai = new ArrayList<>();
        daftarMaskapai.add(garuda);
        daftarMaskapai.add(pelita);
        daftarMaskapai.add(batik);

        System.out.println("=== DAFTAR MASKAPAI ===");
        for (int i = 0; i < daftarMaskapai.size(); i++) {
            System.out.println((i + 1) + ". " + daftarMaskapai.get(i).getNama());
        }

        System.out.print("Pilih Maskapai: ");
        int pilihMaskapai = input.nextInt();
        maskapai m = daftarMaskapai.get(pilihMaskapai - 1);

        System.out.println("\n=== DAFTAR PENERBANGAN ===");
        for (int i = 0; i < m.getListPenerbangan().size(); i++) {
            System.out.println((i + 1) + ". " + m.getListPenerbangan().get(i).getFlightNumber());
        }

        System.out.print("Pilih Penerbangan: ");
        int pilihFlight = input.nextInt();
        input.nextLine();

        penerbangan p = m.getListPenerbangan().get(pilihFlight - 1);

        System.out.print("Nama: ");
        String nama = input.nextLine();

        penumpang penumpang = new penumpang(nama);

        ArrayList<kursi> kursiList = p.getListKursi();

        System.out.println("\n=== KURSI TERSEDIA ===");
        int nomor = 1;
        for (int i = 0; i < kursiList.size(); i++) {
            if (!kursiList.get(i).isAvailable()) {
                System.out.println(nomor + ". " +
                        kursiList.get(i).getSeatNumber() +
                        " (" + kursiList.get(i).getKelas() + ")");
                nomor++;
            }
        }

        System.out.print("Pilih Kursi: ");
        int pilihKursi = input.nextInt();

        kursi kursi = kursiList.get(pilihKursi - 1);

        checkin c = new checkin(penumpang, p, kursi);
        c.prosesCheckIn();

        input.close();
    }
}
