<?php

//memanggil header Class
include "DataMahasiswa.php";

$data = new DataMahasiswa();            //inisilaisasi object dari class DataMahasiswa

//memasukan data kedalam class
$data->setNim("2003623");
$data->setNama("Alief Muhammad Abdillah");
$data->setGender("Laki-Laki");
$data->setProdi("Ilmu Komputer");
$data->setSemester(3);

//print hasil
echo "Nim : ". $data->getNim(). "<br/>";
echo "Nama : ". $data->getNama(). "<br/>";
echo "Gender : ". $data->getGender(). "<br/>";
echo "Prodi : ". $data->getProdi(). "<br/>";
echo "Semester : ". $data->getSemester(). "<br/>";
?>