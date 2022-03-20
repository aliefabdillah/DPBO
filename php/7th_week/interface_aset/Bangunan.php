<?php

class Bangunan{

    private $kodeBangunan;
    private $pemilikBangunan;

    function __construct()
    {
        
    }

    function setKodeBangunan($kodeBangunan){
        $this->kodeBangunan = $kodeBangunan;
    }

    function getKodeBangunan(){
        return $this->kodeBangunan;
    }

    function setPemilikBangunan($pemilikBangunan){
        $this->pemilikBangunan = $pemilikBangunan;
    }

    function getPemilikBangunan(){
        $this->pemilikBangunan;
    }

    function __destruct()
    {
        
    }
}

?>