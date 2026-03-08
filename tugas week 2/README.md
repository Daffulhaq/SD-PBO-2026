# 4 Pilar Pemrograman Berorientasi Objek

Nama : Daffa Ulhaq Fadhlurrahman  
NRP : 5027251033  
Kelas : B  


Pada Pemrograman Berorientasi Objek, terdapat 4 pilar :  
## 1. Encapsulation  
Encapsulation adalah konsep membungkus data dan method dalam satu class serta membatasi akses langsung ke data untuk melindungi dan menyembunyikan proses di dalamnya.  
Pada program ini, method dibawah akan "dibungkus" agar tidak bisa bebas diakses.

```java
private String Type;
private String PowerSource;
private String Track;
private int TopSpeed;
```

## 2. Abstraction
Abstraction adalah konsep menyembunyikan detail implementasi yang rumit dan hanya menampilkan fungsi penting dari suatu objek kepada pengguna.  
Pada program ini , class utamanya adalah "RacingCar", tetapi jenis-jenisnya dibagi dua. Untuk menyembunyikan detail rumitnya,kita dapat menggunakan abstraction.
```java
abstract class RacingCar {
  abstract void sound();
}
```

## 3. Inheritance
Inheritance adalah konsep pewarisan dimana sebuah class dapat mewarisi atribut dan metode dari class lain sehingga mengurangi penulisan kode yang berulang.

Pada program ini, kelas "ElectricCar" dan "GasCar" mewarisi atribut dan method dari class "RacingCar". 
```java
class ElectricCar extends RacingCar
class GasCar extends RacingCar
```
## 4. Polymorphism
Polymorphism adalah kemampuan suatu method atau objek untuk memiliki banyak bentuk sehingga dapat berperilaku berbeda pada class yang berbeda.

RacingCar yang berbeda akan mengeluarkan sound "RacingCar".
```java
RacingCar carElectric = new ElectricCar("Formula E", "Electric", "Street Circuits", 320);
RacingCar carGas = new GasCar("Formula 1", "Gasoline", "Permanent Circuits", 350);
```


