# Wahid Nur Hakim | 2509116016 | Sistem Informasi A'25

# 🕌 Rumah Quran Al-Hafizh - Sistem Manajemen Data

## 📋 Deskripsi Singkat Program

<p align="justify">
Program ini adalah sistem manajemen berbasis konsol untuk mengelola data Rumah Quran Al-Hafizh. Sistem ini dirancang untuk memudahkan administrator dalam mengelola tiga entitas utama: santri, kelas mengaji, dan pengajar. 
</p>

<p align="justify">
Dengan antarmuka menu yang interaktif, pengguna dapat melakukan operasi CRUD (Create, Read, Update, Delete) seperti menambah data baru, melihat daftar data, mengubah data yang sudah ada, hingga menghapus data. Program ini juga dilengkapi fitur pencarian global yang memungkinkan pengguna mencari data santri atau pengajar berdasarkan nama, nomor telepon, atau kelas.
</p>

<p align="justify">
Dibangun dengan menerapkan prinsip-prinsip Object-Oriented Programming (OOP) seperti encapsulation, inheritance, polymorphism, dan abstraction, program ini memiliki struktur kode yang terorganisir, mudah dipelihara, dan dapat dikembangkan lebih lanjut.
</p>

---

## 📁 Struktur Package

<p align="justify">
Program ini menggunakan struktur package MVC (Model-View-Controller) yang terpisah dengan jelas untuk memisahkan logika bisnis, tampilan, dan model data.
</p>

| Package | File | Fungsi |
|---------|------|--------|
| `main` | `MiniProject3.java` | Titik masuk program (main method) |
| `controller` | `CrudUmmi.java` | Mengatur logika CRUD dan interaksi data |
| `model` | `RumahQuran.java` | Abstract class sebagai parent Santri & Pengajar |
| `model` | `Santri.java` | Model data untuk santri |
| `model` | `Pengajar.java` | Model data untuk pengajar |
| `model` | `KelasMengaji.java` | Model data untuk kelas mengaji |
| `model` | `CariData.java` | Interface untuk metode pencarian |
| `view` | `Menu.java` | Menampilkan menu dan input user |

## 🔄 Alur Program

<p align="justify">
Program dimulai dengan menampilkan menu utama yang berisi opsi untuk mengelola data santri, kelas mengaji, pengajar, mencari data, atau keluar.
</p>

<p align="justify">
Ketika pengguna memilih menu pengelolaan data, program masuk ke submenu dengan fitur CRUD (Create, Read, Update, Delete). Setiap input divalidasi sebelum diproses jika tidak valid, pengguna diminta mengisi ulang. Data yang valid langsung diproses dan hasilnya ditampilkan dalam bentuk pesan atau tabel.
</p>

<p align="justify">
Setelah setiap operasi selesai, program kembali ke submenu hingga pengguna memilih kembali ke menu utama. Program berakhir saat pengguna memilih opsi keluar dengan menampilkan ucapan penutup.
</p>

---

## 🔒 Penerapan Encapsulation dan Inheritance

### **Encapsulation**

<p align="center">
<img width="848" alt="Encapsulation" src="https://github.com/user-attachments/assets/fd19d18e-c2c3-4a4e-abe9-de23cb1a5ced" />
<br>
  <em>Contoh encapsulation pada kelas Santri dengan atribut private dan getter/setter</em>
</p>

**Manfaat Encapsulation:**
- ✅ Data terlindungi dari akses langsung
- ✅ Validasi data dapat dilakukan di setter
- ✅ Kode lebih mudah dipelihara

---

### **Inheritance**
  
               RumahQuran
          - nama, nomorTelepon
           /                 \
      Santri               Pengajar
     - umur                - mengajar
     - kelasMengaji

<p align="justify">
Inheritance (pewarisan) diterapkan pada paket model, yaitu class RumahQuran sebagai superclass yang diturunkan ke dua subclass, Santri dan Pengajar.
</p>

<p align="center">
<img width="547" height="165" alt="Screenshot 2026-09-24 215816" src="https://github.com/user-attachments/assets/c121ce40-ba42-4d42-86f4-d58bf9ce8596" />
<br>
  <em>Class RumahQuran</em>
