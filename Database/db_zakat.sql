-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 10 Agu 2021 pada 12.45
-- Versi server: 10.4.18-MariaDB
-- Versi PHP: 7.4.16

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_zakat`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_info_beras`
--

CREATE TABLE `tb_info_beras` (
  `jenis` varchar(20) NOT NULL,
  `transaksi_beras` varchar(10) NOT NULL,
  `masuk_beras` varchar(10) NOT NULL,
  `total_beras` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tb_info_beras`
--

INSERT INTO `tb_info_beras` (`jenis`, `transaksi_beras`, `masuk_beras`, `total_beras`) VALUES
('Zakat Beras', '30', '77', 269.5);

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_info_semua`
--

CREATE TABLE `tb_info_semua` (
  `jenis` enum('Zakat Uang','Zakat Beras') NOT NULL,
  `transaksi_semua` varchar(5) NOT NULL,
  `transaksi_beras` varchar(5) NOT NULL,
  `transaksi_uang` varchar(5) NOT NULL,
  `masuk_semua` varchar(5) NOT NULL,
  `masuk_beras` varchar(5) NOT NULL,
  `masuk_uang` varchar(5) NOT NULL,
  `total_beras` varchar(20) DEFAULT NULL,
  `total_uang` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tb_info_semua`
--

INSERT INTO `tb_info_semua` (`jenis`, `transaksi_semua`, `transaksi_beras`, `transaksi_uang`, `masuk_semua`, `masuk_beras`, `masuk_uang`, `total_beras`, `total_uang`) VALUES
('Zakat Uang', '51', '30', '21', '124', '77', '47', '269.5', '1809500'),
('Zakat Beras', '51', '30', '21', '124', '77', '47', '269.5', '1809500');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_info_uang`
--

CREATE TABLE `tb_info_uang` (
  `jenis` varchar(25) NOT NULL,
  `transaksi_uang` varchar(10) NOT NULL,
  `masuk_uang` varchar(10) NOT NULL,
  `total_uang` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tb_info_uang`
--

INSERT INTO `tb_info_uang` (`jenis`, `transaksi_uang`, `masuk_uang`, `total_uang`) VALUES
('Zakat Uang', '21', '47', '1809500');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_mustahiq`
--

CREATE TABLE `tb_mustahiq` (
  `kd_mst` varchar(10) NOT NULL,
  `nama` varchar(25) NOT NULL,
  `usia` varchar(10) NOT NULL,
  `golongan` varchar(20) NOT NULL,
  `alamat` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tb_mustahiq`
--

INSERT INTO `tb_mustahiq` (`kd_mst`, `nama`, `usia`, `golongan`, `alamat`) VALUES
('MST001', 'Ibnu', '65', 'Fakir', 'Kp Rawakalong'),
('MST002', 'Daud', '55', 'Miskin', 'Kp Nusa Indah'),
('MST003', 'Emildo', '55', 'Amil Zakat', 'Kp Kekupu'),
('MST005', 'Wawan', '67', 'Amil Zakat', 'Kp Kedondong 2');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_user`
--

CREATE TABLE `tb_user` (
  `nama` varchar(25) NOT NULL,
  `username` varchar(10) NOT NULL,
  `password` varchar(10) NOT NULL,
  `alamat` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tb_user`
--

INSERT INTO `tb_user` (`nama`, `username`, `password`, `alamat`) VALUES
('indra', 'admin1', '12345', 'Jl. Nangka'),
('Adi', 'admin2', '13089', 'Jl.Merdeka');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_zkt`
--

CREATE TABLE `tb_zkt` (
  `kd_zkt` varchar(20) NOT NULL,
  `tgl` date NOT NULL,
  `nama` varchar(20) NOT NULL,
  `jumlah` varchar(10) NOT NULL,
  `jenis` varchar(20) NOT NULL,
  `total` double NOT NULL,
  `satuan` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tb_zkt`
--

INSERT INTO `tb_zkt` (`kd_zkt`, `tgl`, `nama`, `jumlah`, `jenis`, `total`, `satuan`) VALUES
('ZKT001', '2021-04-13', 'Nando', '3', 'Zakat Beras', 10.5, 'Liter'),
('ZKT002', '2021-04-28', 'Robby', '2', 'Zakat Beras', 7, 'Liter'),
('ZKT003', '2021-04-28', 'Riandi', '5', 'Zakat Beras', 17.5, 'Liter'),
('ZKT004', '2021-04-28', 'Rivaldy', '3', 'Zakat Beras', 10.5, 'Liter'),
('ZKT005', '2021-04-28', 'Yordi', '2', 'Zakat Beras', 7, 'Liter'),
('ZKT006', '2021-04-28', 'Yandi', '3', 'Zakat Uang', 115500, 'Rupiah'),
('ZKT007', '2021-04-28', 'Ardi Alamsyah', '4', 'Zakat Uang', 154000, 'Rupiah'),
('ZKT008', '2021-04-28', 'Yandri Septiawan', '1', 'Zakat Uang', 38500, 'Rupiah'),
('ZKT009', '2021-04-29', 'Jauhari', '2', 'Zakat Beras', 7, 'Liter'),
('ZKT010', '2021-04-29', 'Sony', '7', 'Zakat Beras', 24.5, 'Liter'),
('ZKT011', '2021-04-29', 'Maman Hamdani', '3', 'Zakat Uang', 115500, 'Rupiah'),
('ZKT012', '2021-04-29', 'Rony Sitanggang', '3', 'Zakat Beras', 10.5, 'Liter'),
('ZKT013', '2021-05-04', 'Anam', '3', 'Zakat Uang', 115500, 'Rupiah'),
('ZKT014', '2021-05-04', 'Anis', '3', 'Zakat Beras', 10.5, 'Liter'),
('ZKT015', '2021-05-04', 'www', '2', 'Zakat Uang', 77000, 'Rupiah'),
('ZKT016', '2021-05-07', 'Ramdani', '3', 'Zakat Beras', 10.5, 'Liter'),
('ZKT017', '2021-05-07', 'Donny', '4', 'Zakat Uang', 154000, 'Rupiah'),
('ZKT018', '2021-05-07', 'Harun', '4', 'Zakat Beras', 14, 'Liter'),
('ZKT019', '2021-05-07', 'Randy', '2', 'Zakat Uang', 77000, 'Rupiah'),
('ZKT020', '2021-05-07', 'Budi', '3', 'Zakat Uang', 115500, 'Rupiah'),
('ZKT021', '2021-05-07', 'Boby Satria', '2', 'Zakat Beras', 7, 'Liter'),
('ZKT022', '2021-05-09', 'Rama Donny Alamsyah', '3', 'Zakat Beras', 10.5, 'Liter'),
('ZKT023', '2021-05-09', 'sss', '1', 'Zakat Uang', 38500, 'Rupiah'),
('ZKT024', '2021-05-09', 'Robby', '2', 'Zakat Uang', 77000, 'Rupiah'),
('ZKT025', '2021-06-01', 'Indra', '2', 'Zakat Beras', 7, 'Liter'),
('ZKT026', '2021-05-17', 'Adi', '1', 'Zakat Uang', 38500, 'Rupiah'),
('ZKT027', '2021-05-18', 'Boby', '3', 'Zakat Beras', 10.5, 'Liter'),
('ZKT028', '2021-05-18', 'Ramandani', '3', 'Zakat Beras', 10.5, 'Liter'),
('ZKT029', '2021-05-20', 'Indra', '3', 'Zakat Beras', 10.5, 'Liter'),
('ZKT030', '2021-05-26', 'Jofri', '4', 'Zakat Uang', 154000, 'Rupiah'),
('ZKT031', '2021-05-26', 'wawa', '1', 'Zakat Uang', 38500, 'Rupiah'),
('ZKT032', '2021-05-27', 'Widodo', '3', 'Zakat Beras', 10.5, 'Liter'),
('ZKT033', '2021-06-04', 'Raffika', '2', 'Zakat Uang', 77000, 'Rupiah'),
('ZKT034', '2021-06-04', 'Danny Saputra', '2', 'Zakat Beras', 7, 'Liter'),
('ZKT035', '2021-06-04', 'Boby', '3', 'Zakat Uang', 115500, 'Rupiah'),
('ZKT036', '2021-06-04', 'Munawar', '2', 'Zakat Uang', 77000, 'Rupiah'),
('ZKT037', '2021-06-04', 'Yaya', '1', 'Zakat Uang', 38500, 'Rupiah'),
('ZKT038', '2021-06-04', 'Taure', '1', 'Zakat Beras', 3.5, 'Liter'),
('ZKT039', '2021-06-04', 'Sergio', '1', 'Zakat Beras', 3.5, 'Liter'),
('ZKT040', '2021-06-04', 'Danu', '1', 'Zakat Beras', 3.5, 'Liter'),
('ZKT041', '2021-06-04', 'Yuhana', '1', 'Zakat Beras', 3.5, 'Liter'),
('ZKT042', '2021-06-04', 'Yodi', '2', 'Zakat Beras', 7, 'Liter'),
('ZKT043', '2021-06-04', 'Rian', '1', 'Zakat Beras', 3.5, 'Liter'),
('ZKT044', '2021-06-04', 'Lala', '1', 'Zakat Beras', 3.5, 'Liter'),
('ZKT045', '2021-06-04', 'yaa', '1', 'Zakat Beras', 3.5, 'Liter'),
('ZKT046', '2021-06-04', 'Ramos', '2', 'Zakat Uang', 77000, 'Rupiah'),
('ZKT047', '2021-06-04', 'Junior', '1', 'Zakat Uang', 38500, 'Rupiah'),
('ZKT048', '2021-07-31', 'Indra', '3', 'Zakat Beras', 10.5, 'Liter'),
('ZKT049', '2021-07-31', 'Adi', '2', 'Zakat Uang', 77000, 'Rupiah'),
('ZKT050', '2021-08-08', 'Zaidul', '5', 'Zakat Beras', 17.5, 'Liter'),
('ZKT051', '2021-08-09', 'Alfian', '2', 'Zakat Beras', 7, 'Liter');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `tb_mustahiq`
--
ALTER TABLE `tb_mustahiq`
  ADD PRIMARY KEY (`kd_mst`);

--
-- Indeks untuk tabel `tb_zkt`
--
ALTER TABLE `tb_zkt`
  ADD PRIMARY KEY (`kd_zkt`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
