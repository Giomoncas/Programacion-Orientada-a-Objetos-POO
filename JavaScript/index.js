var car = new Car("AWE432", new Account("Andres Herrera", "FER564"));
car.passenger = 4;
car.printDataCar();

var uberX = new UberX("JLU525", new Account("Juan Daniel Romero", "7986547"), "Renault", "Sandero");
UberX.passenger = 5;
UberX.printDataCar();

var paypal = new Paypal("SHAKD", "Ajkas@gmail.com");
paypal.printDataPayment();

var user = new User("Jose Ramirez", "INE001","jose@mail.com", "mypass");
user.printDataAccount();