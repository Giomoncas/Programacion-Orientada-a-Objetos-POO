class Main 
{
    public static void main(String[] args) 
    {        
        Car car = new Car("ABC-123", new Account("Andres Herrera", "AND123"));  //Metodo constructor       
        car.passenger = 4;
        car.printDataCar();  //Utiliza el metodo de la clase Car para imprimir las propiedades     
        
        Car car2 = new Car("XYZ-987", new Account("Juan Perez", "JPE123"));  //Metodo constructor        
        car2.passenger = 3;
        car2.printDataCar(); //Utiliza el metodo de la clase Car para imprimir las propiedades  
    }
};