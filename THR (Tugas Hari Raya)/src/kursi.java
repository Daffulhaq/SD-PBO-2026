public class kursi {
    private String nomorKursi;
    private String kelas;
    private boolean available;

    public kursi(String nomorKursi, String kelas) {
        this.nomorKursi = nomorKursi;
        this.kelas = kelas;
        this.available = false;
    }

    public String getSeatNumber() {
        return nomorKursi;
    }

    public String getKelas() {
        return kelas;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
