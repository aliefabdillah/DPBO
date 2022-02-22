<?php

class Matriks {
    private $baris;
    private $kolom;
    private $mat;

    function __construct()
    {   
    }


//    get and set baris
    function setBaris($baris) {
        $this->baris = $baris;
    }

    function getBaris() {
        return $this->baris;
    }

//    get and set kolom
    function setKolom($kolom) {
        $this->kolom = $kolom;
    }

    function getKolom() {
        return $this->kolom;
    }

//    get and set matriks
    function setMat($mat) {
        $this->mat = $mat;
    }

    function getMat() {
        return $this->mat;
    }

//    get and set sel
    function setSel($baris, $kolom, $nilai){
        $this->mat[$baris][$kolom] = $nilai;
    }

    function getSel($baris, $kolom){
        return $this->mat[$baris][$kolom];
    }
}

?>