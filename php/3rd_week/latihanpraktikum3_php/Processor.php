<?php

class Processor{
    // implementasi class processor

    // atribut
    private $name = "";
    private $procPrice = 0;

    //constructor
    function __construct()
    {
    }

    //set and get atribut
    function setName($name){
        $this->name = $name;
    }

    function setProcPrice($price){
        $this->procPrice = $price;
    }

    function getName(){
        return $this->name;
    }

    function getProcPrice(){
        return $this->procPrice;
    }

    // method print
    function printProc(){
        echo "-Data Processor". "<br/>";
        echo " Nama Processor : ". $this->name. "<br/>";
        echo " Harga Processor : ". $this->procPrice. "<br/>";
        echo "--------------------------------------------". "<br/>";
    }

    //destructor
    function __destruct()
    {
    }
}
?>