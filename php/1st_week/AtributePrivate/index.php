<?php
 include "Buku.php";

 //membuat object dengan kata kunci new Buku (dari class Buku)
 $b2 = new Buku("J2EE", "Orang1");

 //memanggil fungsi getJudul
 //kata kunci echo dipakai untuk print
 echo $b2->getJudul(). "<br/>";
 //memanggil fungsi getPengarang
 echo $b2->getPengarang(). "<br/>";

?>