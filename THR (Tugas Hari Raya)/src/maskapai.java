import java.util.ArrayList;

public class maskapai {
    private String nama;
    private ArrayList<penerbangan> listFlight;

    public maskapai(String nama) {
        this.nama = nama;
        listFlight = new ArrayList<>();
    }

    public void tambahPenerbangan(penerbangan Flight) {
        listFlight.add(Flight);
    }

    public ArrayList<penerbangan> getListPenerbangan() {
        return listFlight;
    }

    public String getNama() {
        return nama;
    }
}
