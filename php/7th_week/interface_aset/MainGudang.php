<?php

$obangunan = new Bangunan();
$ogudang = new Gudang();

// instansiasi class gudang
$obangunan->setKodeBangunan(1);
$obangunan->setPemilikBangunan("PT Bahagia Sejahter");

echo $obangunan->getKodeBangunan(). "<br/>";
echo $obangunan->getPemilikBangunan(). "<br/>";
?>