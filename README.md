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

<img width="848" height="422" alt="image" src="https://github.com/user-attachments/assets/fd19d18e-c2c3-4a4e-abe9-de23cb1a5ced" />

**Manfaat Encapsulation:**
- ✅ Data terlindungi dari akses langsung
- ✅ Validasi data dapat dilakukan di setter
- ✅ Kode lebih mudah dipelihara

### **Inheritance**


**Manfaat Inheritance:**
- ✅ **Reusability**: Atribut `nama` dan `nomorTelepon` tidak perlu ditulis ulang
- ✅ **Konsistensi**: Semua entitas punya struktur dasar yang sama
- ✅ **Polymorphism**: Bisa perlakukan `Santri` dan `Pengajar` sebagai `RumahQuran`

## 🎭 Penerapan Polymorphism dan Abstraction

### **Polymorphism**

#### 1. **Method Overloading**

<img width="722" height="292" alt="image" src="https://github.com/user-attachments/assets/139571eb-3521-4739-a148-08d8333abb8a" />

#### 2. **Method Overriding**

<img width="313" height="87" alt="image" src="https://github.com/user-attachments/assets/48509bdb-745d-45da-9c6e-0da2dfdecfd7" />

### **Abstraction**

<img width="555" height="209" alt="image" src="https://github.com/user-attachments/assets/6f663379-141b-41f3-9e27-990c2801b72e" />

<p align="justify">
Abstract class RumahQuran mendefinisikan struktur dasar yang harus dimiliki oleh setiap pengguna sistem, yaitu atribut nama dan nomorTelepon, serta abstract method getJenisPengguna() yang tidak memiliki implementasi di parent class. Abstract method ini memaksa setiap child class untuk mengimplementasikan method tersebut sesuai dengan karakteristik masing-masing. Hal ini menyembunyikan kompleksitas implementasi dari user dan hanya menampilkan apa yang perlu diketahui.
</p>

## ⭐ Penjelasan Letak Penerapan Nilai Tambah

### **Interface**

<img width="389" height="60" alt="image" src="https://github.com/user-attachments/assets/8069ee17-6efe-434a-9162-1372841ddbe9" />

<p align="justify">
Interface CariData mendefinisikan kontrak yang harus dipenuhi oleh kelas yang mengimplementasikannya, yaitu method cocokDengan(String kataKunci). Interface ini diimplementasikan oleh kelas Santri dan Pengajar untuk memungkinkan fitur pencarian global. Dengan interface, program mencapai loose coupling di mana kelas yang menggunakan interface tidak perlu tahu detail implementasi dari kelas yang mengimplementasikannya.
</p>
