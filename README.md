# Pemrograman Berbasis Objek

## Identitas

Nama  : Akhmad Rafliansyah

NIM   : 2509116045

Prodi : Sistem Informasi 25'B

Tema  : Sistem Informasi Manajemen Pencucian Kendaraan

## Penjelasan Studi Kasus

Sistem Informasi Manajemen Pencucian Kendaraan merupakan sebuah sistem yang dibuat untuk membantu mengelola proses pencucian kendaraan 
secara lebih terstruktur. Sistem ini digunakan untuk mencatat data kendaraan, pelanggan, jenis kendaraan, layanan pencucian, serta 
transaksi pencucian. Dengan adanya sistem ini, proses pencatatan data dan perhitungan biaya pencucian dapat dilakukan dengan lebih mudah 
dibandingkan pencatatan secara manual.

Sistem ini menerapkan konsep Pemrograman Berorientasi Objek (PBO), salah satunya adalah inheritance. Pada sistem ini, Kendaraan digunakan 
sebagai superclass, sedangkan Mobil dan Motor digunakan sebagai subclass. Pembagian tersebut memungkinkan setiap jenis kendaraan memiliki 
karakteristik atau atribut yang sesuai. Sistem juga menyediakan layanan pencucian dengan harga yang disesuaikan berdasarkan jenis kendaraan,
sehingga proses pengelolaan transaksi menjadi lebih terorganisir.

## Hierarki Class

Pada sistem informasi manajemen pencucian kendaraan, Kendaraan digunakan sebagai superclass yang menyimpan atribut dan method yang 
bersifat umum untuk kendaraan. Selanjutnya, terdapat dua subclass, yaitu Mobil dan Motor, yang mewarisi atribut dan method dari class 
Kendaraan.

Hierarki class pada sistem dapat digambarkan sebagai berikut:

Kendaraan
├── Mobil
└── Motor

Class Mobil digunakan untuk merepresentasikan kendaraan berjenis mobil, sedangkan class Motor digunakan untuk merepresentasikan kendaraan
berjenis motor. Penerapan inheritance ini membuat atribut dan method yang sama tidak perlu ditulis ulang pada masing-masing subclass, 
sehingga struktur program menjadi lebih terorganisir dan dapat menggunakan kembali kode dari superclass.

## Penjelasan Kode yang Menerapkan Inheritance

Konsep inheritance diterapkan pada class Kendaraan sebagai superclass, kemudian class Mobil dan Motor sebagai subclass. Class Mobil dan 
Motor mewarisi atribut dan method yang terdapat pada class Kendaraan.

Contoh penerapannya:

public class Mobil extends Kendaraan {
    // atribut dan method khusus mobil
}

public class Motor extends Kendaraan {
    // atribut dan method khusus motor
}

Kata kunci extends digunakan untuk menunjukkan bahwa Mobil dan Motor merupakan turunan dari class Kendaraan. Dengan inheritance, atribut 
dan method yang bersifat umum pada kendaraan dapat digunakan kembali oleh subclass tanpa harus menuliskan ulang kode yang sama.

## Screanshot Program
1. Tampilan Menu Utama
   Program dimulai dengan menampilkan menu utama yang berisi beberapa pilihan, yaitu tambah data, tampilkan data, ubah data, hapus data, dan keluar
   dari program. Pengguna dapat memilih salah satu menu dengan memasukkan angka sesuai pilihan yang tersedia.

   <img width="297" height="176" alt="image" src="https://github.com/user-attachments/assets/be2efe76-51fe-42cf-9141-fc0c0ac5e96b" />

2. Tambah Data
   Pada menu Tambah Data Pencucian, pengguna memasukkan data transaksi pencucian seperti ID transaksi, ID pelanggan, nama pelanggan,
   nomor telepon, nomor plat, merek kendaraan, dan warna kendaraan. Selanjutnya pengguna memilih jenis kendaraan, yaitu mobil atau motor,
   kemudian program menentukan jumlah roda berdasarkan jenis kendaraan. Setelah itu, pengguna memilih jenis layanan pencucian yang
   tersedia beserta harganya. Setelah seluruh data diisi, program menyimpan data transaksi dan menampilkan pesan “Data Pencucian Berhasil
   Ditambahkan!”.

   <img width="285" height="612" alt="image" src="https://github.com/user-attachments/assets/955deb55-0634-413c-ad57-c6af8ea187a6" />

3. Tampilkan Data
   Pada menu Tampilkan Data Pencucian, program menampilkan data transaksi pencucian yang sebelumnya telah disimpan. Data yang ditampilkan
   meliputi ID transaksi, ID pelanggan, nama pelanggan, nomor telepon, nomor plat, detail kendaraan, merek kendaraan, kode layanan, jenis
   layanan, dan harga. Pada contoh, program menampilkan transaksi TR001 milik pelanggan Rafli dengan kendaraan Innova jenis mobil 4 roda.
   Layanan yang dipilih adalah Cuci Reguler Mobil dengan harga Rp50.000.

   <img width="255" height="388" alt="image" src="https://github.com/user-attachments/assets/e44e0377-b722-4bb5-81e0-6219c3ec4eec" />

4. Ubah Data
   Pada menu Ubah Data Pencucian, pengguna dapat memperbarui data transaksi yang sudah tersimpan dengan memasukkan ID transaksi yang ingin
   diubah. Program kemudian meminta data baru seperti nama pelanggan, nomor telepon, nomor plat, merek kendaraan, warna kendaraan, jenis
   kendaraan, dan layanan pencucian. Pada contoh, transaksi TR001 diubah menjadi milik pelanggan Hussein dengan kendaraan Honda berwarna
   hitam, jenis motor 125 cc, serta memilih layanan Cuci Reguler Motor dengan harga Rp20.000. Setelah seluruh data baru dimasukkan, program
   menampilkan pesan “Data Berhasil Diubah”.

   <img width="250" height="613" alt="image" src="https://github.com/user-attachments/assets/186cce03-150f-4b88-b8b3-f1b7523b3ea2" />

5. Hapus Data
   Pada menu **Hapus Data Pencucian**, pengguna memasukkan ID transaksi yang ingin dihapus. Sistem mencari transaksi berdasarkan ID
   tersebut. Jika transaksi ditemukan, data akan dihapus dari `ArrayList`. Jika ID tidak ditemukan, sistem akan menampilkan pesan bahwa
   data tidak ditemukan.

   <img width="263" height="284" alt="image" src="https://github.com/user-attachments/assets/8d11618e-05e4-40e1-8009-791c70490ed4" />

6. Keluar Dari Program
   Setelah setiap proses selesai, program kembali menampilkan menu utama sehingga pengguna dapat memilih proses lainnya. Program akan
   terus berjalan selama pengguna belum memilih menu **Keluar**. Ketika pengguna memilih menu keluar, program akan menampilkan pesan
   bahwa program selesai dan menghentikan proses.

   <img width="542" height="285" alt="image" src="https://github.com/user-attachments/assets/eddb6a37-f231-4e37-a6cf-d1e25a5cdf83" />

   

   
