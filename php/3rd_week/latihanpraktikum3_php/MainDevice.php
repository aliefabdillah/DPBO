<?php

include "Pc.php";

$dataProc = new Processor();
$dataProc->setName("Intel");
$dataProc->setProcPrice(3200000);

$dataDisk = new Disk();
$dataDisk->setType("SSD");
$dataDisk->setDiskCapacity("512 GB");
$dataDisk->setDiskPrice(800000);

$dataRam = new Ram();
$dataRam->setRamCapacity("16 GB");
$dataRam->setRamPrice(1200000);

$dataPc = new Pc();
$dataPc->setProcObj($dataProc);
$dataPc->setDiskObj($dataDisk);
$dataPc->setRamObj($dataRam);

$dataPc->countTotal();
$dataPc->printPc();

?>