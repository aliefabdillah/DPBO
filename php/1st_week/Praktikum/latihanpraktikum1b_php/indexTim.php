<?php

include "DataTim.php";

echo "----------------------". "<br/>";
//memasukan data pertama ke dalam object
$arrData1 = new DataTim("Persib", "Indonesia", "Bandung", "GBLA", "1933", "Robert", "Victor");
// print data 2
echo "Nama : ". $arrData1->getNama(). "<br/>";
echo "Negara : ". $arrData1->getNegara(). "<br/>";
echo "Kota : ". $arrData1->getKota(). "<br/>";
echo "Kandang : ". $arrData1->getKandang(). "<br/>";
echo "Tahun Berdiri : ". $arrData1->getTahunBerdiri(). "<br/>";
echo "Pelatih : ". $arrData1->getPelatih(). "<br/>";
echo "Kapten : ". $arrData1->getKaptenTim(). "<br/>";
echo "----------------------". "<br/>";
//masukan data ke-2
$arrData2 = new DataTim("Manchester United", "England", "Manchester", "Old Trafford", "1878", "Ragnick", "Maguiare");
//print data 2
echo "Nama : ". $arrData2->getNama(). "<br/>";
echo "Negara : ". $arrData2->getNegara(). "<br/>";
echo "Kota : ". $arrData2->getKota(). "<br/>";
echo "Kandang : ". $arrData2->getKandang(). "<br/>";
echo "Tahun Berdiri : ". $arrData2->getTahunBerdiri(). "<br/>";
echo "Pelatih : ". $arrData2->getPelatih(). "<br/>";
echo "Kapten : ". $arrData2->getKaptenTim(). "<br/>";
echo "----------------------". "<br/>";


?>