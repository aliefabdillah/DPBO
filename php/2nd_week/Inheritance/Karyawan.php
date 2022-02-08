<?php
class Karyawan extends Manusia{

    private $nomor_pegawai;
    private $jabatan;
    private $departemen;

    function __construct()
    {
    }

    function setNomorPegawai($nomor){
        $this->nomor_pegawai = $nomor;
    }

    function setJabatan($jabatan){
        $this->jabatan = $jabatan;
    }
    
    function setDepartemen($departemen){
        $this->departemen = $departemen;
    }

    function getNomorPegawai(){
        return $this->nomor_pegawai;
    }

    function getJabatan(){
        return $this->jabatan;
    }
    
    function getDepartemen(){
        return $this->departemen;
    }

    function __destruct()
    {
    }
}

?>