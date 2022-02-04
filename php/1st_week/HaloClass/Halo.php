<?php
class Halo{
    private $kata = "";

    function __construct(){
        $this->kata = "Halo Dunia!";
    }

    function tulis(){
        echo $this->kata."<br/>";
    }

    function __destruct(){
    }

}
?>