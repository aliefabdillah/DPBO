<?php

class Memory extends Hardware{
    private $frequency = "";
    private $memorySize = "";
    private $supportsCuda = "";

    function __construct()
    {
    }

    function setFrequency($frequency){
        $this->frequency = $frequency;
    }

    function setMemorySize($memorySize){
        $this->memorySize = $memorySize;
    }

    function setSupportsCuda($supportsCuda){
        $this->supportsCuda = $supportsCuda;
    }

    function getFrequency(){
        return $this->frequency;
    }

    function getMemorySize(){
        return $this->memorySize;
    }

    function getSupportsCuda(){
        return $this->supportsCuda;
    }

    function __destruct()
    {
    }
}
?>