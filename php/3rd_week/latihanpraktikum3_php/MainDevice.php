<?php

include "Pc.php";

// instansiasi class processor
$dataProc = new Processor();
$dataProc->setName("Intel");
$dataProc->setProcPrice(3200000);

// instansiasi class disk
$dataDisk = new Disk();
$dataDisk->setType("SSD");
$dataDisk->setDiskCapacity("512 GB");
$dataDisk->setDiskPrice(800000);

// instansiasi class ram
$dataRam = new Ram();
$dataRam->setRamCapacity("16 GB");
$dataRam->setRamPrice(1200000);

// instansiasi class pc
$dataPc = new Pc();
$dataPc->setProcObj($dataProc);
$dataPc->setDiskObj($dataDisk);
$dataPc->setRamObj($dataRam);

$dataPc->countTotal();      //method hitung total price
$dataPc->printPc();         //method menampilkan semua data pc

?>