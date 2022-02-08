<?php
include "Manusia.php";
include "Karyawan.php";

$kManusia = new Manusia();
$kManusia->setNama("Gina");
$kManusia->setAlamat("Bandung");
$kManusia->setNoKtp("320.120.888");
$kManusia->setNoTelepon("0888888881");

echo $kManusia->getNama(). "<br/>";
echo $kManusia->getAlamat(). "<br/>";
echo $kManusia->getNoKtp(). "<br/>";
echo $kManusia->getNoTelepon(). "<br/>";

$kKaryawan = new Karyawan();
$kKaryawan->setNama("Gina");
$kKaryawan->setAlamat("Bandung");
$kKaryawan->setNoKtp("320.120.888");
$kKaryawan->setNoTelepon("0888888881");
$kKaryawan->setNomorPegawai("111");
$kKaryawan->setDepartemen("Tv");
$kKaryawan->setJabatan("Produser");

echo $kKaryawan->getNama(). "<br/>";
echo $kKaryawan->getAlamat(). "<br/>";
echo $kKaryawan->getNoKtp(). "<br/>";
echo $kKaryawan->getNoTelepon(). "<br/>";
echo $kKaryawan->getNomorPegawai(). "<br/>";
echo $kKaryawan->getJabatan(). "<br/>";
echo $kKaryawan->getDepartemen(). "<br/>";

?>