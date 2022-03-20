<?php

// gudang memiliki parent Bangunan dan mengimplementasi dari parent Aset
class Gudang extends Bangunan implements Aset{

    var $kodeAset;
    var $jenisAset;
    var $nilaiAset;
    var $kodeGudang;
    var $namaGudang;
    var $alamatGudang;

    function __construct()
    {
        
    }

    // set and get Aset
    function setKodeAset($kodeAset)
    {
        $this->kodeAset = $kodeAset;
    }

    function getKodeAset()
    {
        return $this->kodeAset;
    }

    function setJenisAset($jenisAset)
    {
        $this->jenisAset = $jenisAset;
    }

    function getJenisAset()
    {
        return $this->jenisAset;
    }

    function setNilaiAset($nilaiAset)
    {
        $this->nilaiAset = $nilaiAset;
    }

    function getNilaiAset()
    {
        return $this->nilaiAset;
    }

    // set and get atribut gudang
    function setKodeGudang($kodeGudang){
        $this->kodeGudang = $kodeGudang;
    }

    function setNamaGudang($namaGudang){
        $this->namaGudang = $namaGudang;
    }

    function setAlamatGudang($alamatGudang){
        $this->alamatGudang = $alamatGudang;
    }

    function getKodeGudang(){
        return $this->kodeGudang;
    }

    function getNamaGudang(){
        return $this->namaGudang;
    }

    function getAlamatGudang(){
        return $this->alamatGudang;
    }

}


?>