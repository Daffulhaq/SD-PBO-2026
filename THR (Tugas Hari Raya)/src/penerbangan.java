import java.util.ArrayList;

public class penerbangan {
    private String nomorPenerbangan;
    private String tujuan;
    private String waktuBoarding;
    private ArrayList<kursi> listKursi;

    public penerbangan(String flightNum, String tujuan, String boardTime) {
        this.nomorPenerbangan = flightNum;
        this.tujuan = tujuan;
        this.waktuBoarding = boardTime;
        listKursi = new ArrayList<>();
        generateKursi();
    }

    private void generateKursi() {
        for (int baris = 1; baris <= 30; baris++) {
            for (char kolom = 'A'; kolom <= 'F'; kolom++) {
                String nomor = baris + " " + kolom;
                String kelas = (baris <= 3) ? "Business" : "Economy";
                listKursi.add(new kursi(nomor, kelas));
            }
        }
    }

    public ArrayList<kursi> getListKursi() {
        return listKursi;
    }

    public String getFlightNumber() {
        return nomorPenerbangan;
    }

    public String getWaktuBoarding() {
        return waktuBoarding;
    }

    public String getTujuan() {
        return tujuan;
    }
}
