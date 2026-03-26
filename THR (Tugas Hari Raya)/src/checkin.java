public class checkin {
    private penumpang dataPenumpang;
    private penerbangan dataFlight;
    private kursi chosenSeat;

    public checkin(penumpang dataPenumpang, penerbangan dataFlight, kursi chosenSeat) {
        this.dataPenumpang = dataPenumpang;
        this.dataFlight = dataFlight;
        this.chosenSeat = chosenSeat;
    }

    public void prosesCheckIn() {
        if (!chosenSeat.isAvailable()) {
            chosenSeat.setAvailable(true);

            System.out.println("\n===== BOARDING PASS =====");
            System.out.println("Nama          : " + dataPenumpang.getNama());
            System.out.println("Flight        : " + dataFlight.getFlightNumber());
            System.out.println("Tujuan        : " + dataFlight.getTujuan());
            System.out.println("Boarding Time : " + dataFlight.getWaktuBoarding());
            System.out.println("Kursi         : " + chosenSeat.getSeatNumber());
            System.out.println("Kelas         : " + chosenSeat.getKelas());
            System.out.println("=========================");
        } else {
            System.out.println("Kursi sudah terisi");
        }
    }
}
