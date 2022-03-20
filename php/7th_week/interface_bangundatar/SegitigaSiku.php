<?php

class SegitigaSiku implements BangunDatar{

    function __construct()
    {
        
    }

    function luas($s1, $s2)
    {
        return (0.5 * $s1 * $s2);
    }

    function keliling($s1, $s2)
    {
        return ($s1 + $s2 + sqrt($s1, $s2));
    }

    function __destruct()
    {
        
    }
}
?>