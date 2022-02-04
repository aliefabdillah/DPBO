<?php
class Titik{

    private $x;     //koordinat x
    private $y;     //koordinat y

    //constructor pada php hanya boleh ada 1
    public function __construct(){
        //untuk awalan diset dlu 0
        $this->x = 0;
        $this->y = 0;
    }

    //fungsi setter
    public function setX($xp){
        //set nilai x
        $this->x = $xp;
    }

    public function setY($yp){
        //set nilai y
        $this->y = $yp;
    }

    //fungsi get
    public function getX(){
        return $this->x;
    }

    public function getY(){
        return $this->y;
    }

    //destructor
    // public __destruct(), tidak wajib ada
}
?>