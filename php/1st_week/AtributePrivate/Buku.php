<?php
class Buku{
    
    //properties awal diset string kosong
    private $judul = "";
    private $pengarang = "";

    //deklarasi properties dengan constructor
    function __construct($j="", $p="")
    {
        $this->judul = $j;
        $this->pengarang = $p;
    }

    //function 
    function setJudul($j=""){
        $this->judul = $j;
    }

    function setPengarang($p=""){
        $this->pengarang = $p;
    }

    function getJudul(){
        return $this->judul;
    }

    function getPengarang(){
        return $this->pengarang;
    }
}
?>