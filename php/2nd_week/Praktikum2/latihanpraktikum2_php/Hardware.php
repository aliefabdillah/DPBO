<?php

class Hardware extends Product{
    private $brand = "";
    private $model = "";

    function __construct()
    {
    }

    function setBrand($brand){
        $this->brand = $brand;
    }

    function setModel($model){
        $this->model = $model;
    }

    function getBrand(){
        return $this->brand;
    }

    function getModel(){
        return $this->model;
    }

    function __destruct()
    {
    }
}
?>