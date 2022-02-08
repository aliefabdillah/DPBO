<?php
include "PersegiPanjang.php";

$rectangle1 = new PersegiPanjang();
$rectangle1->setPanjang(6);
$rectangle1->setPanjang(3);

$rectangle2 = new PersegiPanjang(4, 2);

echo "Keliling Persegi Panjang 1 : ". $rectangle1->keliling(). "<br>";
echo "Luas Persegi Panjang 1 : ". $rectangle1->luas(). "<br>";
echo "Keliling Persegi Panjang 2 : ". $rectangle2->keliling(). "<br>";
echo "Luas Persegi Panjang 2 : ". $rectangle2->luas(). "<br>";
?>