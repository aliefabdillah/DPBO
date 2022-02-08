<?php
class Manusia{
    private $nama;
    private $alamat;
    private $no_ktp, $no_telepon;

    function __construct()
    {
    }

    function setNama($nama){
        $this->nama = $nama;
    }

    function setAlamat($alamat){
        $this->alamat = $alamat;
    }

    function setNoKtp($no_ktp){
        $this->no_ktp = $no_ktp;
    }

    function setNoTelepon($no_telepon){
        $this->no_telepon = $no_telepon;
    }

    function getNama(){
        return $this->nama;
    }

    function getAlamat(){
        return $this->alamat;
    }

    function getNoKtp(){
        return $this->no_ktp;
    }

    function getNoTelepon(){
        return $this->no_telepon;
    }

    function __destruct()
    {
    }
}
?>