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

### **Encapsulation (Pembungkusan)**


**Manfaat Encapsulation:**
- ✅ Data terlindungi dari akses langsung
- ✅ Validasi data dapat dilakukan di setter
- ✅ Kode lebih mudah dipelihara

### **Inheritance (Pewarisan)**


**Manfaat Inheritance:**
- ✅ **Reusability**: Atribut `nama` dan `nomorTelepon` tidak perlu ditulis ulang
- ✅ **Konsistensi**: Semua entitas punya struktur dasar yang sama
- ✅ **Polymorphism**: Bisa perlakukan `Santri` dan `Pengajar` sebagai `RumahQuran`

## 🎭 Penerapan Polymorphism dan Abstraction

### **Polymorphism**

#### 1. **Method Overloading**



#### 2. **Method Overriding**


### **Abstraction**


## ⭐ Penjelasan Letak Penerapan Nilai Tambah

### **Interface**
