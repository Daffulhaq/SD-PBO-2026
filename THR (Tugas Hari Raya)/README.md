# Check In Pesawat di Bandara Sultan Iskandar Muda

Nama : Daffa Ulhaq Fadhlurrahman  
NRP : 5027251033  
Mata Kuliah : Struktur Data dan Pemrograman Berorientasi Objek (B)  

## Deskripsi Kasus 
Program ini merupakan simulasi sistem check-in penumpang pesawat di Bandara Sultan Iskandar Muda. Dalam program ini, pengguna sebagai petugas check-in dapat:
- Memilih maskapai
- Memilih nomor penerbangan
- Menginput data penumpang
- Memilih kursi penumpang
- Menghasilkan boarding pass

## Class Diagram
<img width="5905" height="5030" alt="Flight Management Check-In-2026-03-26-053044" src="https://github.com/user-attachments/assets/bc736799-59d5-43f5-8894-e8c7f4cc0e87" />

## [Source code](src/)

## Output
Pengguna dapat menginput maskapai dan nomor penerbangan yang tersedia

<img width="339" height="236" alt="Screenshot 2026-03-26 123451" src="https://github.com/user-attachments/assets/134365b8-8361-42ae-8300-c3edf5197c7a" />

Pengguna juga dapat memilih kursi (1-18 untuk kelas Business, 19-180 untuk kelas Economy)

<img width="339" height="434" alt="Screenshot 2026-03-26 123453" src="https://github.com/user-attachments/assets/d25897d9-fcca-4df2-b367-5617041e71bc" />
<img width="273" height="209" alt="Screenshot 2026-03-26 123508" src="https://github.com/user-attachments/assets/7882ddbd-d0b4-4523-b3b9-a7daeaa8ead3" />

Kemudian, program akan mencetak Boarding Pass pengguna

<img width="273" height="181" alt="Screenshot 2026-03-26 123509" src="https://github.com/user-attachments/assets/f6ceea40-2df0-41d6-8e10-aaea050e9e41" />

## Prinsip-Prinsip OOP yang Digunakan
### 1. Encapsulation
Encapsulation adalah pembungkusan data dan method di dalam satu class, serta membatasi akses langsung ke data tersebut dengan penggunaan protected/private.
```java
public class penumpang {
    private String nama;

    public penumpang(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }
}
```
### 2. Abstraction
Abstraction adalah menyembunyikan detail implementasi dan hanya menampilkan fungsi utama kepada user. Contoh pada program ini adalah ketika pengguna hanya diberikan data kursi yang ada, tetapi cara mencetak kursi itu disembunyikan dari user.
```java
private void generateKursi() {
        for (int baris = 1; baris <= 30; baris++) {
            for (char kolom = 'A'; kolom <= 'F'; kolom++) {
                String nomor = baris + " " + kolom;
                String kelas = (baris <= 3) ? "Business" : "Economy";
                listKursi.add(new kursi(nomor, kelas));
            }
        }
    }
```
### 3. Composition
Composition adalah hubungan `has-a`, yaitu sebuah object memiliki object lain sebagai bagian dari dirinya.
```java
public class checkin {
    private penumpang dataPenumpang;
    private penerbangan dataFlight;
    private kursi chosenSeat;
```
Program diatas menunjukkan bahwa kelas `checkin` memiliki `penumpang`, `penerbangan`, dan `kursi`.

## Keunikan Program
1. Setiap nomor penerbangan mengikuti jadwal di dunia nyata, berdasarkan referensi dari [flightradar24](https://www.flightradar24.com/airport/btj/departures).
2. Jumlah kursi yang dicetak disesuaikan dengan tipe pesawat yang digunakan pada penerbangan di dunia nyata (Boeing 737 atau Airbus A320) dengan kapasitas kurang lebih 180 kursi.
3. Kursi pesawat dibagi menjadi 2 kelas, yakni Business dan Economy.



