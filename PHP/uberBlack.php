<?php
require_once('car.php');
class UberBlack extends Car
{
    public $typeCarAccepted;
    public $seatsMaterial;

    public function __construct($license, $driver, $typeCarAccepted, $seatsMaterial) 
    {
        parent::__construct($license, $driver);  //Equivale a llamar la superclase 
        $this->typeCarAccepted = $typeCarAccepted;
        $this->seatsMaterial = $seatsMaterial;
    }
}
?>