<?php

class Persegi implements BangunDatar{

    function __construct()
    {
        
    }

    // method pada bangund datar wajib di implementaikan di dalam class

    function luas($s1, $s2)
    {
        return ($s1 * $s2);
    }

    function keliling($s1, $s2)
    {
        return 2 * ($s1 * $s2);
    }

    function __destruct()
    {
        
    }
}
?>