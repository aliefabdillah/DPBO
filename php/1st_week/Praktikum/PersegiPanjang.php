<?php
class PersegiPanjang{
    private $panjang = 0;
    private $lebar = 0;

    public function __construct($panjang = 0, $lebar = 0)
    {
        $this->panjang = $panjang;
        $this->lebar = $lebar;
    }

    public function setPanjang($p){
        $this->panjang = $p;
    }

    public function setLebar($l){
        $this->lebar = $l;
    }

    public function getPanjang(){
        return $this->panjang;
    }

    public function getLebar(){
        return $this->lebar;
    }

    public function keliling(){
        return 2 * ($this->panjang+$this->lebar);
    }

    public function luas(){
        return $this->panjang*$this->lebar;
    }

}

?>