</p>

<p align="justify">
Class RumahQuran menyimpan atribut yang sama-sama dimiliki santri dan pengajar, yaitu nama dan nomorTelepon, lengkap dengan getter dan setter-nya, sehingga kode tidak perlu ditulis ulang di setiap subclass.
</p>

<p align="center">
<img width="768" height="204" alt="image" src="https://github.com/user-attachments/assets/44f5c5a3-cc48-4608-983b-205b11a87a02" />
<br>
  <em>Class Santri</em>
</p>

<p align="center">
<img width="634" height="168" alt="image" src="https://github.com/user-attachments/assets/732c4077-7cb0-4038-8151-cf670a3fa85c" />
<br>
  <em>Class Pengajar</em>
</p>

<p align="justify">
Class Santri dan Pengajar memakai kata kunci extends RumahQuran dan memanggil constructor superclass melalui super(nama, nomorTelepon), lalu menambahkan atribut khusus masing-masing: Santri memiliki umur dan kelasMengaji, sedangkan Pengajar memiliki mengajar.
</p>

**Manfaat Inheritance:**
- ✅ **Reusability**: Atribut `nama` dan `nomorTelepon` tidak perlu ditulis ulang
- ✅ **Konsistensi**: Semua entitas punya struktur dasar yang sama
- ✅ **Polymorphism**: Bisa perlakukan `Santri` dan `Pengajar` sebagai `RumahQuran`

## 🎭 Penerapan Polymorphism dan Abstraction

### **Polymorphism**

#### 1. **Method Overloading**

<p align="center">
<img width="722" height="292" alt="image" src="https://github.com/user-attachments/assets/139571eb-3521-4739-a148-08d8333abb8a" />
<br>
  <em>Penerapan Method Overloading pada Class Pengajar</em>
</p>

---

#### 2. **Method Overriding**

<p align="center">
<img width="313" height="87" alt="image" src="https://github.com/user-attachments/assets/48509bdb-745d-45da-9c6e-0da2dfdecfd7" />
<br>
  <em>Penerapan Method Overriding</em>
</p>

### **Abstraction**

<p align="center">
<img width="555" height="209" alt="image" src="https://github.com/user-attachments/assets/6f663379-141b-41f3-9e27-990c2801b72e" />
<br>
  <em>Gambar 1: Contoh encapsulation pada kelas Santri dengan atribut private dan getter/setter</em>
</p>

<p align="justify">
Abstract class RumahQuran mendefinisikan struktur dasar yang harus dimiliki oleh setiap pengguna sistem, yaitu atribut nama dan nomorTelepon, serta abstract method getJenisPengguna() yang tidak memiliki implementasi di parent class. Abstract method ini memaksa setiap child class untuk mengimplementasikan method tersebut sesuai dengan karakteristik masing-masing. Hal ini menyembunyikan kompleksitas implementasi dari user dan hanya menampilkan apa yang perlu diketahui.
</p>

## ⭐ Penjelasan Letak Penerapan Nilai Tambah

### **Interface**

<p align="center">
<img width="389" height="60" alt="image" src="https://github.com/user-attachments/assets/8069ee17-6efe-434a-9162-1372841ddbe9" />
<br>
  <em>Gambar 1: Contoh encapsulation pada kelas Santri dengan atribut private dan getter/setter</em>
</p>

<p align="center">
<img width="562" height="34" alt="image" src="https://github.com/user-attachments/assets/ff68f6ca-a39f-49a7-818a-31fd4910937d" />
<br>
  <em>Gambar 1: Contoh encapsulation pada kelas Santri dengan atribut private dan getter/setter</em>
</p>

<p align="justify">
Interface CariData mendefinisikan kontrak yang harus dipenuhi oleh kelas yang mengimplementasikannya, yaitu method cocokDengan(String kataKunci). Interface ini diimplementasikan oleh kelas Santri dan Pengajar untuk memungkinkan fitur pencarian global. Dengan interface, program mencapai loose coupling di mana kelas yang menggunakan interface tidak perlu tahu detail implementasi dari kelas yang mengimplementasikannya.
</p>
