<?php

include "Memory.php";

// instansiasi class
$data = new Memory();
$data->setIdProduct("001");
$data->setPrice(15000000);
$data->setBrand("MacOs");
$data->setModel("Macbook Pro M1");
$data->setFrequency("4200 MHZ");
$data->setMemorySize("32 GB");
$data->setSupportsCuda("True");

echo "========================". "<br/>";
echo "=======Data Product=======". "<br/>";
echo "========================". "<br/>";
echo "1. Id Product   : ". $data->getIdProduct(). "<br/>";
echo "2. Price        : ". $data->getPrice(). "<br/>";
echo "3. Brand        : ". $data->getBrand(). "<br/>";
echo "4. Model        : ". $data->getModel(). "<br/>";
echo "5. Frequency    : ". $data->getFrequency(). "<br/>";
echo "6. Memory Size  : ". $data->getMemorySize(). "<br/>";
echo "7. Support Cuda : ". $data->getSupportsCuda(). "<br/>";

?>