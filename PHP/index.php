<?php
require_once('car.php');
require_once('uberX.php');
require_once('account.php');
require_once('uberPool.php');

$uberX = new UberX("ASD123", new Account("Andres Herrera", "AND897"), "Chevrolet", "Spark");
$uberX->printDataCar();

$uberPool = new UberPool("XFQ76E", new Account("Giovanni Montoya", "1013589331"), "Yamaha", "Fazer");
$uberPool->printDataCar();
?>