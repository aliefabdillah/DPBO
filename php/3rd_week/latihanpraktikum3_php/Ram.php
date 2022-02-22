<?php

class Ram{
    // implementasi class Ram

    // atribut
    private $ramCapacity = "";
    private $ramPrice = 0;

    //constructor
    function __construct()
    {
    }

    //set and get atribut
    function setRamCapacity($capacity){
        $this->ramCapacity = $capacity;
    }

    function setRamPrice($price){
        $this->ramPrice = $price;
    }

    function getRamCapacity(){
        return $this->ramCapacity;
    }

    function getramPrice(){
        return $this->ramPrice;
    }

    // method print ram
    function printRam(){
        echo "-Data RAM". "<br/>";
        echo " Ram Capacity : ". $this->ramCapacity. "<br/>";
        echo " Harga RAM : ". $this->ramPrice. "<br/>";
        echo "--------------------------------------------". "<br/>";
    }

    //destructor
    function __destruct()
    {
    }
}
?>