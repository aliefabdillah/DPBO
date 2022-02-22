<?php

include "Processor.php";
include "Disk.php";
include "Ram.php";

class Pc{
    // implementasi class Pc

    // atribut
    private $procObj;
    private $diskObj;
    private $ramObj;
    private $totalPrice = 0;

    //constructor
    function __construct()
    {
    }

    function setProcObj($paramProcObj){
        $this->procObj = $paramProcObj;
    }

    function setDiskObj($paramDiskObj){
        $this->diskObj = $paramDiskObj;
    }

    function setRamObj($paramRamObj){
        $this->ramObj = $paramRamObj;
    }

    function getProcObj(){
        return $this->procObj;
    }

    function getDiskObj(){
        return $this->diskObj;
    }

    function getRamObject(){
        return $this->ramObj;
    }

    function countTotal(){
        $this->totalPrice = $this->procObj->getProcPrice() + $this->diskObj->getDiskPrice() + $this->ramObj->getRamPrice();
    }

    // method print all data
    function printPc(){
        $this->procObj->printProc();
        $this->diskObj->printDisk();
        $this->ramObj->printRam();
        echo "-Data Pc". "<br/>";
        echo " Harga PC : ". $this->totalPrice. "<br/>";
        echo "--------------------------------------------". "<br/>";
    }

    //destructor
    function __destruct()
    {
    }
}
?>