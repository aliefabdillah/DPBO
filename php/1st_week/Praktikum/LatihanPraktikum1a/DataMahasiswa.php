<?php

class DataMahasiswa
{

    //deklarasi private atribut
    private $nim = "";
    private $nama = "";
    private $gender = "";
    private $prodi = "";
    private $semester = 0;

    //constructor masukan
    public function __construct(
        $nim = "", 
        $nama = "", 
        $gender = "", 
        $prodi = "",
        $semester = 0)
    {
        $this->nim = $nim;
        $this->nama = $nama;
        $this->gender = $gender;
        $this->prodi = $prodi;
        $this->semester = $semester;
    }


    //method setter
    public function setNim($paramNim){          //set nim
        $this->nim = $paramNim;
    }

    public function setNama($paramNama){        //set nama 
        $this->nama = $paramNama;
    }

    public function setGender($paramGender){       //set Gender
        $this->gender = $paramGender;
    }

    public function setProdi($paramProdri){         //set prodi
        $this->prodi = $paramProdri;
    }

    public function setSemester($paramSemester){        //set semester
        $this->semester = $paramSemester;
    }

    //method get
    public function getNim(){           //get nim
        return $this->nim;
    }

    public function getNama(){          //get nama
        return $this->nama;
    }

    public function getGender(){        //get gender
        return $this->gender;
    }

    public function getProdi(){         //get prodi
        return $this->prodi;
    }

    public function getSemester(){          //get semester
        return $this->semester;
    }

    
    //destructor
    public function __destruct()
    {
    }
}   

?>