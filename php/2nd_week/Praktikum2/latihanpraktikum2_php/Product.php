<?php

class Product{
    private $idProduct = "";
    private $price = 0;

    function __construct()
    {
    }

    function setIdProduct($idProduct){
        $this->idProduct = $idProduct;
    }

    function setPrice($price){
        $this->price = $price;
    }

    function getIdProduct(){
        return $this->idProduct;
    }

    function getPrice(){
        return $this->price;
    }

    function __destruct()
    {
    }
}
?>