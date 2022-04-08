class UberPool extends Car
{
    String brand;
    String model;

    public UberPool(String license, Account driver, String brand, String model)
    {
        super(license, driver); //Asi se acceden a las propiedades de la superclase
        this.brand = brand;
        this.model = model;        
    }    
}