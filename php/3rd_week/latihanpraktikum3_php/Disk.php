<?php

class Disk{
    // implementasi class Disk

    // atribut
    private $type = "";
    private $diskCapacity = "";
    private $diskPrice = 0;

    //constructor
    function __construct()
    {
    }

    //set and get atribut
    function setType($type){
        $this->type = $type;
    }

    function setDiskCapacity($capacity){
        $this->diskCapacity = $capacity;
    }

    function setDiskPrice($price){
        $this->diskPrice = $price;
    }

    function getType(){
        return $this->type;
    }

    function getDiskCapacity(){
        return $this->diskCapacity;
    }

    function getDiskPrice(){
        return $this->diskPrice;
    }

    // method print disk
    function printDisk(){
        echo "-Data Disk". "<br/>";
        echo " Type : ". $this->type. "<br/>";
        echo " Disk Capacity : ". $this->diskCapacity. "<br/>";
        echo " Harga Disk : ". $this->diskPrice. "<br/>";
        echo "--------------------------------------------". "<br/>";
    }

    //destructor
    function __destruct()
    {
    }
}
?>